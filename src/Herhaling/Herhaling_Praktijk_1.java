package Herhaling;

import KnoppenEnTextvakken.KnoppenEnTekstvakken8_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Herhaling_Praktijk_1 extends Applet {
    int teller, a, c, y;
    Button knop;
    TextField textvak;

    public void init() {
        a = 1;
        knop = new Button("ok");
        textvak = new TextField("",20);
        knop.addActionListener(new KnopListener2());
        add(textvak);
        add(knop);
        y = 10;

    }

    public void paint(Graphics g) {
        this.setSize(1500, 600);
        for (teller = 1; teller < 11; teller++) {
            y += 15;
            c = a*teller;
            g.drawString("" + a + "*" + teller + "=" + c, 10, y);



        }
    }
        class KnopListener2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(textvak.getText());
                y = 10;
                textvak.setText("");
                repaint();


            }


        }

}

