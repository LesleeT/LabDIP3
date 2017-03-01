/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;
/**
 *
 * @author ltrinastic
 */
public class KeyboardMessageInput implements Input {
   
   @Override
   public String getMessageInput(){
       Scanner sc = new Scanner(System.in);
       System.out.println("What is your name?");
       return sc.nextLine();
   }
}
