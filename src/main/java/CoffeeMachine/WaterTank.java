/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

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

    public void setWaterCapacity(int amountOfWater)  {
         if (this.WaterCapacity + amountOfWater <= 1000) {
            this.WaterCapacity += amountOfWater;
        } else {
             throw new OverFlowWaterException();
         }
    }

    public void updatedWaterCapacity(int usedWater)    {
        if (this.WaterCapacity >= usedWater) {
            this.WaterCapacity -= usedWater;
        } else {
            throw new OutOfWaterException();
        }
    }

    public void getInfo() {
        System.out.println("Water capacity: " + this.WaterCapacity);
    }

}
