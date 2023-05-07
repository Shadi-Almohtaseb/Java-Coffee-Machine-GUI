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

    private int ArabicaBeansCapacity;
    private int RobustaBeansCapacity;
    private final FileLogger logger;

    public CoffeeBeansContainer(int ArabicaBeansCapacity, int RobustaBeansCapacity, FileLogger logger) {
        this.logger = logger;
        this.ArabicaBeansCapacity = ArabicaBeansCapacity;
        this.RobustaBeansCapacity = RobustaBeansCapacity;
    }

    public void setArabicaBeansCapacity(int ArabicaBeansCapacity) {
        if (this.ArabicaBeansCapacity + ArabicaBeansCapacity <= 100) {
            this.ArabicaBeansCapacity += ArabicaBeansCapacity;
            logger.log(" added: " +ArabicaBeansCapacity + " gram of Arabica beans");
        } else {
            throw new OverFlowBenasException();
        }
    }

    public void setRobustaBeansCapacity(int RobustaBeansCapacity) {
        if (this.RobustaBeansCapacity + RobustaBeansCapacity <= 100) {
            this.RobustaBeansCapacity += RobustaBeansCapacity;
            logger.log(" added: " +RobustaBeansCapacity + " gram of Roubsta beans");
        } else {
            throw new OverFlowBenasException();
        }
    }

    public void updateArabicaBeansCapacity(int beansCapacity) {
        if (this.ArabicaBeansCapacity >= beansCapacity) {
            this.ArabicaBeansCapacity -= beansCapacity;
        } else {
            throw new OutOfBeansException();
        }
    }
    
    public void updateRobustaBeansCapacity(int beansCapacity) {
        if (this.RobustaBeansCapacity >= beansCapacity) {
            this.RobustaBeansCapacity -= beansCapacity;
        } else {
            throw new OutOfBeansException();
        }
    }

    public int getArabicaBeansCapacity() {
        return ArabicaBeansCapacity;
    }

    public int getRobustaBeansCapacity() {
        return RobustaBeansCapacity;
    }

    public String getInfo() {
        return "Arabica beans capacity: " + this.ArabicaBeansCapacity +" \nRobusta beans capacity: " + this.RobustaBeansCapacity ;
    }
}
