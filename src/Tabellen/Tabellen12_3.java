package Tabellen;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Tabellen12_3 extends Applet {

    TextField[] textvak;
    Button knop;
    int columns = 5;
    int[] num;




    public void init() {
        num = new int[5];


        textvak = new TextField[5];
        for (int i = 0; i < textvak.length; i++) {
            textvak[i] = new TextField("",columns);
            add(textvak[i]);
        }

        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        add(knop);


        }





    public void paint(Graphics g) {
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            for (int i = 0; i < textvak.length; i++) {
                num[i] = Integer.parseInt(textvak[i].getText());
            }
            //sort
            Arrays.sort(num);
            //paste back
            for (int i = 0; i < textvak.length; i++) {
                textvak[i].setText(""+num[i]);
            }

            repaint();

        }
    }

}