package Tekenen;
import java.awt.*;
import java.applet.*;

public class Tekenen4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(0, 200, 200, 0);
        g.drawLine(200, 0, 400, 200);
        g.drawLine(0, 200, 400, 200);
    }
}