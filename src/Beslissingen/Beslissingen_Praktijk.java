package Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen_Praktijk extends Applet {
    TextField tekstvak, tekstvak1;
    Button button;
    double cijfer;
    String resultaat, resultaat1;



    public void init() {
        tekstvak = new TextField("Type Je cijfers", 40);
        tekstvak1 = new TextField("", 40);

        button = new Button("Ok");
        button.addActionListener(new TekstvakListener());

        cijfer = 0;
        resultaat = "";


        add(tekstvak);
        add(tekstvak1);
        add(button);
    }

    public void paint(Graphics g) {
        this.setSize(600,600);
        g.drawString("Cijfer 1 is een: "+ resultaat,10,70);


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            repaint();
        }
    }

}