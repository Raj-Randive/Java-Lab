package Module4.GUI_Basic_progs;
import javax.swing.*;
import java.awt.*;

// If we are using extends Jframe then no need to create an object. Directly Call the methods.
public class SwingDemo extends JFrame{
    SwingDemo(){
//        JFrame jf1 = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //APPROACH - 1 : Using getScreenSize() method
        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
        setSize(screenSize.width,screenSize.height); //Set the width and height of the JFrame.

//        jf1.setSize(400, 500); // This 1920 and 1080 is in pixels.

        setLayout(null);
        JButton b1 = new JButton("Click Here");
        b1.setBounds(50, 100, 100, 50);

        String s1 = b1.getText();
        System.out.println(s1);

        JTextField t1 = new JTextField("New Text");
        t1.setBounds(200, 200, 100, 70);
        add(t1);

        add(b1);

//        jf1.setVisible(true);
        setVisible(true);
    }

    public static void main(String args[]){

        SwingDemo s1 = new SwingDemo();


    }
}
