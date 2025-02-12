
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneSliderExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("JTabbedPane and JSlider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create the first tab with a JTextArea
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout()); // Use BorderLayout to properly organize components

        // Create a JTextArea inside a JScrollPane (to make it scrollable)
        JTextArea textArea = new JTextArea(10, 30);  // 10 rows, 30 columns
        textArea.setLineWrap(true);  // Enable line wrapping
        textArea.setWrapStyleWord(true);  // Wrap words instead of breaking in the middle

        // Add a JScrollPane to allow scrolling in the JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel1.add(scrollPane, BorderLayout.CENTER);

        // Create the second tab with a slider
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Adjust Font Size");
        panel2.add(label2);

        // Create a slider to change font size
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

        // Add panels to the tabbed pane
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
