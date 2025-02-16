package AWTComponents;
// importing necessary packages  

import java.awt.*;
import java.awt.event.*;

public class ScrollbarExample2 {

    // class constructor   
    ScrollbarExample2() {
        // creating a Frame with a title   
        Frame f = new Frame("Scrollbar Example");

        // creating a final object of Label  
        final Label label = new Label();

        // setting alignment and size of label object           
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);

        // creating a final object of Scrollbar class  
        final Scrollbar s = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 51);

        // setting the position of scroll bar  
        s.setBounds(100, 100, 50, 100);
        // Set the value programmatically
        s.setValue(50);
        s.setMaximum(50);

        // adding Scrollbar and Label to the Frame  
        f.add(s);
        f.add(label);

        // setting the size, layout, and visibility of frame   
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // adding AdjustmentListener to the scrollbar object  
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:" + s.getValue());
            }
        });
    }

// main method    
    public static void main(String args[]) {
        new ScrollbarExample2();
    }
}
