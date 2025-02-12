
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserApp extends JFrame {

    private JPanel colorDisplayPanel;
    private JButton chooseColorButton;

    public ColorChooserApp() {
        // Set up the JFrame
        setTitle("Color Chooser App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the color display panel
        colorDisplayPanel = new JPanel();
        colorDisplayPanel.setPreferredSize(new Dimension(400, 200));
        colorDisplayPanel.setBackground(Color.WHITE);

        // Create the button to open color chooser dialog
        chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the color chooser dialog
                Color chosenColor = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);
                if (chosenColor != null) {
                    // Change the background color of the panel to the selected color
                    colorDisplayPanel.setBackground(chosenColor);
                }
            }
        });

        // Set up layout and add components
        setLayout(new BorderLayout());
        add(colorDisplayPanel, BorderLayout.CENTER);
        add(chooseColorButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Make the UI thread safe and start the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorChooserApp().setVisible(true);
            }
        });
    }
}
