
//importeer de benodigde klassen uit de Java bibliotheek
import java.applet.*;
import java.awt.*;


//een klasse met de naam Show van het type Applet
public class Applet2_1 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.blue);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Anton Simons", 50, 60 );
    }

}