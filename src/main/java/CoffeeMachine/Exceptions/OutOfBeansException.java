/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine.Exceptions;

/**
 *
 * @author user
 */
public class OutOfBeansException extends RuntimeException {

    @Override
    public String getMessage() {
        return "There are not many coffee beans! Start filling in some";
    }
    
}
