// 6] WAP to create a Menu using the frame.
package Module4.P_06;

import javax.swing.*;
import java.awt.*;

public class P06MenuCreation {

    JFrame f1 = new JFrame();
    JMenuBar MenuBar = new JMenuBar();
    JMenu m1 = new JMenu("Preet's Menu");
    JMenu subMenu = new JMenu("More");

    JMenuItem i1 = new JMenuItem("P1");
    JMenuItem i2 = new JMenuItem("P2");
    JMenuItem i3 = new JMenuItem("P3");
    JMenuItem i4 = new JMenuItem("P4");
    JMenuItem i5 = new JMenuItem("P5");

    JButton b1 = new JButton("Ok");
    JButton b2 = new JButton("Cancel");

    P06MenuCreation() {
        prepareFrame();
    }

    void prepareFrame(){
        f1.setSize(400, 600);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuBar.add(m1);
        f1.setJMenuBar(MenuBar);

        m1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        i1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        i2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        i3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        i4.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        i5.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        subMenu.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(subMenu);
        subMenu.add(i4);
        subMenu.add(i5);
    }

    public static void main(String args[]){
        new P06MenuCreation();
    }
}
