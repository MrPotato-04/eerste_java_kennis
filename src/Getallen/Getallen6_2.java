import java.awt.*;
import java.applet.*;

public class Getallen6_2 extends Applet{
    int seconde;
    int uur;
    int dag;
    double jaar;


    public void init() {
        seconde = 1;
        uur = (seconde*60)*60;
        dag = uur*24;
        jaar = dag*365.242199;


    }

    public void paint(Graphics g) {
        g.drawString("aantal seconden in een uur " + uur, 20, 20);
        g.drawString("aantal seconden in een dag " + dag, 20, 40);
        g.drawString("aantal seconden in een jaar " + jaar, 20, 60);
    }
}
