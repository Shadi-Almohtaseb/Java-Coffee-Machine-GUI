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
    private final FileLogger logger;

    public MilkTank(int MilkCapacity, FileLogger logger) {
        this.MilkCapacity = MilkCapacity;
        this.logger = logger;
    }

    public int getMilkCapacity() {
        return MilkCapacity;
    }

    public void setMilkCapacity(int MilkToAdd) {
        if (MilkToAdd + this.MilkCapacity <= 800) {
            this.MilkCapacity += MilkToAdd;
             logger.log("You added: " + MilkToAdd + " ml of Milk");
        } else {
            throw new OverFlowMilkException();
        }
    }

    public void updateMilkCapacity(int usedMilk) {
        if (this.MilkCapacity >= usedMilk) {
            this.MilkCapacity -= usedMilk;
             logger.log("You used: " + usedMilk + " ml of Milk");
        } else {
            throw new OutOfMilkException();
        }
    }

    public void getInfo() {
        JOptionPane.showMessageDialog(null, "Milk capacity: " + this.MilkCapacity);
    }

}
