package dip.lab3;

import javax.swing.*;
/**
 *
 * @author Ashlee
 */
public class GUIConsole implements Output{

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
