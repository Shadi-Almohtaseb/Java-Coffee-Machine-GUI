/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import CoffeeMachine.Exceptions.OverFlowWasteException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class WasteTank {
    private int capacity;
    private final FileLogger logger;

    public WasteTank(int capacity, FileLogger logger) {
        this.capacity = capacity;
        this.logger = logger;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
         logger.log("You have cleand the waste tank");
    }
    
    public void updateWasteCapacity(int waste) {
         if (this.capacity >= waste) {
            this.capacity -= waste;
        } else {
             throw new OverFlowWasteException();
        }
    }
}
