/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class OverFlowWaterException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Too much water! the maximum is 1 liter (1000ml)";
    }
    
}
