/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class EspressoCoffee extends Drink {

    public EspressoCoffee(String coffeeType, String CoffeeSize) {
        super(coffeeType, CoffeeSize);
    }

    @Override
    public void makeCoffee(CoffeeGrinder grinder, WaterTank water) {
        if ((super.getCoffeeType().equals("Espresso")  && super.getCoffeeSize().equals("single shot")) ) {
            water.updatedWaterCapacity(30);
            grinder.updateGroundCoffee(7);
        } else if (super.getCoffeeType().equals("Espresso") && super.getCoffeeSize().equals("double shot")) {
            water.updatedWaterCapacity(60);
            grinder.updateGroundCoffee(14);
        } else {
            System.out.println("Invalid option!");
        }
    }

    public void getInfo(String GrindSize) {
        super.getCoffeeInfo(GrindSize);
    }

}
