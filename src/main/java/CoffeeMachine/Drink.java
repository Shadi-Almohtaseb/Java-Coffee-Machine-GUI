/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public abstract class Drink {

    private String CoffeeType;
    private String CoffeeSize;
    private static DecimalFormat df = new DecimalFormat("#.##");

    public Drink(String coffeeType, String CoffeeSize) {
        this.CoffeeType = coffeeType;
        this.CoffeeSize = CoffeeSize;

    }

    public void makeCoffee(WaterTank water) {
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

    public String getCoffeeInfo(String GrindSize, double Caffeine, double arabica, double robusta) {
        String CoffeeInfo
                = "\ncoffee cup has: " +df.format(arabica) + "gram Arabica\n"
                +" And "+ df.format(robusta) + " gram Robusta."
                + "\nCoffee Type: " + CoffeeType
                + "\nCoffee Size: " + CoffeeSize
                + "\nCoffee Powder: " + GrindSize
                + "\nCaffeine amount: " + df.format(Caffeine)  + " mg";
        return CoffeeInfo;
    }
}
