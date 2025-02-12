import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends Frame implements ActionListener {
    
    // Components
    TextArea textArea;
    MenuBar menuBar;
    Menu fileMenu;
    MenuItem newItem, openItem, saveItem, exitItem;

    public TextEditor() {
        // Set up the Frame
        setTitle("Simple Text Editor");
        setSize(600, 400);
        setLayout(new BorderLayout());
        
        // Create the TextArea for text editing
        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);
        
        // Create MenuBar
        menuBar = new MenuBar();
        
        // Create File menu
        fileMenu = new Menu("File");
        
        // Create MenuItems for File menu
        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");
        
        // Add action listeners to the menu items
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        // Add menu items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        // Add File menu to the menu bar
        menuBar.add(fileMenu);
        
        // Set the menu bar for the frame
        setMenuBar(menuBar);
        
        // Show the frame
        setVisible(true);
        
        // Close the window when the user clicks the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.equals("New")) {
            textArea.setText("");  // Clear the text area for a new file
        } 
        else if (command.equals("Open")) {
            // Open file dialog to select a file to open
            FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
            fileDialog.setVisible(true);
            String fileName = fileDialog.getFile();
            
            if (fileName != null) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileDialog.getDirectory() + fileName));
                    String line;
                    StringBuilder content = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    textArea.setText(content.toString());
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("Error opening file: " + ex.getMessage());
                }
            }
        } 
        else if (command.equals("Save")) {
            // Save file dialog to select where to save the file
            FileDialog fileDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
            fileDialog.setVisible(true);
            String fileName = fileDialog.getFile();
            
            if (fileName != null) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileDialog.getDirectory() + fileName));
                    writer.write(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Error saving file: " + ex.getMessage());
                }
            }
        } 
        else if (command.equals("Exit")) {
            System.exit(0);  // Close the application
        }
    }

    public static void main(String[] args) {
        new TextEditor();  // Create and display the Text Editor
    }
}
