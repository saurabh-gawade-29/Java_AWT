import java.awt.*;
import java.awt.event.*;

public class CalculatorApp extends Frame implements ActionListener {
    // Components
    TextField display;
    Button[] numButtons;
    Button addButton, subButton, mulButton, divButton, equalButton, clearButton;
    
    String operator = "";
    double num1, num2, result;
    
    public CalculatorApp() {
        // Set up the Frame
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());
        
        // Display for the result
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        // Set up buttons
        numButtons = new Button[10];
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new Button(String.valueOf(i));
            numButtons[i].addActionListener(this);
            panel.add(numButtons[i]);
        }
        
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        equalButton = new Button("=");
        clearButton = new Button("C");
        
        // Add buttons to panel
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(equalButton);
        panel.add(clearButton);
        
        add(panel, BorderLayout.CENTER);
        
        // Add action listeners to operator buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        // Frame behavior
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) == 'C') {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
            operator = "";
        } else if (command.charAt(0) == '+' || command.charAt(0) == '-' || 
                   command.charAt(0) == '*' || command.charAt(0) == '/') {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        } else {
            display.setText(display.getText() + command);
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
