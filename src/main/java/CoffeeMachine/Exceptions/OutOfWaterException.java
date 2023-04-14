/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine.Exceptions;

/**
 *
 * @author user
 */
public class OutOfWaterException extends RuntimeException{
    public String getMessage(int water) {
        return """
               There is no much water! start fill with some.
               Your water tank capacity is only: """ + water + "  ml";
    }
}
