package Tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellen12_6 extends Applet {
    int[] tabel = {1,3,1,2,5,6,9};
    int a;
    Button knop;
    TextField textvak;
    public void init() {
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());

        }





    public void paint(Graphics g) {

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 6;i++) {

            }

        }
    }

    

}