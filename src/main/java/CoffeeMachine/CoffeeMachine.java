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

    private final WaterTank water = new WaterTank(1000);
    private final MilkTank milk = new MilkTank(800);
    private final CoffeeBeansContainer beans = new CoffeeBeansContainer(250, 0);
    private final CoffeeGrinder grinder = new CoffeeGrinder("soft", beans);
    private final WasteTank waste = new WasteTank(20);

    public void newLatteCoffee(String coffeeType, String coffeeSize, String GrindSize) {
        Drink latte = new LatteCoffee(coffeeType, coffeeSize);
        if (grinder.getGroundCoffee() <= 10) {
            throw new OutOfGroundCoffeeException();
        } else {
            latte.makeLatte(grinder, milk);
            waste.updateWasteCapacity(1);
            latte.getLatteInfo(GrindSize);
        }
    }

    public void newCoffeeCup(String coffeeType, String coffeeSize, String grindSize) {
        if (grinder.getGroundCoffee() <= 7 && coffeeSize.equals("Single shot") || grinder.getGroundCoffee() <= 14 && coffeeSize.equals("Double shot")) {
            throw new OutOfGroundCoffeeException();
        } else {
            if (coffeeType.equals("Espresso")) {
                Drink espresso = new EspressoCoffee(coffeeType, coffeeSize);
                espresso.makeCoffee(grinder, water);
                waste.updateWasteCapacity(1);
                espresso.getCoffeeInfo(grindSize);

            } else if (coffeeType.equals("Americano")) {
                Drink americano = new AmericanoCoffee(coffeeType, coffeeSize);
                americano.makeCoffee(grinder, water);
                waste.updateWasteCapacity(1);
                americano.getCoffeeInfo(grindSize);
            }
        }
    }

    public void grindCoffee(int Beans) {
        grinder.setGroundCoffee(Beans);
    }

    public void addWaterToTheTank() {
            Scanner input = new Scanner(System.in);
            int amountOfWater = input.nextInt();
            water.setWaterCapacity(amountOfWater);
    }

    public void addBeansToTheContainer() {
            Scanner input = new Scanner(System.in);
            int amountOfBeans = input.nextInt();
            beans.setBeansCapacity(amountOfBeans);
    }

    public int GetWaterCapacity() {
        return water.getWaterCapacity();
    }

    public int GetBeansCapacity() {
        return beans.getBeansCapacity();
    }

    public int GetGroundPowder() {
        return grinder.getGroundCoffee();
    }

    public int GetMilkCapacity() {
        return milk.getMilkCapacity();
    }

    public int GetWasteCapacity() {
        return waste.getCapacity();
    }

    public void SetWaterCapacity(int waterToAdd) {
        water.setWaterCapacity(waterToAdd);
    }

    public void SetBeansCapacity(int beansToAdd) {
        beans.setBeansCapacity(beansToAdd);
    }

    public void SetMilkCapacity(int milkToAdd) {
        milk.setMilkCapacity(milkToAdd);
    }

    public void SetWaste(int wasteReset) {
        waste.setCapacity(wasteReset);
    }
}
