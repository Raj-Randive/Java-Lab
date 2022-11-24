package Module4.GUI_Basic_progs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Calculator implements ActionListener{

    // Variables
    double num1=0, num2=0, result=0;
    int calculation;

    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField t1 = new JTextField();

    ButtonGroup g1 = new ButtonGroup(); // By grouping the radio buttons, we can get only one checked at a time.

    JRadioButton onRB = new JRadioButton("On");
    JRadioButton offRB = new JRadioButton("Off");

    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton bDot = new JButton(".");
    JButton bClear = new JButton("C");
    JButton bDelete = new JButton("DEL");
    JButton bEqu = new JButton("=");
    JButton bMul = new JButton("x");
    JButton bDiv = new JButton("/");
    JButton bPlus = new JButton("+");
    JButton bMinus = new JButton("-");
    JButton bSquare = new JButton("x^2 ");
    JButton bSquareRoot = new JButton("(√x)");
    JButton bpi = new JButton("Pi");
    JButton blog = new JButton("log");

    Calculator(){
        prepareGUIofCalc();
        addAllComponents();
        addActionEvent();
    }

    public void prepareGUIofCalc(){
        frame.setSize(360, 600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addAllComponents(){

        g1.add(onRB);
        g1.add(offRB);

        label.setBounds(20, 14, 310, 50);
        label.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setForeground(Color.white);
        frame.add(label);

        //************************************************************************************
        t1.setBounds(20, 60, 310, 65);
        t1.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
        t1.setEditable(false);
        t1.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(t1);

        //************************************************************************************

        frame.add(onRB);
        onRB.setBounds(20, 135, 80, 50);
        onRB.setFont(new Font("Century Schoolbook", Font.PLAIN, 17));
        onRB.setSelected(true);
        onRB.setBackground(Color.black);
        onRB.setForeground(Color.white);
        onRB.setSelected(true);
        onRB.setFocusable(false);

        frame.add(offRB);
        offRB.setBounds(280, 135, 80, 50);
        offRB.setFont(new Font("Century Schoolbook", Font.PLAIN, 17));
        offRB.setSelected(true);
        offRB.setBackground(Color.black);
        offRB.setForeground(Color.white);
        offRB.setFocusable(false);


        //************************************************************************************
        frame.add(b0);
        b0.setBounds(20, 465, 150, 45);
        b0.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b0.setFocusable(false);

        frame.add(bDot);
        bDot.setBounds(180, 465, 70, 45);
        bDot.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        bDot.setFocusable(false);

        frame.add(bEqu);
        bEqu.setBounds(260, 465, 70, 45);
        bEqu.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        bEqu.setBackground(new Color(213, 187, 73));
        bEqu.setFocusable(false);

        //************************************************************************************
        frame.add(b1);
        b1.setBounds(20, 410, 70, 45);
        b1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b1.setFocusable(false);

        frame.add(b2);
        b2.setBounds(100, 410, 70, 45);
        b2.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b2.setFocusable(false);

        frame.add(b3);
        b3.setBounds(180, 410, 70, 45);
        b3.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b3.setFocusable(false);

        frame.add(bPlus);
        bPlus.setBounds(260, 410, 70, 45);
        bPlus.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        bPlus.setBackground(new Color(213, 187, 73));
        bPlus.setFocusable(false);

        //************************************************************************************
        frame.add(b4);
        b4.setBounds(20, 355, 70, 45);
        b4.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b4.setFocusable(false);

        frame.add(b5);
        b5.setBounds(100, 355, 70, 45);
        b5.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b5.setFocusable(false);

        frame.add(b6);
        b6.setBounds(180, 355, 70, 45);
        b6.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b6.setFocusable(false);

        frame.add(bMinus);
        bMinus.setBounds(260, 355, 70, 45);
        bMinus.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        bMinus.setBackground(new Color(213, 187, 73));
        bMinus.setFocusable(false);

        //************************************************************************************
        frame.add(b7);
        b7.setBounds(20, 300, 70, 45);
        b7.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b7.setFocusable(false);

        frame.add(b8);
        b8.setBounds(100, 300, 70, 45);
        b8.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b8.setFocusable(false);

        frame.add(b9);
        b9.setBounds(180, 300, 70, 45);
        b9.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        b9.setFocusable(false);

        frame.add(bMul);
        bMul.setBounds(260, 300, 70, 45);
        bMul.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        bMul.setBackground(new Color(213, 187, 73));
        bMul.setFocusable(false);

        //************************************************************************************
        frame.add(bClear);
        bClear.setBounds(20, 190, 70, 45);
        bClear.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        bClear.setBackground(new Color(189, 48, 48));
        bClear.setForeground(Color.WHITE);
        bClear.setFocusable(false);

        frame.add(bDelete);
        bDelete.setBounds(100, 190, 150, 45);
        bDelete.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
        bDelete.setBackground(new Color(189, 48, 48));
        bDelete.setForeground(Color.WHITE);
        bDelete.setFocusable(false);

        frame.add(bDiv);
        bDiv.setBounds(260, 190, 70, 45);
        bDiv.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        bDiv.setBackground(new Color(213, 187, 73));
        bDiv.setFocusable(false);

        //************************************************************************************
        frame.add(bSquareRoot);
        bSquareRoot.setBounds(20, 245, 70, 45);
        bSquareRoot.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
        bSquareRoot.setBackground(new Color(213, 187, 73));
        bSquareRoot.setFocusable(false);

        frame.add(bSquare);
        bSquare.setBounds(100, 245, 70, 45);
        bSquare.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
        bSquare.setBackground(new Color(213, 187, 73));
        bSquare.setFocusable(false);

        frame.add(blog);
        blog.setBounds(180, 245, 70, 45);
        blog.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
        blog.setBackground(new Color(213, 187, 73));
        blog.setFocusable(false);

        frame.add(bpi);
        bpi.setBounds(260, 245, 70, 45);
        bpi.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
        bpi.setBackground(new Color(213, 187, 73));
        bpi.setFocusable(false);
        bpi.setEnabled(false);

    }

    public void addActionEvent(){
        onRB.addActionListener(this);
        offRB.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bDot.addActionListener(this);
        bDelete.addActionListener(this);
        bClear.addActionListener(this);
        bEqu.addActionListener(this);
        bSquare.addActionListener(this);
        bSquareRoot.addActionListener(this);
        blog.addActionListener(this);
        bpi.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if (source == onRB){
            enable();
        }
        else if (source == offRB) {
            disable();
        }
        else if (source == bClear) {
            label.setText("");
            t1.setText("");
        }
        else if (source == bDelete) {
            int length = t1.getText().length();
            int number = length-1;
            if (length > 0){
                StringBuilder back = new StringBuilder(t1.getText());
                back.deleteCharAt(number);
                t1.setText(back.toString());
            }
            if (t1.getText().endsWith("")){
                label.setText("");
            }
        }
        else if (source == b0) {
            if (t1.getText().equals("0")){
                return;
            }
            else {
                t1.setText(t1.getText() + "0");
            }
        }
        else if (source == b1) {
            t1.setText(t1.getText() + "1");
        }
        else if (source == b2) {
            t1.setText(t1.getText() + "2");
        }
        else if (source == b3) {
            t1.setText(t1.getText() + "3");
        }
        else if (source == b4) {
            t1.setText(t1.getText() + "4");
        }
        else if (source == b5) {
            t1.setText(t1.getText() + "5");
        }
        else if (source == b6) {
            t1.setText(t1.getText() + "6");
        }
        else if (source == b7) {
            t1.setText(t1.getText() + "7");
        }
        else if (source == b8) {
            t1.setText(t1.getText() + "8");
        }
        else if (source == b9) {
            t1.setText(t1.getText() + "9");
        }
        else if (source == bDot) {
            if (t1.getText().contains(".")){
                return;
            }else{
                t1.setText(t1.getText() + ".");
            }
        }
        else if (source == bPlus) {
            String s1 = t1.getText();
            num1 = Double.parseDouble(t1.getText());
            calculation = 1;
            t1.setText("");
            label.setText(s1 + " + ");

        }
        else if (source == bMinus) {
            String s1 = t1.getText();
            num1 = Double.parseDouble(t1.getText());
            calculation = 2;
            t1.setText("");
            label.setText(s1 + " - ");

        }
        else if (source == bMul) {
            String s1 = t1.getText();
            num1 = Double.parseDouble(t1.getText());
            calculation = 3;
            t1.setText("");
            label.setText(s1 + " x ");

        }
        else if (source == bDiv) {
            String s1 = t1.getText();
            num1 = Double.parseDouble(t1.getText());
            calculation = 4;
            t1.setText("");
            label.setText(s1 + " / ");

        }
        else if (source == bEqu) {
            num2 = Double.parseDouble(t1.getText());
            switch (calculation){
                case 1 -> result = (num1 + num2) ;
                case 2 -> result = (num1 - num2) ;
                case 3 -> result = (num1 * num2) ;
                case 4 -> result = (num1 / num2) ;
            }

            if (Double.toString(result).endsWith(".0")){
                t1.setText(Double.toString(result).replace(".0", ""));
            }
            else{
                t1.setText(Double.toString(result));
            }
            label.setText("");

            num1 = result;   // SO THAT WE CAN CONTINUE THE RESULT...!!

        }
        else if (source == bSquareRoot) {
            num1 = Double.parseDouble(t1.getText());
            result = Math.sqrt(num1);

            if (Double.toString(result).endsWith(".0")){
                t1.setText(Double.toString(result).replace(".0", ""));
            }
            else{
                t1.setText(Double.toString(result));
            }
        }
        else if (source == bSquare) {
            num1 = Double.parseDouble(t1.getText());
            result = Math.pow(num1, 2);

            if (Double.toString(result).endsWith(".0")){
                t1.setText(Double.toString(result).replace(".0", ""));
            }
            else{
                t1.setText(Double.toString(result));
            }
        }
        else if (source == blog) {
            num1 = Double.parseDouble(t1.getText());
            result = Math.log10(num1);
            if (Double.toString(result).endsWith(".0")){
                t1.setText(Double.toString(result).replace(".0", ""));
            }
            else{
                t1.setText(Double.toString(result));
            }
        }
//        else if (source == bpi) {
//            String s2 = t1.getText();
//            num1 = Double.parseDouble(t1.getText());
//
//            try{
//                result = Math.PI;
//            }catch (NumberFormatException ep){
//                System.out.println(ep.getMessage());
//            }
//
//            if (t1.getText().equals("")){
//                t1.setText(Double.toString(result));
//                label.setText(s2 + " π ");
//            }
//            else{
//                num2 = Math.PI;
//            }
//        }
    }

    public void enable(){
        onRB.setEnabled(false);
        offRB.setEnabled(true);
        label.setEnabled(true);
        bClear.setEnabled(true);
        bEqu.setEnabled(true);
        bDelete.setEnabled(true);
        bPlus.setEnabled(true);
        bMinus.setEnabled(true);
        bMul.setEnabled(true);
        bDiv.setEnabled(true);
        bDot.setEnabled(true);
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bSquare.setEnabled(true);
        bSquareRoot.setEnabled(true);
        blog.setEnabled(true);
        bpi.setEnabled(true);
    }

    public void disable(){
        onRB.setEnabled(true);
        offRB.setEnabled(false);
        t1.setText("");
        label.setText("");
        label.setEnabled(false);
        bClear.setEnabled(false);
        bEqu.setEnabled(false);
        bDelete.setEnabled(false);
        bDot.setEnabled(false);
        bPlus.setEnabled(false);
        bMinus.setEnabled(false);
        bMul.setEnabled(false);
        bDiv.setEnabled(false);
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bSquare.setEnabled(false);
        bSquareRoot.setEnabled(false);
        blog.setEnabled(false);
        bpi.setEnabled(false);
    }


    //************************************************************************************

    public static void main(String args[]){

        Calculator c = new Calculator();

    }
}
