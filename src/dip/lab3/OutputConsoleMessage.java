/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author ltrinastic
 */
public class OutputConsoleMessage implements Output {
    
   
    @Override
    public void sendMessageOutput(String message){
        System.out.println("Hello");
    }
    
}
