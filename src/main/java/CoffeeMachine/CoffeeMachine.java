/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
import CoffeeMachine.Exceptions.OutOfGroundCoffeeException;
import java.util.Scanner;

public class CoffeeMachine {

    private final FileLogger logger;

    private WaterTank water = null;
    private MilkTank milk = null;
    private CoffeeBeansContainer beans = null;
    private CoffeeGrinder grinder = null;
    private WasteTank waste = null;

    private double caffeine = 0;
    private String coffeeInfo;

    public CoffeeMachine(FileLogger logger) {
        this.logger = logger;
        water = new WaterTank(1000, logger);
        milk = new MilkTank(800, logger);
        beans = new CoffeeBeansContainer(100, 100, logger);
        grinder = new CoffeeGrinder("soft", beans, logger);
        waste = new WasteTank(20, logger);
    }

    public void newLatteCoffee(int arabica, String coffeeType, String coffeeSize, String grindSize) {
        double usedArabica, usedRobusta;

        usedArabica = ((arabica * 10.0) / 100.0);
        usedRobusta = (10.0 - usedArabica);

        caffeine = (usedArabica * 12) + (usedRobusta * 17);

        grinder.updateArabicaGroundCoffee(usedArabica);
        grinder.updateRobustaGroundCoffee(usedRobusta);

        Drink latte = new LatteCoffee(coffeeType, coffeeSize);

        if (grinder.getArabicaGroundCoffee() <= usedArabica || grinder.getRobustaGroundCoffee() <= usedRobusta) {
            throw new OutOfGroundCoffeeException();
        } else {
            latte.makeLatte(grinder, milk);
            waste.updateWasteCapacity(1);
            toString(latte, grindSize, caffeine, usedArabica, usedRobusta);
            logger.log("Order coffee: " + latte.getCoffeeInfo(grindSize, caffeine, usedArabica, usedRobusta));
        }
    }

    public void newCoffeeCup(int arabica, String coffeeType, String coffeeSize, String grindSize) {
        double usedArabica = 0, usedRobusta = 0;
        if ("single shot".equals(coffeeSize)) {
            
            usedArabica = (arabica * 7.0) / 100.0;
            usedRobusta = 7 - usedArabica;

            caffeine = (usedArabica * 12) + (usedRobusta * 17);

            grinder.updateArabicaGroundCoffee(usedArabica);
            grinder.updateRobustaGroundCoffee(usedRobusta);

        } else if ("double shot".equals(coffeeSize)) {
            usedArabica = (arabica * 14.0) / 100.0;
            usedRobusta = 14 - usedArabica;

            caffeine = (usedArabica * 12) + (usedRobusta * 17);

            grinder.updateArabicaGroundCoffee(usedArabica);
            grinder.updateRobustaGroundCoffee(usedRobusta);
        }

        if (grinder.getArabicaGroundCoffee() <= usedArabica || grinder.getRobustaGroundCoffee() <= usedRobusta) {
            throw new OutOfGroundCoffeeException();
        } else {
            if (coffeeType.equals("Espresso")) {
                Drink espresso = new EspressoCoffee(coffeeType, coffeeSize);
                espresso.makeCoffee(water);
                waste.updateWasteCapacity(1);
                toString(espresso, grindSize, caffeine, usedArabica, usedRobusta);
                logger.log("Order coffee: " + espresso.getCoffeeInfo(grindSize, caffeine, usedArabica, usedRobusta));

            } else if (coffeeType.equals("Americano")) {
                Drink americano = new AmericanoCoffee(coffeeType, coffeeSize);
                americano.makeCoffee(water);
                waste.updateWasteCapacity(1);
                toString(americano, grindSize, caffeine, usedArabica, usedRobusta);
                logger.log("Order coffee: " + americano.getCoffeeInfo(grindSize, caffeine, usedArabica, usedRobusta));
            }
        }
    }

    public void grindArabicaCoffee(int Beans) {
        grinder.setArabicaGroundCoffee(Beans);
    }

    public void grindRobustaCoffee(int Beans) {
        grinder.setRobustaGroundCoffee(Beans);
    }

    public void addWaterToTheTank() {
        Scanner input = new Scanner(System.in);
        int amountOfWater = input.nextInt();
        water.setWaterCapacity(amountOfWater);
    }

    public void addArabicaBeansToTheContainer() {
        Scanner input = new Scanner(System.in);
        int amountOfBeans = input.nextInt();
        beans.setArabicaBeansCapacity(amountOfBeans);
    }

    public void addRobustaBeansToTheContainer() {
        Scanner input = new Scanner(System.in);
        int amountOfBeans = input.nextInt();
        beans.setRobustaBeansCapacity(amountOfBeans);
    }

    public double GetCaffeine() {
        return caffeine;
    }

    public int GetArabicaBeansCapacity() {
        return beans.getArabicaBeansCapacity();
    }

    public int GetRobustaBeansCapacity() {
        return beans.getRobustaBeansCapacity();
    }

    public double GetArabicaGroundPowder() {
        return grinder.getArabicaGroundCoffee();
    }

    public double GetRobustaGroundPowder() {
        return grinder.getRobustaGroundCoffee();
    }

    public int GetMilkCapacity() {
        return milk.getMilkCapacity();
    }

    public int GetWasteCapacity() {
        return waste.getCapacity();
    }

    public int GetWaterCapacity() {
        return water.getWaterCapacity();
    }

    /**
     *
     * @param drink
     * @param GrindSize
     * @param caffeine
     * @param arabica
     * @param robusta
     */
    public void toString(Drink drink, String GrindSize, double caffeine, double arabica, double robusta) {
        coffeeInfo = drink.getCoffeeInfo(GrindSize, caffeine, arabica, robusta);
    }

    public String GetCoffeeInformation() {
        return coffeeInfo;
    }

    public void SetArabicaBeansCapacity(int arabicaBeansToAdd) {
        beans.setArabicaBeansCapacity(arabicaBeansToAdd);
    }

    public void SetRobustaBeansCapacity(int robustaBeansToAdd) {
        beans.setRobustaBeansCapacity(robustaBeansToAdd);
    }

    public void SetWaterCapacity(int waterToAdd) {
        water.setWaterCapacity(waterToAdd);
    }

    public void SetMilkCapacity(int milkToAdd) {
        milk.setMilkCapacity(milkToAdd);
    }

    public void SetWaste(int wasteReset) {
        waste.setCapacity(wasteReset);
    }
}
