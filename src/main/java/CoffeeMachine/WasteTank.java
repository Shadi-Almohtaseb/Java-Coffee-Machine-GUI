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
public class WasteTank {
    private int capacity;

    public WasteTank(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void updateWasteCapacity(int waste) {
         if (this.capacity >= waste) {
            this.capacity -= waste;
        } else {
             throw new OverFlowWasteException();
        }
    }
}
