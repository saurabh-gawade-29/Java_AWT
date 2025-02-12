
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileChooserApp extends JFrame {

    private JTextArea textArea;
    private JButton openFileButton, saveFileButton;
    private JFileChooser fileChooser;

    public FileChooserApp() {
        // Set up the JFrame
        setTitle("File Chooser Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a JTextArea for displaying file content
        textArea = new JTextArea();
        textArea.setEditable(true); // Make the text area editable
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Ensure wrapping at word boundaries
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create buttons to open and save files
        openFileButton = new JButton("Open File");
        saveFileButton = new JButton("Save File");

        openFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open file chooser for reading
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    if (selectedFile != null && selectedFile.exists()) {
                        readFile(selectedFile);
                    }
                }
            }
        });

        saveFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open file chooser for saving
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    if (selectedFile != null) {
                        saveFile(selectedFile);
                    }
                }
            }
        });

        // Initialize JFileChooser for text file selection
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text Files", "txt"));

        // Set up layout and add components
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openFileButton);
        buttonPanel.add(saveFileButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Method to read the file and display content in the text area
    private void readFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            textArea.setText(fileContent.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading the file", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to save the content of the text area to a file
    private void saveFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(textArea.getText());
            JOptionPane.showMessageDialog(this, "File saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving the file", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Make the UI thread-safe and start the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FileChooserApp().setVisible(true);
            }
        });
    }
}
