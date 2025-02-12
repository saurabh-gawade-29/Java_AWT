package Layouts;

import java.awt.*;
import java.awt.event.*;

/*
CardLayout
Description: The CardLayout allows multiple components to occupy the same space,
but only one component is visible at a time. 
It's like a deck of cards, where each "card" is a component.
 */
public class CardLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Example");
        CardLayout cardLayout = new CardLayout();
        Panel cardPanel = new Panel();
        
        // Set CardLayout
        cardPanel.setLayout(cardLayout);

        // Add components (cards)
        cardPanel.add("Card 1", new Button("Button 1"));
        cardPanel.add("Card 2", new Button("Button 2"));
        cardPanel.add("Card 3", new Button("Button 3"));

        // Buttons to switch cards
        Button prevButton = new Button("Previous");
        prevButton.addActionListener(e -> cardLayout.previous(cardPanel));

        Button nextButton = new Button("Next");
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));

        // Add components to frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(prevButton, BorderLayout.WEST);
        frame.add(nextButton, BorderLayout.EAST);

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
