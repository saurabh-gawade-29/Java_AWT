package Layouts;
import java.awt.*;
/*
BorderLayout
Description: The BorderLayout divides the container into five regions:
North, South, East, West, and Center. Each region can hold one component.
 */
public class BorderLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");

        // Set BorderLayout
        frame.setLayout(new BorderLayout());

        // Add components to regions
        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"), BorderLayout.SOUTH);
        frame.add(new Button("East"), BorderLayout.EAST);
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
