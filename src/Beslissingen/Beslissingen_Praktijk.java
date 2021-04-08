package Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen_Praktijk extends Applet {
    TextField tekstvak;
    Button button;
    double cijfer;
    int resultaat;
    String text;



    public void init() {
        tekstvak = new TextField("Type Je cijfer", 40);
        button = new Button("Ok");
        button.addActionListener(new TekstvakListener());

        cijfer = 0;
        text = "";


        add(tekstvak);
        add(button);
    }

    public void paint(Graphics g) {
        this.setSize(600,600);
        g.drawString("Uw cijfer is: "+ text,10,70);


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = Integer.parseInt(tekstvak.getText());
            switch (resultaat) {
                case 1:
                    text = "slecht";
                    break;
                case 2:
                    text = "slecht";
                    break;
                case 3:
                    text = "slecht";
                    break;
                case 4:
                    text = "onvoldoende";
                    break;
                case 5:
                    text = "matig";
                    break;
                case 6:
                    text = "voldoende";
                    break;
                case 7:
                    text = "voldoende";
                    break;
                case 8:
                    text = "goed";
                    break;
                case 9:
                    text = "goed";
                    break;
                case 10:
                    text = "goed";
                    break;
                default:
                    text = "error foutief cijfer";

            }

            repaint();
        }
    }

}