package AWTComponents;

// importing awt class  
import java.awt.*;

public class ListExample1 {

    // class constructor   
    ListExample1() {
        // creating the frame  
        Frame f = new Frame();
        // creating the list of 5 rows   
        List l1 = new List(5);

        // setting the position of list component   
        l1.setBounds(100, 100, 75, 75);

        // adding list items into the list  
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");

        // adding the list to frame  
        f.add(l1);

        // setting size, layout and visibility of frame  
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

// main method  
    public static void main(String args[]) {
        new ListExample1();
    }
}
