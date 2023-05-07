/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import CoffeeMachine.Exceptions.OverFlowWaterException;
import CoffeeMachine.Exceptions.OutOfWaterException;

/**
 *
 * @author user
 */
public class WaterTank {
    private int WaterCapacity;
    private final FileLogger logger;

    public WaterTank(int WaterCapacity, FileLogger logger) {
        this.WaterCapacity = WaterCapacity;
        this.logger = logger;
    }

    public int getWaterCapacity() {
        return WaterCapacity;
    }

    public void setWaterCapacity(int amountOfWater)  {
         if (this.WaterCapacity + amountOfWater <= 1000) {
            this.WaterCapacity += amountOfWater;
            logger.log("You added: " + amountOfWater + " ml of Water");
        } else {
             throw new OverFlowWaterException();
         }
    }

    public void updatedWaterCapacity(int usedWater)    {
        if (this.WaterCapacity >= usedWater) {
            this.WaterCapacity -= usedWater;
            logger.log("You used: " + usedWater + " ml of Water");
        } else {
            throw new OutOfWaterException();
        }
    }

    public void getInfo() {
        System.out.println("Water capacity: " + this.WaterCapacity);
    }

}
