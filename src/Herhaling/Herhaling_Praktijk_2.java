package Herhaling;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Herhaling_Praktijk_2 extends Applet {
    int teller, teller1, a, b, c, x, y;
    Button knop;

    public void init() {
        b = 1;
        a = 1;
        knop = new Button("ok");
        knop.addActionListener(new KnopListener2());
        add(knop);
        y = 10;
        teller1 = 1;
    }

    public void paint(Graphics g) {
        this.setSize(1500, 600);
        for (teller = 1; teller < 11; teller++) {
            c = a*teller;
            g.drawString("" + a + "*" + teller + "=" + c, 10, y);
            y += 15;
            b ++;
        }
    }
        class KnopListener2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                a++;
                y = 10;
                repaint();
            }


        }

}

