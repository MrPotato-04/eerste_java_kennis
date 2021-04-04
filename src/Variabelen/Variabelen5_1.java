package Variabelen;

import java.applet.Applet;
import java.awt.*;

public class Variabelen5_1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 190;
        hoogte = 95;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        this.setSize(1600,900);

        //Lijn
        g.setColor(Color.black);
        g.drawLine(10,50,200,50);
        g.drawString("Lijn",hoogte,65);
        //Rechthoek
        g.setColor(Color.black);
        g.drawRect(10,100,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString("Rechthoek",75,210);
        //Rechthoek ovaal magenta
        g.setColor(Color.magenta);
        g.fillRect(210,100,breedte,hoogte);
        g.setColor(Color.black);
        g.drawOval(210,100,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",230,210);
        //Taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawOval(410,100,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillArc(410,100,breedte,hoogte,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",425,210);
        //Afgeronde rechthoek
        g.drawRoundRect(10,220,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",50,330);
        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(210,220,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",265,330);
        //Cirkel
        g.setColor(Color.black);
        g.drawOval(460,220,hoogte,hoogte);
        g.setColor(Color.black);
        g.drawString("Zirkel",495,330);


    }
}