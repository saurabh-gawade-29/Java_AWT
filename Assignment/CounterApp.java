import java.awt.*;
import java.awt.event.*;

public class CounterApp extends Frame {
    Label label;
    Button incrementButton, decrementButton;
    int count = 0;

    public CounterApp() {
        setLayout(new FlowLayout());

        // Create components
        label = new Label("Count: " + count);
        incrementButton = new Button("Increment");
        decrementButton = new Button("Decrement");

        // Add components to frame
        add(label);
        add(incrementButton);
        add(decrementButton);

        // Add event listeners to buttons
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count: " + count);
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                label.setText("Count: " + count);
            }
        });

        // Frame settings
        setSize(300, 150);
        setTitle("Simple Counter");
        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
