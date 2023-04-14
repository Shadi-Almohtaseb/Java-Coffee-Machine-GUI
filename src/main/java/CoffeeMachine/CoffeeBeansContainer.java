/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import CoffeeMachine.Exceptions.OverFlowBenasException;
import CoffeeMachine.Exceptions.OutOfBeansException;

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

    public void setBeansCapacity(int beans) {
        if (this.BeansCapacity + beans <= 250) {
            this.BeansCapacity += beans;
        } else {
             throw new OverFlowBenasException();
         }
    }

    public void updateBeansCapacity(int beansCapacity) {
            if (this.BeansCapacity >= beansCapacity) {
            this.BeansCapacity -= beansCapacity;
        } else {
                throw new OutOfBeansException();
        }
    }

    public void getInfo() {
        System.out.println("beans capacity: " + this.BeansCapacity);
    }
}
