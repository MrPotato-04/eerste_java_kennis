package Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen10_1En2 extends Applet {
    TextField tekstvak;
    double number;

    public void init() {
        tekstvak = new TextField("",100);
        tekstvak.addActionListener( new KnopListener());
        number = 0;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        this.setSize(1680,1050);
        g.drawString("" + number);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            number = Double.parseDouble(tekstvak.getText());



        }
    }
}