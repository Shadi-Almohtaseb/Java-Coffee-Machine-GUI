/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine.Exceptions;

/**
 *
 * @author user
 */
public class OutOfGroundCoffeeException extends RuntimeException {

    @Override
    public String getMessage() {
        return  "There is not much Ground Coffee!! Start to grind some.";
    }
    
}
