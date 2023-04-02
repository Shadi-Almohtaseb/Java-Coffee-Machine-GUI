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
public class CoffeeBeansContainer {
    private int BeansCapacity;

    public CoffeeBeansContainer(int beansCapacity, int grindedPowder) {
        this.BeansCapacity = beansCapacity;
    }

    public int getBeansCapacity() {
        return this.BeansCapacity;
    }

    public void setBeansCapacity(int beansCapacity) {
        this.BeansCapacity += beansCapacity;
    }

    public void updateBeansCapacity(int beansCapacity) {
            if (this.BeansCapacity >= beansCapacity) {
            this.BeansCapacity -= beansCapacity;
        } else {
                JOptionPane.showMessageDialog(null, """
               There is not much beans! start fill with some.
               Your beans container capacity is only: """ + this.BeansCapacity + "  g");
        }
    }

    public void getInfo() {
        System.out.println("beans capacity: " + this.BeansCapacity);
    }
}
