//importing AWT class  

import java.awt.*;

public class TextAreaExample {
// constructor to initialize  

    TextAreaExample() {
// creating a frame  
        Frame f = new Frame();
// creating a text area  
        TextArea area = new TextArea("Address:");
// setting location of text area in frame  
        area.setBounds(10, 30, 300, 300);
// adding text area to frame  
        f.add(area);
// setting size, layout and visibility of frame    
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
// main method  

    public static void main(String args[]) {
        new TextAreaExample();
    }
}
