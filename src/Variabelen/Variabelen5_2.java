import java.applet.Applet;
import java.awt.*;

public class Variabelen5_2 extends Applet {
    int gewicht_Valerie;
    int gewicht_Jeroen;
    int gewicht_Hans;

    public void init() {
        gewicht_Valerie = 40;
        gewicht_Jeroen = 100;
        gewicht_Hans = 80;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        this.setSize(1600,900);
        g.setColor(Color.black);

        //bottom graph line
        g.drawLine(10, 200, 300, 200);

        //scaling
        g.drawLine(5, 200, 10, 200);
        g.drawLine(5, 180, 10, 180);
        g.drawLine(5, 160, 10, 160);
        g.drawLine(5, 140, 10, 140);
        g.drawLine(5, 120, 10, 120);
        g.drawLine(5, 100, 10, 100);


        //Valerie
        g.setColor(Color.red);
        g.fillRect(50, 200, 10, -gewicht_Valerie);
        g.setColor(Color.black);
        g.drawString("Valerie", 40, 210 );

        //Jeroen
        g.setColor(Color.green);
        g.fillRect(150, 200, 10, -gewicht_Jeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen", 140, 210 );

        //Hans
        g.setColor(Color.blue);
        g.fillRect(250, 200, 10, -gewicht_Hans);
        g.setColor(Color.black);
        g.drawString("Hans", 240, 210 );

    }
}