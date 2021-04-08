package Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen10_5 extends Applet {
    TextField tekstvak, tekstvak1;
    Button button;
    double cijfer1,cijfer2,gemidelde;
    int cijfer;
    String resultaat, resultaat1,s;



    public void init() {
        tekstvak = new TextField("Type Je cijfers", 40);
        tekstvak1 = new TextField("", 40);

        button = new Button("Ok");
        button.addActionListener(new TekstvakListener());

        cijfer1 = 0;
        cijfer2 = 0;
        cijfer = 5;
        gemidelde = 0;
        resultaat = "";
        resultaat1 = "";
        s = "";

        add(tekstvak);
        add(tekstvak1);
        add(button);
    }

    public void paint(Graphics g) {
        this.setSize(600,600);
        g.drawString("Cijfer 1 is een: "+ resultaat,10,70);
        g.drawString("Cijfer 2 is een: "+resultaat1,10,90);
        g.drawString("Het gemidelde is: "+gemidelde+s,10,110);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer1 = Double.parseDouble(tekstvak.getText());
            cijfer2 = Double.parseDouble(tekstvak1.getText());
            if (cijfer1 > cijfer && cijfer1 < 11) {
                resultaat = "Voldoende";
            }
            else if (cijfer1<cijfer&&cijfer1>-1) {
                resultaat = "onvoldoende";
            }
            else
                resultaat = "Error cijfer niet mogelijk";
            if (cijfer2 > cijfer && cijfer2 < 11) {
                resultaat1 = "Voldoende";
            }
            else if (cijfer2<cijfer&&cijfer2>-1) {
                resultaat1 = "onvoldoende";
            }
            else
                resultaat1 = "Error cijfer niet mogelijk";
            gemidelde = (cijfer1+cijfer2)/2;
            if (gemidelde>cijfer){
                s = " U bent geslaagd";
            }
            else
                s = " gezakt";



            repaint();
        }
    }

}