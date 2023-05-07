/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import CoffeeMachine.Exceptions.OutOfGroundCoffeeException;
import CoffeeMachine.Exceptions.OutOfBeansException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CoffeeGrinder {

//    private final FileLogger logger;
    private String GrindSize;
    private double ArabicaGroundCoffee;
    private double RobustaGroundCoffee;
    private final CoffeeBeansContainer beans;
    private final FileLogger logger;

    public CoffeeGrinder(String grindSize, CoffeeBeansContainer beans, FileLogger logger) {
        this.GrindSize = grindSize;
        this.beans = beans;
        this.logger = logger;
    }

    public void setArabicaGroundCoffee(int Beans) {
        if (Beans <= beans.getArabicaBeansCapacity()) {
            this.ArabicaGroundCoffee += Beans;
            this.beans.updateArabicaBeansCapacity(Beans);
            logger.log(" grind: " + Beans + " gram of Arabica beans");
        } else {
            throw new OutOfBeansException();
        }
    }
    public void setRobustaGroundCoffee(int Beans) {
        if (Beans <= beans.getRobustaBeansCapacity()) {
            this.RobustaGroundCoffee += Beans;
            this.beans.updateRobustaBeansCapacity(Beans);
            logger.log(" grind: " + Beans + " gram of Roubsta beans");
        } else {
            throw new OutOfBeansException();
        }
    }

    public void updateArabicaGroundCoffee(double usedPowder) {
        if (usedPowder <= this.ArabicaGroundCoffee) {
            this.ArabicaGroundCoffee -= usedPowder;
        } else {
            throw new OutOfGroundCoffeeException();
        }
    }
    public void updateRobustaGroundCoffee(double usedPowder) {
        if (usedPowder <= this.RobustaGroundCoffee) {
            this.RobustaGroundCoffee -= usedPowder;
        } else {
            throw new OutOfGroundCoffeeException();
        }
    }

    public double getArabicaGroundCoffee() {
        return ArabicaGroundCoffee;
    }

    public double getRobustaGroundCoffee() {
        return RobustaGroundCoffee;
    }

    public CoffeeBeansContainer getBeans() {
        return beans;
    }
    
    public String getGrindSize() {
        return GrindSize;
    }

    public void setGrindSize(String grindSize) {
        this.GrindSize = grindSize;
    }

    public void getInfo() {
        JOptionPane.showMessageDialog(null,
                "Grind size: " + this.GrindSize + "\nGround Coffee Powder: " + this.ArabicaGroundCoffee
                + "\nBeans: " + this.beans.getArabicaBeansCapacity());
    }

}
