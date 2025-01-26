import java.awt.*;

public class RegistrationForm {
    RegistrationForm() {
        Frame f = new Frame("Registration Form");
        Label sid = new Label("Student ID");
        sid.setBounds(30, 100, 100, 30);
        TextField A = new TextField();
        A.setBounds(160, 100, 120, 30); 
        Label sn = new Label("Student Name");
        sn.setBounds(30, 140, 100, 30);
        TextField B = new TextField();
        B.setBounds(160, 140, 120, 30); 
        Label phno = new Label("Phone Number");
        phno.setBounds(30, 180, 100, 30);
        TextField C = new TextField();
        C.setBounds(160, 180, 120, 30); 
        Label dep = new Label("Department");
        dep.setBounds(30, 220, 100, 30);
        TextField D = new TextField();
        D.setBounds(160, 220, 120, 30); 
        Label city = new Label("City");
        city.setBounds(30, 260, 100, 30);
        TextField E = new TextField();
        E.setBounds(160, 260, 120, 30); 
        Label ead = new Label("Email Address");
        ead.setBounds(30, 300, 100, 30);
        TextField F = new TextField();
        F.setBounds(160, 300, 120, 30); 
        Label faname = new Label("Father Name");
        faname.setBounds(30, 340, 100, 30);
        TextField G = new TextField();
        G.setBounds(160, 340, 120, 30); 
        Label add = new Label("Address");
        add.setBounds(30, 380, 100, 30);
        TextField H = new TextField(); 
        H.setBounds(160, 380, 120, 30); 
        Button s = new Button("Submit"); 
        s.setBounds(60,420,80,30); 
        Button c = new Button("Click"); 
        c.setBounds(150,420,80,30); 
        f.add(sid);
        f.add(sn);
        f.add(phno);
        f.add(dep);
        f.add(city);
        f.add(ead);
        f.add(faname);
        f.add(add);
        f.add(A);
        f.add(B);
        f.add(C);
        f.add(D);
        f.add(E);
        f.add(F);
        f.add(G);
        f.add(H);
        f.add(s);
        f.add(c);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new RegistrationForm();
    }
}
