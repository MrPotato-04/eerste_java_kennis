package KnoppenEnTextvakken;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnoppenEnTekstvakken8_1 extends Applet {
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();
        }
    }
}