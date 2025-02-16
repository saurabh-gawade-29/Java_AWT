package AWTComponents;

/*
Java AWT Example
To create simple AWT example, you need a frame. There are two ways to create a GUI using Frame in AWT.

By extending Frame class (inheritance)
By creating the object of Frame class (association)
AWT Example by Inheritance
Let's see a simple example of AWT where we are inheriting Frame class. Here, we are showing Button component on the Frame.
 */
// importing Java AWT class  
import java.awt.*;

// extending Frame class to our class AWTExample1  
public class AWTExample1 extends Frame {

    // initializing using constructor  
    AWTExample1() {
        // creating a button   
        Button b = new Button("Greet");
        // setting button position on screen  
        b.setBounds(30, 100, 80, 30);
        // adding button into frame    
        add(b);
        // frame size 300 width and 300 height    
        setSize(700, 700);
        // setting the title of Frame  
        setTitle("AWT APP BY SIMRAN");
        // no layout manager   
        setLayout(null);
        // now frame will be visible, by default it is not visible    
        setVisible(true);
    }

// main method  
    public static void main(String args[]) {
// creating instance of Frame class   
        AWTExample1 f = new AWTExample1();
    }
}
