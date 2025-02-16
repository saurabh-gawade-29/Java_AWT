package AWTComponents;
// importing AWT class  

import java.awt.*;

public class CheckboxExample1 {
// constructor to initialize  

    CheckboxExample1() {
// creating the frame with the title  
        Frame f = new Frame("Checkbox Example");
        // creating the checkboxes  
        Checkbox checkbox1 = new Checkbox("Milk");
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("Bread", true);
        // setting location of checkbox in frame          
        checkbox2.setBounds(100, 150, 50, 50);
        Checkbox checkbox3 = new Checkbox("Butter");
        checkbox3.setBounds(100, 200, 50, 50);
        Checkbox checkbox4 = new Checkbox("Curd");
        checkbox4.setBounds(100, 250, 50, 50);
        Checkbox checkbox5 = new Checkbox("Jam");
        checkbox5.setBounds(100, 300, 50, 50);
// adding checkboxes to frame  
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(checkbox3);
        f.add(checkbox4);
        f.add(checkbox5);

// setting size, layout and visibility of frame  
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }
// main method  

    public static void main(String args[]) {
        new CheckboxExample1();
    }
}
