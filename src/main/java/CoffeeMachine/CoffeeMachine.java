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
import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeMachine {

    private final WaterTank water = new WaterTank(1000);
    private final MilkTank milk = new MilkTank(800);
    private final CoffeeBeansContainer beans = new CoffeeBeansContainer(100, 100);
    private final CoffeeGrinder grinder = new CoffeeGrinder("soft", beans);
    private final WasteTank waste = new WasteTank(20);

    private static DecimalFormat df = new DecimalFormat("#.##");

    public void newLatteCoffee(int arabica, String coffeeType, String coffeeSize, String GrindSize) {
        double usedArabica, usedRobusta;

        usedArabica = ((arabica * 10.0) / 100.0);
        usedRobusta = (10.0 - usedArabica);

        df.format(usedArabica);
        df.format(usedRobusta);

        grinder.updateArabicaGroundCoffee(usedArabica);
        grinder.updateRobustaGroundCoffee(usedRobusta);

        Drink latte = new LatteCoffee(coffeeType, coffeeSize);

        if (grinder.getArabicaGroundCoffee() <= usedArabica || grinder.getRobustaGroundCoffee() <= usedRobusta) {
            throw new OutOfGroundCoffeeException();
        } else {
            latte.makeLatte(grinder, milk);
            waste.updateWasteCapacity(1);
            latte.getLatteInfo(GrindSize);
        }
    }

    public void newCoffeeCup(int arabica, String coffeeType, String coffeeSize, String grindSize) {
        double usedArabica = 0, usedRobusta = 0;
//        double caffeine;
        if ("single shot".equals(coffeeSize)) {
            usedArabica = (arabica * 7.0) / 100.0;
            usedRobusta = 7 - usedArabica;
            
            df.format(usedArabica);
            df.format(usedRobusta);

//            caffeine = usedArabica
            grinder.updateArabicaGroundCoffee(usedArabica);
            grinder.updateRobustaGroundCoffee(usedRobusta);

        } else if ("double shot".equals(coffeeSize)) {
            usedArabica = (arabica * 14.0) / 100.0;
            usedRobusta = 14 - usedArabica;

            df.format(usedArabica);
            df.format(usedRobusta);

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
                espresso.getCoffeeInfo(grindSize);

            } else if (coffeeType.equals("Americano")) {
                Drink americano = new AmericanoCoffee(coffeeType, coffeeSize);
                americano.makeCoffee(water);
                waste.updateWasteCapacity(1);
                americano.getCoffeeInfo(grindSize);
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
