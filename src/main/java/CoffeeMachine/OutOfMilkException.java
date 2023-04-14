/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class OutOfMilkException extends RuntimeException {

    @Override
    public String getMessage() {
        return "There is not much milk!, Start fill with some";
    }
    
}
