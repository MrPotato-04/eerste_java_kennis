package Tekenen;
import java.applet.Applet;
import java.awt.*;

public class Tekenen4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(100, 100, 150, 50);
        g.drawLine(150, 50, 200, 100);
        g.drawRect(100, 100, 100, 100);
        g.drawRect(120, 160, 20, 40);
        g.drawRect(150, 160, 40, 25);
    }
}