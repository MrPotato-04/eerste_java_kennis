import java.applet.Applet;
import java.awt.*;

public class Getallen6_3 extends Applet{
    int getal1;
    int getal2;
    int uitkomst;


    public void init() {
        getal1 = 10;
        getal2 = 10;
        uitkomst = -(getal1+getal2);


    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        this.setSize(1600,900);
        g.drawString("" + uitkomst,20,20);

    }
}
