package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_4 extends Applet {
    int count1;

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int teller;
        int x=0;
        count1=1;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawString("" + 3*count1, x, 10 );
            count1++;

        }
    }
}