package dip.lab3;

import java.util.ArrayList;
//import java.util.Random;
/**
 *
 * @author Ashlee
 */
public class oneLiners implements Input{
    
    ArrayList<String> badOneLiners = new ArrayList<>();
    
    public oneLiners() {
        insertbadOneLiners();
    }
    
     private final void insertbadOneLiners() {
        badOneLiners.add("Doctor, there's a patient on line 1 that says he's invisible. Well, tell him I can't see him right now.");
        badOneLiners.add("The future, the present and the past walked into a bar. Things got a little tense.");
        badOneLiners.add("I went to a really emotional wedding the other day. Even the cake was in tiers.");
        badOneLiners.add("I was overcharged for velcro last week. What a rip off!");
    }
     
//     public final String selectOneLiners(){
//        Random randNum = new Random();
//        int n = randNum.nextInt(badOneLiners.size());
//        String oneLiners = badOneLiners.get(n);
//        return oneLiners;
//     }
//
        @Override
       public final String readMessage() {
           String message = selectOneLiners();
           return message;
       }
}
