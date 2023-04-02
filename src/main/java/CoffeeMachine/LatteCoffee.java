/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class LatteCoffee extends Drink {

    public LatteCoffee(String coffeeType, String CoffeeSize) {
        super(coffeeType, CoffeeSize);
    }

    @Override
    public void makeLatte(CoffeeGrinder grinder, MilkTank milk) {
        grinder.updateGroundCoffee(10);
        milk.updateMilkCapacity(40);
    }

    @Override
    public void getLatteInfo(String grindSize) {
        super.getLatteInfo(grindSize);
    }

}
