package Tekenen;

import java.applet.Applet;
import java.awt.*;

public class Tekenen4_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(10, 10, 100, 280, 10, 10);
        g.setColor(Color.red);
        g.fillOval(35,25,50,50);
        g.setColor(Color.orange);
        g.fillOval(35,110,50,50);
        g.setColor(Color.green);
        g.fillOval(35,200,50,50);

    }
}