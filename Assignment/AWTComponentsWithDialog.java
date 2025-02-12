import java.awt.*;
import java.awt.event.*;

public class AWTComponentsWithDialog extends Frame {

    // Declare AWT components
    Label nameLabel, resultLabel;
    TextField nameTextField;
    TextArea infoTextArea;
    Checkbox maleCheckbox, femaleCheckbox;
    CheckboxGroup genderGroup;
    List itemList;
    Choice colorChoice;
    Button submitButton;

    // Constructor to set up the UI
    public AWTComponentsWithDialog() {
        // Set frame title
        setTitle("AWT Components with Dialog");

        // Set layout manager
        setLayout(new FlowLayout());

        // Initialize components
        nameLabel = new Label("Name: ");
        nameTextField = new TextField(20);

        infoTextArea = new TextArea("Enter your info here...", 5, 30);

        // Radio Buttons for Gender
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);

        // List of items
        itemList = new List();
        itemList.add("Item 1");
        itemList.add("Item 2");
        itemList.add("Item 3");
        itemList.add("Item 4");

        // ComboBox (Choice)
        colorChoice = new Choice();
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        colorChoice.add("Yellow");

        // Submit Button
        submitButton = new Button("Submit");

        // Add components to the frame
        add(nameLabel);
        add(nameTextField);
        add(new Label("Gender: "));
        add(maleCheckbox);
        add(femaleCheckbox);
        add(new Label("Select item: "));
        add(itemList);
        add(new Label("Choose color: "));
        add(colorChoice);
        add(new Label("Additional Info: "));
        add(infoTextArea);
        add(submitButton);

        // Result label for displaying information (not used directly)
        resultLabel = new Label("");
        add(resultLabel);

        // Button click event
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Collect data from the components
                String name = nameTextField.getText();
                String gender = maleCheckbox.getState() ? "Male" : "Female";
                String selectedItem = itemList.getSelectedItem();
                String color = colorChoice.getSelectedItem();
                String info = infoTextArea.getText();

                // Display collected data in a dialog
                String message = "Name: " + name + "\n"
                               + "Gender: " + gender + "\n"
                               + "Selected Item: " + selectedItem + "\n"
                               + "Color: " + color + "\n"
                               + "Additional Info: " + info;

                // Create a dialog to show the data
                Dialog resultDialog = new Dialog(AWTComponentsWithDialog.this, "Form Data", true);
                resultDialog.setLayout(new BorderLayout());
                TextArea resultArea = new TextArea(message, 10, 30);
                resultArea.setEditable(false);
                resultDialog.add(resultArea, BorderLayout.CENTER);

                Button closeButton = new Button("Close");
                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        resultDialog.setVisible(false);
                    }
                });

                resultDialog.add(closeButton, BorderLayout.SOUTH);
                resultDialog.setSize(350, 250);
                resultDialog.setVisible(true);
            }
        });

        // Frame properties
        setSize(400, 400);
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new AWTComponentsWithDialog();
    }
}
