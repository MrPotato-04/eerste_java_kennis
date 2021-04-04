package Tekenen;

import java.applet.Applet;
import java.awt.*;

public class Tekenen4_5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(10,10,150,100,0,360);

    }
}