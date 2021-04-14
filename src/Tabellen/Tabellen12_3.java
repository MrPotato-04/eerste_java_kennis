package Tabellen;

import KnoppenEnTextvakken.KnoppenEnTekstvakken_Praktijk;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellen12_3 extends Applet {
    TextField textvak1,textvak2,textvak3,textvak4,textvak5;
    Button knop;

    public void init() {
        textvak1 = new TextField("", 10);
        textvak2 = new TextField("", 10);
        textvak3 = new TextField("", 10);
        textvak4 = new TextField("", 10);
        textvak5 = new TextField("", 10);
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());


        }





    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        }
    }

}