package AWTComponents;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DesktopPaneExample {

    public static void main(String[] args) {
        // Create the main frame (JFrame)
        JFrame frame = new JFrame("DesktopPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Create a JDesktopPane (a container for internal frames)
        JDesktopPane desktopPane = new JDesktopPane();
        frame.add(desktopPane);

        // Create the first internal frame with a JTextArea
        JInternalFrame internalFrame1 = new JInternalFrame("Tab 1 - Text Area", true, true, true, true);
        internalFrame1.setSize(300, 200);
        internalFrame1.setVisible(true);

        // Create a JTextArea inside a JScrollPane
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        internalFrame1.add(scrollPane, BorderLayout.CENTER);

        // Add the internal frame to the desktop pane
        desktopPane.add(internalFrame1);

        // Create the second internal frame with a slider
        JInternalFrame internalFrame2 = new JInternalFrame("Tab 2 - Slider", true, true, true, true);
        internalFrame2.setSize(300, 200);
        internalFrame2.setVisible(true);

        // Create a label and slider to adjust font size
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Adjust Font Size");
        panel2.add(label2);

        JSlider slider = new JSlider(10, 50, 20);  // Min, Max, Initial value
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Add a ChangeListener to update the font size of label2 when the slider changes
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int fontSize = slider.getValue();
                label2.setFont(new Font("Serif", Font.PLAIN, fontSize));
            }
        });

        panel2.add(slider);
        internalFrame2.add(panel2, BorderLayout.CENTER);

        // Add the internal frame to the desktop pane
        desktopPane.add(internalFrame2);

        // Set the desktop pane as the content pane
        frame.setContentPane(desktopPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
