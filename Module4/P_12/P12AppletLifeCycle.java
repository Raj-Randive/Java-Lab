package Module4.P_12;
import java.applet.*;
import java.awt.*;

public class P12AppletLifeCycle extends Applet {
        public void init()
        {
            setBackground(Color.black);
            setForeground(Color.yellow);
        }
        public void paint(Graphics g)
        {
            g.drawString("Welcome to Applets", 50, 50);
        }
    }
