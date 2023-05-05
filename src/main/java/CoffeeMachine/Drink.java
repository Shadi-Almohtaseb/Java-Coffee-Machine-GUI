/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public abstract class Drink {
    private String CoffeeType;
    private String CoffeeSize;

    public Drink(String coffeeType, String CoffeeSize) {
        this.CoffeeType = coffeeType;
        this.CoffeeSize = CoffeeSize;

    }

    public void makeCoffee( WaterTank water) {
    }

    public void makeLatte(CoffeeGrinder grinder, MilkTank milk) {

    }

    public String getCoffeeSize() {
        return CoffeeSize;
    }

    public String getCoffeeType() {
        return CoffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.CoffeeType = coffeeType;
    }

    public void setCoffeeSize(String coffeeSize) {
        this.CoffeeSize = coffeeSize;
    }

    public void getCoffeeInfo(String GrindSize) {
        JOptionPane.showMessageDialog(null, "Coffee type: " + CoffeeType +
                        "\nCoffee size: " + CoffeeSize +
                        "\nCoffee powder: " + GrindSize 
//                        "\n\nGround coffee Powder: " + grinder.getGroundCoffee() + "g" +
//                        "\nWater Tank: " + water.getWaterCapacity() + "ml" +
//                        "\nBeans Container: " + beans.getBeansCapacity() + "g"
        );
    }

    public void getLatteInfo(String GrindSize) {
        JOptionPane.showMessageDialog(null, "Coffee type: " + CoffeeType +
                        "\nCoffee size: " + CoffeeSize +
                        "\nCoffee powder: " + GrindSize );
    }
}