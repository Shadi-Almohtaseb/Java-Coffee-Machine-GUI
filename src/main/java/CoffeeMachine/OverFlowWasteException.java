/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class OverFlowWasteException extends RuntimeException {

    @Override
    public String getMessage() {
        return "You have to empty your waste tank first to make more coffee";
    }
    
    
}
