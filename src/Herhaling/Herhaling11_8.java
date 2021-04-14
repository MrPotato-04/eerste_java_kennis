package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,1000);
        int teller;
        int a=0;
        int b=0;
        int c=20;

        for(teller = 0; teller < 100; teller++) {
            a += 10;
            b += 10;
            g.drawOval(c,c,a,a);
            g.drawOval(1,1,1,1);

        }
    }
}