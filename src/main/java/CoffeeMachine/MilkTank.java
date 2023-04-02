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
public class MilkTank {
    private int MilkCapacity;

    public MilkTank(int MilkCapacity) {
        this.MilkCapacity = MilkCapacity;
    }

    public int getMilkCapacity() {
        return MilkCapacity;
    }

    public void setMilkCapacity(int MilkCapacity) {
        this.MilkCapacity += MilkCapacity;
    }

    public void updateMilkCapacity(int usedMilk) {
        if (this.MilkCapacity >= usedMilk) {
            this.MilkCapacity -= usedMilk;
        } else {
            JOptionPane.showMessageDialog(null, """
               There is not much milk! start fill with some.
               Your milk tank capacity is only: """ + this.MilkCapacity + "  ml");
        }
    }

    public void getInfo() {
        System.out.println("Milk capacity: " + this.MilkCapacity);
    }

}
