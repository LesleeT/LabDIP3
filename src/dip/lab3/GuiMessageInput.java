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
public class GuiMessageInput implements Input {
    
    @Override
    public String getMessageInput(){
        String name = JOptionPane.showInputDialog("What is your name?");
        return name;
    }
    
}
