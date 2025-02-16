package AWTComponents;

// importing awt package  
import java.awt.*;

public class ScrollbarExample1 {

// class constructor  
    ScrollbarExample1() {

        // creating a frame  
        Frame f = new Frame("Scrollbar Example");
        // creating a scroll bar  
        Scrollbar s = new Scrollbar();

        // setting the position of scroll bar  
        s.setBounds(100, 100, 50, 100);

        // adding scroll bar to the frame  
        f.add(s);

        // setting size, layout and visibility of frame  
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

// main method  
    public static void main(String args[]) {
        new ScrollbarExample1();
    }
}
