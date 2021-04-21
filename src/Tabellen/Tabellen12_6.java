package Tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Tabellen12_6 extends Applet {
    Button knop;
    TextField textvak;

    int[] tabel = {1,2,2,3,3,3,4,4,5,5,5,6,7,7,8,9,9,9,9,9};
    int a,gezocht;
    boolean gevonden;


    public void init() {
        textvak = new TextField("",20);
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        add(textvak);
        add(knop);
        gevonden = false;



    }





    public void paint(Graphics g) {
        if (gevonden) {
            g.drawString("Times "+gezocht+" was found: " + a, 50, 50);
        }
        else {
            g.drawString("error 404 Nr. not found",50,50);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            gevonden = false;
            gezocht = Integer.parseInt(textvak.getText());
            a = 0;
            int teller = 0;
            while(teller < tabel.length) {
                if(tabel[teller] == gezocht) {
                    gevonden = true;
                    a++;
                    repaint();
                }
                teller ++;
            }


            repaint();

        }
    }

}
