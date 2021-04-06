package KnoppenEnTextvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnoppenEnTekstvakken8_3 extends Applet {
    TextField tekstvak;
    Button knop;
    double bedrag;
    double btw;

    public void init() {
        bedrag = 0;
        tekstvak = new TextField("Type een bedrag", 30);
        knop = new Button("Ok");
        tekstvak.addActionListener( new KnopListener() );
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            bedrag = Double.parseDouble(tekstvak.getText());
            btw = ((bedrag/100)*21)+bedrag;
            tekstvak.setText("het bedrag incl. btw is: "+ btw);
            repaint();
        }
    }
}