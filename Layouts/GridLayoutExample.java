package Layouts;
import java.awt.*;

/*
GridLayout
Description: 
The GridLayout manager divides the container into a grid of rows and columns. 
All components are placed in the cells of the grid, and each cell has the same size.
 */
public class GridLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout Example");

        // Set GridLayout with 2 rows and 3 columns
        frame.setLayout(new GridLayout(2, 3));

        // Add components
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        frame.add(new Button("Button 5"));
        frame.add(new Button("Button 6"));

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
