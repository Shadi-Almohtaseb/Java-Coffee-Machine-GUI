/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import CoffeeMachine.Exceptions.OutOfGroundCoffeeException;
import CoffeeMachine.Exceptions.OutOfBeansException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CoffeeGrinder {

    private String GrindSize;
    private int GroundCoffee;
    private final CoffeeBeansContainer beans;

    public CoffeeGrinder(String grindSize, CoffeeBeansContainer beans) {
        this.GrindSize = grindSize;
        this.beans = beans;
    }

    public void setGroundCoffee(int Beans) {
        if (Beans <= beans.getBeansCapacity()) {
            this.GroundCoffee += Beans;
            this.beans.updateBeansCapacity(Beans);
        } else {
            throw new OutOfBeansException();
        }
    }

    public void updateGroundCoffee(int usedPowder) {
        if (usedPowder <= this.GroundCoffee) {
            this.GroundCoffee -= usedPowder;
        } else {
            throw new OutOfGroundCoffeeException();
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
        JOptionPane.showMessageDialog(null,
                "Grind size: " + this.GrindSize + "\nGround Coffee Powder: " + this.GroundCoffee
                + "\nBeans: " + this.beans.getBeansCapacity());
    }

}
