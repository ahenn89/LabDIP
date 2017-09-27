/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.ArrayList;
/**
 *
 * @author Ashlee
 */
public abstract class oneLiners implements Input{
    
    ArrayList<String> oneLiners = new ArrayList<String>();
    
     private final void oneLiners() {
        oneLiners.add("Doctor, there's a patient on line 1 that says he's invisible. Well, tell him I can't see him right now.");
        oneLiners.add("The future, the present and the past walked into a bar. Things got a little tense.");
        oneLiners.add("I went to a really emotional wedding the other day. Even the cake was in tiers.");
        oneLiners.add("I was overcharged for velcro last week. What a rip off!");
    }
     
     

//     @Override
//    public final String readMessage() {
//        String message = selectRandomQuote();
//        return message;
//    }
}
