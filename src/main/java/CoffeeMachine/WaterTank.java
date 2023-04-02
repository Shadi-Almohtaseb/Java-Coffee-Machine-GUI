/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class WaterTank {
    private int WaterCapacity;

    public WaterTank(int WaterCapacity) {
        this.WaterCapacity = WaterCapacity;
    }

    public int getWaterCapacity() {
        return WaterCapacity;
    }

    public void setWaterCapacity(int WaterCapacity)  {
        this.WaterCapacity += WaterCapacity;
    }

    public void updatedWaterCapacity(int usedWater)  {
        if (this.WaterCapacity >= usedWater) {
            this.WaterCapacity -= usedWater;
        } else {
            JOptionPane.showMessageDialog(null, """
               There is not much water! start fill with some.
               Your water tank capacity is only: """ + this.WaterCapacity + "  ml");
        }
    }

    public void getInfo() {
        System.out.println("Water capacity: " + this.WaterCapacity);
    }

}
