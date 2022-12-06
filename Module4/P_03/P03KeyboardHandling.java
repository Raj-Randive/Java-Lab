package Module4.P_03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P03KeyboardHandling implements KeyListener {
    JFrame frame = new JFrame();
    Label l = new Label();
    JTextArea t1 = new JTextArea();

    P03KeyboardHandling() {
        prepareFrame();
    }

    void prepareFrame(){
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(l);
        l.setBounds (20, 50, 200, 20);
        l.setFont(new Font("Century Schoolbook", Font.BOLD, 20));

        frame.add(t1);
        t1.setBounds (20, 90, 300, 200);
        t1.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
        t1.addKeyListener(this);
    }

    public void keyPressed (KeyEvent e) {
        l.setText ("Key Pressed");
    }
    public void keyReleased (KeyEvent e) {
        l.setText ("Key Released");
    }
    public void keyTyped (KeyEvent e) {
        l.setText ("Key Typed");
    }

    public static void main(String[] args) {
        P03KeyboardHandling obj1 = new P03KeyboardHandling();
    }
}
