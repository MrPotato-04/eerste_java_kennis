package Getallen;
import java.applet.Applet;
import java.awt.*;

public class Getallen_Praktijkopdracht extends Applet{
    double getal1;
    double getal2;
    double getal3;
    double som;
    int voledigUitkomst;
    double uitkomst;


    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;
        som = ((getal1+getal2+getal3)/3)*10;
        voledigUitkomst = (int)som;
        uitkomst = (double) voledigUitkomst/10;
        setSize(1600,900);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawString("Het gemiddelde is: " + uitkomst,20,20);
    }
}
