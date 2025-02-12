import java.awt.*;
import java.awt.event.*;

public class TempConverter extends Frame {
    TextField celsiusField, fahrenheitField;
    Button convertButton;

    public TempConverter() {
        setLayout(new FlowLayout());
        
        // Create components
        Label celsiusLabel = new Label("Enter Celsius:");
        celsiusField = new TextField(10);
        Label fahrenheitLabel = new Label("Fahrenheit:");
        fahrenheitField = new TextField(10);
        fahrenheitField.setEditable(false);
        convertButton = new Button("Convert");

        // Add components to frame
        add(celsiusLabel);
        add(celsiusField);
        add(fahrenheitLabel);
        add(fahrenheitField);
        add(convertButton);

        // Add action listener for button
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                fahrenheitField.setText(String.format("%.2f", fahrenheit));
            }
        });

        // Frame settings
        setSize(300, 150);
        setTitle("Temperature Converter");
        setVisible(true);
    }

    public static void main(String[] args) {
        new TempConverter();
    }
}
