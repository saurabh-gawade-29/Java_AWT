package Layouts;

import java.awt.*;

/*
FlowLayout
Description: The FlowLayout arranges components in a row, and
when the row is full, it wraps the components to the next line. 
It’s the default layout manager for Panel and Applets.
 */
public class FlowLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");

        // Set FlowLayout
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        
        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

