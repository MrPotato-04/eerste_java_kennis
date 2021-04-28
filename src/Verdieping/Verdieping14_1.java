package Verdieping;

import java.applet.Applet;
import java.awt.*;

public class Verdieping14_1 extends Applet {

    double r1,r2;
    int kaartInt,klasseInt;
    String[] kaarten,klassen;


    public void init() {
        klassen = new String[] {"Hearts","Diamonds","Clubs","Spades"};
        kaarten = new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        r1 = Math.random();
        r2 = Math.random();
        kaartInt = (int)(r1 * 13);
        klasseInt = (int)(r2 * 4);
        }

    public void paint(Graphics g) {
        g.drawString(klassen[klasseInt]+" "+kaarten[kaartInt], 50, 60);
    }
}
