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
public class Startup {
    public static void main(String[] args) {
        
    
    Input input = new GuiMessageInput();
    Output output = new OutputGuiMessage();
    
    MessageService messageService = new MessageService(input, output);
    messageService.produceMessage();
    
    }
}