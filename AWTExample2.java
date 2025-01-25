// importing Java AWT class  

import java.awt.*;

// class AWTExample2 directly creates instance of Frame class  
class AWTExample2 {

    // initializing using constructor  
    AWTExample2() {

        // creating a Frame  
        Frame f = new Frame();

        // creating a Label  
        Label l = new Label("Employee ID:");

        // creating a Button  
        Button b = new Button("Submit");

        // creating a TextField  
        TextField t = new TextField();

        // setting position and size of components in the frame  
        l.setBounds(20, 50, 100, 30); // Adjusted position and size
        t.setBounds(130, 50, 150, 30); // Aligned with the label
        b.setBounds(130, 100, 80, 30); // Positioned below the TextField

        // adding components into frame    
        f.add(b);
        f.add(l);
        f.add(t);

        // frame size 400 width and 300 height    
        f.setSize(400, 200);

        // setting the title of frame  
        f.setTitle("Employee Info");

        // no layout  
        f.setLayout(null);

        // setting visibility of frame  
        f.setVisible(true);
    }

    // main method  
    public static void main(String args[]) {

        // creating instance of Frame class   
        AWTExample2 awt_obj = new AWTExample2();
    }
}
