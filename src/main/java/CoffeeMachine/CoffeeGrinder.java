/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class CoffeeGrinder {
    private String GrindSize;
    private int GroundCoffee;
    private CoffeeBeansContainer beans;

    public CoffeeGrinder(String grindSize, CoffeeBeansContainer beans) {
        this.GrindSize = grindSize;
        this.beans = beans;
    }

    public void setGroundCoffee(int Beans) {
        this.GroundCoffee += Beans;
        this.beans.updateBeansCapacity(Beans);
    }

    public void updateGroundCoffee(int usedPowder) {
        if (usedPowder < 0) {
            System.out.println("The value must be positive");
            // throw new OutOfWaterException();
        } else if (usedPowder <= this.GroundCoffee) {
            this.GroundCoffee -= usedPowder;
        } else {
            System.out.println("\n\nThere is not much Ground beans!");
            System.out.println("You have only: " + this.GroundCoffee + " gram of Ground beans");
        }
    }

    public int getGroundCoffee() {
        return GroundCoffee;
    }

    public String getGrindSize() {
        return GrindSize;
    }

    public void setGrindSize(String grindSize) {
        this.GrindSize = grindSize;
    }

    public void getInfo() {
        System.out.println("Grind size: " + this.GrindSize + "\nGround Coffee Powder: " + this.GroundCoffee
                + "\nBeans: " + this.beans.getBeansCapacity());
    }

}
