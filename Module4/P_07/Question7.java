import java.awt.*;
import java.awt.event.*;

class demo extends Frame {
    String Name = "Raj Randive", College = "PDEU", Branch = "CSE", Enrollment = "21BCP378";
    int div = 6;
    Label l1,l2,l3,l4,l5;

    demo()
    {
        l1=new Label("Name: " + Name);
        l2=new Label("Enrollment Number: " + Enrollment);
        l3=new Label("Division: " + div);
        l4=new Label("Branch: " + Branch);
        l5=new Label("College Name: " + College);

        //Layout
        l1.setBounds(25, 50, 250, 30);
        l2.setBounds(25, 100, 250, 30);
        l3.setBounds(25, 150, 250, 30);
        l4.setBounds(25, 200, 250, 30);
        l5.setBounds(25, 250, 250, 30);

        //Adding elements to frame
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);

        //frame specifications
        this.setSize(400,400);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
}

public class Question7 {
    public static void main(String[] args) {
        demo d=new demo();
    }
}
