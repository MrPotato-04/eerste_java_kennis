package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_3 extends Applet {
    int count1, count2;

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int teller;
        int x=0;
        count1=1;
        count2=0;

        for(teller = 0; teller < 5; teller++) {
            x += 40;
            count2 = count1 + count2;
            g.drawString("" + count1, x, 10 );
            count1 = count2 + count1;
            g.drawString("" + count2, x+20, 10 );
        }
    }
}