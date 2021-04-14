package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int teller;
        int a=0;
        int b=0;
        int c=90;

        for(teller = 0; teller < 5; teller++) {
            a += 10;
            b += 10;
            c -= 5;
            g.drawOval(c,c,a,a);
            g.drawOval(1,1,1,1);

        }
    }
}