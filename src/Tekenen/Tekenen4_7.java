package Tekenen;

import java.applet.Applet;
import java.awt.*;

public class Tekenen4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(10, 10, 200, 200, 50, 50);

        g.setColor(Color.black);
        g.fillOval((10+25),(10+25),50,50);
        g.setColor(Color.black);
        g.fillOval((10+125),(10+25),50,50);
        g.setColor(Color.black);
        g.fillOval((10+25),(10+125),50,50);
        g.setColor(Color.black);
        g.fillOval((10+125),(10+125),50,50);


    }
}