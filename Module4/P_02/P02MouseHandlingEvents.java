// 2. Write a program to demonstrate different mouse handling events like mouseClicked(), mouseEntered(), mouseExited(), mousePressed, mouseReleased() and mouseDragged().
package Module4.P_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class P02MouseHandlingEvents extends Frame implements MouseListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField t1 = new JTextField("Enter Some Text Here");

    Label l = new Label("Mouse Handling Events");
    Label l1 = new Label("No Event");
    Label l2 = new Label("No Event");
    Label l3 = new Label("No Event");
    Label l4 = new Label("No Event");
    Label l5 = new Label("No Event");


    P02MouseHandlingEvents(){
        setFrame();
        addMouseListener(this);

    }

    public void setFrame(){
        frame.setBounds(20, 20, 500, 700);
        frame.add(l);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1.setBounds(20, 380, 370, 60);
        t1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
        frame.add(t1);

        l.setBounds(20, 20, 250, 50);
        l.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        frame.add(l1);
        l1.setBounds(20, 80, 450, 50);
        l1.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
        frame.add(l2);
        l2.setBounds(20, 140, 450, 50);
        l2.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
        frame.add(l3);
        l3.setBounds(20, 200, 450, 50);
        l3.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
        frame.add(l4);
        l4.setBounds(20, 260, 450, 50);
        l4.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
        frame.add(l5);
        l5.setBounds(20, 320, 450, 50);
        l5.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));

//        panel.setLayout( new FlowLayout());
//        frame.add(panel);

        frame.addMouseListener(this);
        t1.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("mouse Clicked at point : (" + e.getX() + ", " + e.getY() + ") \n Number of times Mouse Clicked: " + e.getClickCount());
        t1.setText("");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l2.setText("mouse Pressed at point : (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l3.setText("mouse Released at point : (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l4.setText("mouse Entered at point : (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l5.setText("mouse Exited at point : (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String args[]){

        new P02MouseHandlingEvents();
    }
}
