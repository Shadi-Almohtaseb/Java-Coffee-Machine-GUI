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
    public void makeCoffee( WaterTank water) {
        if ((super.getCoffeeType().equals("Americano") && super.getCoffeeSize().equals("single shot"))) {
            water.updatedWaterCapacity(170);
//            grinder.updateGroundCoffee(7);
        } else if (super.getCoffeeType().equals("Americano") && super.getCoffeeSize().equals("double shot")) {
            water.updatedWaterCapacity(220);
//            grinder.updateGroundCoffee(14);
        }
    }

    public void getInfo(String GrindSize, double caffeine, double arabica, double robusta) {
        super.getCoffeeInfo(GrindSize, caffeine, arabica ,robusta);
    }
}