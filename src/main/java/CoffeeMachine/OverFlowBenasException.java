/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class OverFlowBenasException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Too much beans! The maximum capacity is 250 gram";
    }
    
}
