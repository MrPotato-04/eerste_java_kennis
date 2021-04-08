package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int teller;
        int x=0;
        int y=0;

        for(teller = 0; teller < 5; teller++) {
            x += 50;
            y += 50;
            g.drawRect(x,y,50,50);


        }
    }
}