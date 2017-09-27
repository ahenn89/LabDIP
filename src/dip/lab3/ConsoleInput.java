/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;
/**
 *
 * @author Ashlee
 */
public class ConsoleInput implements Input{

    @Override
    public String readMessage() {
        System.out.println("Enter text using the keyboard, then hit enter.");
        
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
    
}
