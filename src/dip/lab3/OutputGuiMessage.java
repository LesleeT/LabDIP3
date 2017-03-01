/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane; 
/**
 *
 * @author ltrinastic
 */
public class OutputGuiMessage implements Output{
   
    @Override
    public void sendMessageOutput(String message){
        JOptionPane.showMessageDialog(null,"This is the message of the day" );
    }
    
    
}