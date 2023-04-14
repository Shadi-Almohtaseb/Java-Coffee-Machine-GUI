/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import CoffeeMachine.Exceptions.OverFlowMilkException;
import CoffeeMachine.Exceptions.OutOfMilkException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MilkTank {

    private int MilkCapacity;

    public MilkTank(int MilkCapacity) {
        this.MilkCapacity = MilkCapacity;
    }

    public int getMilkCapacity() {
        return MilkCapacity;
    }

    public void setMilkCapacity(int MilkToAdd) {
        if (MilkToAdd + this.MilkCapacity <= 800) {
            this.MilkCapacity += MilkToAdd;
        } else {
            throw new OverFlowMilkException();
        }
    }

    public void updateMilkCapacity(int usedMilk) {
        if (this.MilkCapacity >= usedMilk) {
            this.MilkCapacity -= usedMilk;
        } else {
            throw new OutOfMilkException();
        }
    }

    public void getInfo() {
        System.out.println("Milk capacity: " + this.MilkCapacity);
        JOptionPane.showMessageDialog(null, "Milk capacity: " + this.MilkCapacity);
    }

}
