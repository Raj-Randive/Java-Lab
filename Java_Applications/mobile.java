package Java_Applications;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

public class mobile implements ActionListener {
    JFrame frame = new JFrame("Calculator");
    JLabel l1 = new JLabel("Id");
    JLabel l2 = new JLabel("Model");
    JLabel l3 = new JLabel("Brand");
    JLabel l4 = new JLabel("Price");
    JButton bsearch = new JButton("Search");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();

    mobile(){
        prepareFrame();
        addAllComponents();
        addActionEvents();
    }

    void prepareFrame(){
        frame.setSize(500, 500);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addAllComponents(){
        frame.add(l1);
        l1.setBounds(50, 20, 70, 50);
        l1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        frame.add(t1);
        t1.setBounds(120, 20, 250, 50);
        t1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        frame.add(bsearch);
        bsearch.setBounds(195, 85, 100, 40);
        bsearch.setFocusable(false);
        bsearch.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        frame.add(l2);
        l2.setBounds(50, 140, 70, 50);
        l2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        frame.add(t2);
        t2.setBounds(120, 140, 250, 50);
        t2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        frame.add(l3);
        l3.setBounds(50, 200, 70, 50);
        l3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        frame.add(t3);
        t3.setBounds(120, 200, 250, 50);
        t3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));

        frame.add(l4);
        l4.setBounds(50, 260, 70, 50);
        l4.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
        frame.add(t4);
        t4.setBounds(120, 260, 250, 50);
        t4.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
    }

    void addActionEvents(){
        bsearch.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        Object source = e.getSource();

        switch (t1.getText()){

            case "1" -> {
                if (source == bsearch){

                    try {
                        FileReader fr = new FileReader("E:\\Just Code\\Java Lab\\src\\Java_Applications\\file.txt");
                        int i;
                        while( (i = fr.read()) != -1 ){
                            t2.setText("M31");
                            t3.setText("5000");
                            t4.setText("Samsung");
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                }

                }
            case "2" -> {
                if (source == bsearch){

                    try {
                        FileReader fr = new FileReader("E:\\Just Code\\Java Lab\\src\\Java_Applications\\file.txt");
                        int i;
                        while( (i = fr.read()) != -1 ){
                            t2.setText("M51");
                            t3.setText("6000");
                            t4.setText("REDMI");
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }

            case "3" -> {
                if (source == bsearch){

                    try {
                        FileReader fr = new FileReader("E:\\Just Code\\Java Lab\\src\\Java_Applications\\file.txt");
                        int i;
                        while( (i = fr.read()) != -1 ){
                            t2.setText("M81");
                            t3.setText("8000");
                            t4.setText("OnePlus");
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                }

            }

            case "4" -> {
                if (source == bsearch){

                    try {
                        FileReader fr = new FileReader("E:\\Just Code\\Java Lab\\src\\Java_Applications\\file.txt");
                        int i;
                        while( (i = fr.read()) != -1 ){
                            t2.setText("M90");
                            t3.setText("7000");
                            t4.setText("Nokia");
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                }

            }
        }
    }

    public static void main(String args[]){

        new mobile();

    }
}
