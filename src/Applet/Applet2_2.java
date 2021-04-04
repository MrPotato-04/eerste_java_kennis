
//importeer de benodigde klassen uit de Java bibliotheek

import java.applet.Applet;
import java.awt.*;


//een klasse met de naam Show van het type Applet
public class Applet2_2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Anton", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Simons", 50, 75 );
    }

}