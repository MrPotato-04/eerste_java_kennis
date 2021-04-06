package KnoppenEnTextvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnoppenEnTekstvakken8_2 extends Applet {
    Button Button_man, Button_vrouw, Button_POman, Button_POvrouw;
    int man, vrouw, POman, POvrouw;




    public void init() {
        man = 0;
        vrouw = 0;
        POman = 0;
        POvrouw = 0;

        Button_man = new Button("Man");
        Button_vrouw = new Button("Vrouw");
        Button_POman = new Button("potentiële man");
        Button_POvrouw = new Button("potentiële Vrouw");

        Button_man.addActionListener( new KnopListener() );
        Button_vrouw.addActionListener( new KnopListener() );
        Button_POman.addActionListener( new KnopListener() );
        Button_POvrouw.addActionListener( new KnopListener() );

        add(Button_man);
        add(Button_vrouw);
        add(Button_POman);
        add(Button_POvrouw);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.drawString("Man(nen): " + man, 20, 50);
        g.drawString("Vrouw(en): " + vrouw, 20, 70);
        g.drawString("Potentiële Man(nen): " + POman, 20, 90);
        g.drawString("Potentiële Vrouw(en): " + POvrouw, 20, 110);


    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent evt ) {
            if (evt.getSource() == Button_man) {
                man++;
                repaint();
            }
            if (evt.getSource() == Button_vrouw) {
                vrouw++;
                repaint();
            }
            if (evt.getSource() == Button_POman) {
                POman++;
                repaint();
            }
            if (evt.getSource() == Button_POvrouw) {
                POvrouw ++;
                repaint();
            }


        }
    }
}