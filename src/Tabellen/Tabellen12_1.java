package Tabellen;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Tabellen12_1 extends Applet {
    double[] getal;
    double gemidelde;

    public void init() {
        int teller = 0;
        getal = new double[10];
        for (teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 100 + teller * 94.37;
        }

    }

    public void paint(Graphics g) {
        for (int teller1 = 0; teller1 < getal.length; teller1++) {
            g.drawString("" + getal[teller1], 50, 20 * teller1 + 20);
        }
        gemidelde = ((getal[0]+getal[1]+getal[2]+getal[3]+getal[4]+getal[5]+getal[6]+getal[7]+getal[8]+getal[9])/10);
        g.drawString("het gemiddelde is: "+gemidelde,100,100);
    }
}