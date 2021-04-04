import java.awt.*;
import java.applet.*;


public class Getallen6_1 extends Applet {
    int geld;
    double geldGesplit;


    public void init() {
        geld = 113;
        geldGesplit = (double)  geld/4;

    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + geldGesplit + "€", 20, 20);
        g.drawString("Ali krijgt: " + geldGesplit + "€", 20, 40);
        g.drawString("Jeannette krijgt: " + geldGesplit + "€", 20, 60);
        g.drawString("Ik krijg: " + geldGesplit + "€", 20, 80);
    }
}