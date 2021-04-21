package Tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Tabellen12_4en5 extends Applet {
    Button ok;
    TextField search;

    double[] tabel = {1,2,3,4,5,6,7,8,9,10};
    int gezocht,getal;
    boolean gevonden;



    public void init() {
        gevonden=false;



        search = new TextField("",20);
        ok = new Button("ok");
        ok.addActionListener(new okListener());
        add(search);
        add(ok);
    }

    class okListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            gezocht = Integer.parseInt(search.getText());
            int i = 0;
            while (i < tabel.length) {
                if(tabel[i] == gezocht) {
                    getal=i;
                    gevonden=true;
                    break;
                }
                i++;
            }
            repaint();

        }

    }
    public void paint(Graphics g) {
        if(gevonden == true){
            g.drawString("Index = "+ getal,50,50);
        }
        else{
            g.drawString(" Error 404 not found.",50,60);
        }
        gevonden=false;

    }
}
