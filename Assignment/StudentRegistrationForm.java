import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends Frame {
    // Declare AWT components
    Label nameLabel, ageLabel, courseLabel;
    TextField nameField, ageField, courseField;
    Button submitButton;

    // Constructor to set up the form
    public StudentRegistrationForm() {
        // Set the frame title and layout
        setTitle("Student Registration Form");
        setLayout(new GridLayout(4, 2));  // 4 rows, 2 columns

        // Create the components
        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        courseLabel = new Label("Course:");
        
        nameField = new TextField();
        ageField = new TextField();
        courseField = new TextField();
        
        submitButton = new Button("Submit");

        // Add the components to the frame
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(courseLabel);
        add(courseField);
        add(new Label());  // Empty label for layout purpose
        add(submitButton);

        // Add action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Collect the entered data
                String name = nameField.getText();
                String age = ageField.getText();
                String course = courseField.getText();

                // Show the data in a dialog
                String message = "Name: " + name + "\nAge: " + age + "\nCourse: " + course;
                Dialog dialog = new Dialog(StudentRegistrationForm.this, "Submitted Successfully", true);
                dialog.setLayout(new BorderLayout());
                dialog.add(new Label(message), BorderLayout.CENTER);
                Button closeButton = new Button("Close");
                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                });
                dialog.add(closeButton, BorderLayout.SOUTH);
                dialog.setSize(300, 200);
                dialog.setVisible(true);
            }
        });

        // Set the size of the frame and make it visible
        setSize(400, 200);
        setVisible(true);
        
        // Close the frame when the user clicks the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Main method to create an instance of the frame
    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
