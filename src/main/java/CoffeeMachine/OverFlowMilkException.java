/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

/**
 *
 * @author user
 */
public class OverFlowMilkException  extends RuntimeException{
      @Override
    public String getMessage() {
        return "The maximum capacity of the milk tank is: 800 ml";
    }
}