import java.awt.*;
import java.awt.event.*;

public class NestedMenuExample {
    public static void main(String[] args) {
        // Creating a frame
        Frame frame = new Frame("AWT Menu Example");
        
        // Creating a menu bar
        MenuBar menuBar = new MenuBar();
        
        // Creating 3 menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");
        
        // Creating menu items for File menu
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        
        // Creating nested menus in Edit menu
        Menu copyMenu = new Menu("Copy");
        Menu pasteMenu = new Menu("Paste");
        
        // Creating menu items under Copy
        MenuItem copyOption1 = new MenuItem("Copy Option 1");
        MenuItem copyOption2 = new MenuItem("Copy Option 2");
        
        // Creating menu items under Paste
        MenuItem pasteOption1 = new MenuItem("Paste Option 1");
        MenuItem pasteOption2 = new MenuItem("Paste Option 2");
        
        // Add menu items to respective menus
        copyMenu.add(copyOption1);
        copyMenu.add(copyOption2);
        pasteMenu.add(pasteOption1);
        pasteMenu.add(pasteOption2);
        
        // Add the nested menus to Edit menu
        editMenu.add(copyMenu);
        editMenu.add(pasteMenu);
        
        // Adding menu items to File and View menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        
        // Adding menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        // Setting the menu bar to the frame
        frame.setMenuBar(menuBar);
        
        // Setting the frame size and making it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // Adding window listener to close the application
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
