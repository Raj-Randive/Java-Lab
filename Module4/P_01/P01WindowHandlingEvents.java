// Q-1]. Write a program to demonstrate different Window handling events.
package Module4.P_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class P01WindowHandlingEvents extends Frame implements WindowListener {

    P01WindowHandlingEvents(){

        addWindowListener(this);
        setBounds(20, 20, 300, 400);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing.");
//        System.exit(1);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated.");
    }

    public static void main(String args[]){

        new P01WindowHandlingEvents();
    }
}
