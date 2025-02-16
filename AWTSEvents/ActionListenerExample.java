package AWTSEvents;

import java.awt.event.*;
import java.awt.*;

public class ActionListenerExample {

    public static void main(String[] args) {
        // Create a new frame with the title "ActionListener Example"  
        Frame f = new Frame("ActionListener Example");
        // Create a text field  
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);  // Set bounds (position and size) for the text field          
        // Create a button  
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);  // Set bounds (position and size) for the button          
        // Add ActionListener to the button using an anonymous inner class  
        b.addActionListener(new ActionListener() {
            // Method invoked when the button is clicked  
            public void actionPerformed(ActionEvent e) {
                // Set text of the text field when the button is clicked  
                tf.setText("Welcome to Javatpoint.");
            }
        });
        // Add components to the frame  
        f.add(b); // Add button to the frame  
        f.add(tf); // Add text field to the frame          
        // Set frame size, layout, and visibility  
        f.setSize(400, 400); // Set frame size  
        f.setLayout(null);  // Set layout manager to null (absolute positioning)  
        f.setVisible(true); // Make frame visible  
    }
}
