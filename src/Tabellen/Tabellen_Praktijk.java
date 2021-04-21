package Tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellen_Praktijk extends Applet {
    Button ok,next;
    TextField nummer, naam;

    String[] namen;
    double[] nummers;
    int a, b, c;


    public void init() {
        namen = new String[10];
        nummers = new double[10];
        a = 0;
        b = 0;
        c = 0;
        b--;

        next = new Button("Next");
        next.addActionListener(new nextListener());

        ok = new Button("ok");
        ok.addActionListener(new okListener());
        naam = new TextField("",15);
        nummer = new TextField("",10);
        add(naam);
        add(nummer);
        add(ok);
        add(next);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (a<=10) {
                namen[a] = naam.getText();
                nummers[a] = Double.parseDouble(nummer.getText());
                naam.setText("");
                nummer.setText("");
                repaint();
                a++;
            }
        }
    }
    class nextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            c++;
            repaint();
            b++;
        }
    }


    public void paint(Graphics g) {
        if (c > 0) {
            g.drawString("Naam " + namen[b], 50, 50);
            g.drawString("Nr. " + nummers[b], 50, 70);
        }
    }

}

