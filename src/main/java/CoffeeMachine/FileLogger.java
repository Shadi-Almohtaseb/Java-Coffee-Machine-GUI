/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeMachine;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class FileLogger implements Logger {
    
     Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, HH:mm:ss");
    String formattedDate = dateFormat.format(currentDate);

    @Override
    public void log(String message) {
        try {
            FileWriter fileWrilter = new FileWriter("machine.log", true);
            fileWrilter.write("At Date:  (" + formattedDate + ") The machine : " + message+"\n\n");
            fileWrilter.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
