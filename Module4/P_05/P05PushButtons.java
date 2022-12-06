// 5] Write a program to demonstrate the use of push buttons.
package Module4.P_05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P05PushButtons implements ActionListener {
    JFrame f1 = new JFrame();
    JLabel l1 = new JLabel("Not Clicked.");

    JButton b1 = new JButton("Ok");
    JButton b2 = new JButton("Cancel");

    P05PushButtons() {
        prepareFrame();
        addAllComponents();
        ActionPerformed();
    }

    void prepareFrame(){
        f1.setSize(400, 600);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addAllComponents(){

        f1.add(l1);
        l1.setBounds(10, 70, 200, 30);
        l1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        f1.add(b1);
        b1.setBounds(10, 140, 100, 30);
        b1.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
        b1.setFocusable(false);

        f1.add(b2);
        b2.setBounds(140, 140, 100, 30);
        b2.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
        b2.setFocusable(false);
    }
    void ActionPerformed(){
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if (source == b1){
            System.out.println("OK Button Clicked.");
            l1.setText("Ok Button Clicked.");
        }
        if (source == b2){
            System.out.println("Cancel Button Clicked.");
            l1.setText("Cancel Button Clicked.");
        }
    }

    public static void main(String args[]){
        P05PushButtons obj1 = new P05PushButtons();

    }
}
