package KnoppenEnTextvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnoppenEnTekstvakken_Praktijk extends Applet {
    TextField tekstvak,tekstvak2;
    Button keer,deel,plus,min,clear;
    double getal1,getal2,som;

    public void init() {
        getal1 = 0;
        getal2 = 0;

        tekstvak = new TextField("", 30);
        tekstvak.addActionListener( new KnopListener() );
        tekstvak2 = new TextField("", 30);
        tekstvak2.addActionListener( new KnopListener() );

        keer = new Button("*");
        keer.addActionListener(new KnopListener());
        deel = new Button("/");
        deel.addActionListener(new KnopListener());
        plus = new Button("+");
        plus.addActionListener(new KnopListener());
        min = new Button("-");
        min.addActionListener(new KnopListener());
        clear = new Button("C");
        clear.addActionListener(new KnopListener());

        add(tekstvak);
        add(tekstvak2);
        add(keer);
        add(deel);
        add(plus);
        add(min);
        add(clear);




    }

    public void paint(Graphics g) {
        setSize(1000, 1000);

    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1 = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());

            if (e.getSource() == keer) {
                som = getal1*getal2;
                tekstvak.setText(""+som);
                tekstvak2.setText("");
            }

            if (e.getSource() == deel) {
                som = getal1/getal2;
                tekstvak.setText(""+som);
                tekstvak2.setText("");
            }

            if (e.getSource() == plus) {
                som = getal1+getal2;
                tekstvak.setText(""+som);
                tekstvak2.setText("");
            }

            if (e.getSource() == min) {
                som = getal1-getal2;
                tekstvak.setText(""+som);
                tekstvak2.setText("");
            }

            if (e.getSource() == clear) {
                tekstvak.setText("");
                tekstvak2.setText("");
            }
        }
    }
}