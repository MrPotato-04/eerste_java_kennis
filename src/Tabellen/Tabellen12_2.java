package Tabellen;

import java.applet.Applet;
import java.awt.*;

public class Tabellen12_2 extends Applet {
    Button knop;
    double[] knoppen;

    public void init() {
        int teller = 0;
        int a =1;
        knoppen = new double[25];

        for (int teller1 = 0; teller1 < knoppen.length; teller1++) {
            knop = new Button(""+(a++));
            add(knop);

        }
    }


    public void paint(Graphics g) {

        }

}