package Herhaling;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Herhaling11_1 extends Applet {
    int count1;

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int teller;
        int x=20;
        count1=1;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x,15,x,300);
            g.drawString("" + count1++, x, 10 );

        }
    }
}