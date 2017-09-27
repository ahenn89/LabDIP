/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Ashlee
 */
public class StartUp {
    public static void main(String[] args){
        //inputs
        Input messageInput = new oneLiners();

        //Input messageInput = new ConsoleInput();
        
         
        //outputs
        Output messageOutput = new GUIConsole();
        //Output messageOutput = new ConsoleOutput();
        
        //test input & output
        System.out.println(messageOutput);

    }
}
