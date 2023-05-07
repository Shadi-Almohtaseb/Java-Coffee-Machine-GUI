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
        milk.updateMilkCapacity(40);
//        grinder.updateGroundCoffee(10);
    }

    public void getInfo(String GrindSize, double caffeine, double arabica, double robusta) {
        super.getCoffeeInfo(GrindSize, caffeine, arabica, robusta); 
    }
}
