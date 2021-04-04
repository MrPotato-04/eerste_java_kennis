import java.applet.Applet;
import java.awt.*;

public class Tekenen4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(10, 200, 300, 200);

        g.drawLine(5, 200, 10, 200);
        g.drawLine(5, 180, 10, 180);
        g.drawLine(5, 160, 10, 160);
        g.drawLine(5, 140, 10, 140);
        g.drawLine(5, 120, 10, 120);
        g.drawLine(5, 100, 10, 100);

        g.setColor(Color.red);
        g.fillRect(50, 160, 10, 40);
        g.setColor(Color.black);
        g.drawString("Valerie", 40, 210 );

        g.setColor(Color.green);
        g.fillRect(150, 100, 10, 100);
        g.setColor(Color.black);
        g.drawString("Jeroen", 140, 210 );

        g.setColor(Color.blue);
        g.fillRect(250, 120, 10, 80);
        g.setColor(Color.black);
        g.drawString("Hans", 240, 210 );

    }
}