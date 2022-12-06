// 4] Write a program to generate a window without an applet window using main() function.
package Module4.P_04;
import javax.swing.*;
import java.awt.*;

public class P04WindowWithoutApplet {
    JFrame f1 = new JFrame();
    JLabel l = new JLabel("Window Created.");
    JLabel l2 = new JLabel("Text Here");
    JLabel l3 = new JLabel();

    P04WindowWithoutApplet(){
        prepareFrame();
        addAllComponents();
    }

    void prepareFrame(){
        f1.setSize(400, 600);
//        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addAllComponents(){
        f1.add(l);
        l.setBounds(10, 20, 150, 30);
        l.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        f1.add(l2);
        l2.setBounds(10, 70, 100, 30);
        l2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        f1.add(l3);
        l3.setBounds(10, 70, 100, 30);
        l3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
    }

    public static void main(String args[]){
        new P04WindowWithoutApplet();

    }
}
