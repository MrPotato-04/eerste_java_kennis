package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int teller;
        int x=20;

        for(teller = 20; teller > 10; teller--) {
            x += 20;
            g.drawString("" + teller, x, 10 );

        }
    }
}