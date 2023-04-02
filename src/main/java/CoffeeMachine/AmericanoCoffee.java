/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class AmericanoCoffee extends Drink {

    public AmericanoCoffee(String coffeeType, String CoffeeSize) {
        super(coffeeType, CoffeeSize);
    }


    @Override
    public void makeCoffee(CoffeeGrinder grinder, WaterTank water) {
        if ((super.getCoffeeType().equals("Americano") && super.getCoffeeSize().equals("single shot"))) {
            grinder.updateGroundCoffee(7);
            water.updatedWaterCapacity(170);
        } else if (super.getCoffeeType().equals("Americano") && super.getCoffeeSize().equals("double shot")) {
            grinder.updateGroundCoffee(14);
            water.updatedWaterCapacity(220);
        }
    }

    public void getInfo(String GrindSize) {
        super.getCoffeeInfo(GrindSize);
    }
}