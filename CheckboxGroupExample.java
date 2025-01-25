
import java.awt.*;

public class CheckboxGroupExample {

    CheckboxGroupExample() {
        Frame f = new Frame("CheckboxGroup Example");

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("C++", cbg, false);
        checkBox1.setBounds(100, 100, 50, 50);
        Checkbox checkBox2 = new Checkbox("Java", cbg, true);
        checkBox2.setBounds(100, 150, 50, 50);

        CheckboxGroup gender = new CheckboxGroup();
        Checkbox checkBox3 = new Checkbox("Male", gender, false);
        checkBox3.setBounds(100, 200, 50, 50);
        Checkbox checkBox4 = new Checkbox("Female", gender, true);
        checkBox4.setBounds(100, 250, 50, 50);

        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);
        f.add(checkBox4);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckboxGroupExample();
    }
}
