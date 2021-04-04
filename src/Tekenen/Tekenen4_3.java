import java.applet.Applet;
import java.awt.*;

public class Tekenen4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(10, 10, 50, 10);
        g.setColor(Color.white);
        g.fillRect(10, 20, 50, 10);
        g.setColor(Color.blue);
        g.fillRect(10, 30, 50, 10);
        g.setColor(Color.black);
        g.fillRect(7, 10, 3, 70);
    }
}