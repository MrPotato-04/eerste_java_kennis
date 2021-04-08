package Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen10_3En4 extends Applet {
    TextField tekstvak, tekstvak1;
    Label label;
    String dag1,dag2,tekst, dagen,schrikkelJaar,dagF;
    int maanden;
    double jaartal;



    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maand nr. en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak1 = new TextField("", 20);
        tekstvak1.addActionListener( new Tekstvak1Listener() );
        tekst = "";
        dagen = "";
        schrikkelJaar = "";
        dag1 = ""+31;
        dag2 = ""+30;
        dagF = ""+28;
        add(label);
        add(tekstvak);
        add(tekstvak1);
    }

    public void paint(Graphics g) {
        this.setSize(500,600);
        g.drawString("Maand: "+tekst, 50, 90 );
        g.drawString("Dagen: "+dagen, 50, 110 );
        g.drawString(""+schrikkelJaar, 50, 130 );
        g.drawString("Type een jaar", 30, 50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maanden = Integer.parseInt(tekstvak.getText());
            switch(maanden) {
                case 1:
                    tekst = "Januari";
                    dagen = dag1;
                    break;
                case 2:
                    tekst = "Februari";
                    dagen = dagF;
                    break;
                case 3:
                    tekst = "Maart";
                    dagen =  dag1;
                    break;
                case 4:
                    tekst = "April";
                    dagen =  dag2;
                    break;
                case 5:
                    tekst = "Mei";
                    dagen =  dag1;
                    break;
                case 6:
                    tekst = "Juni";
                    dagen =  dag2;
                    break;
                case 7:
                    tekst = "Juli";
                    dagen =  dag1;
                    break;
                case 8:
                    tekst = "Augustus";
                    dagen =  dag1;
                    break;
                case 9:
                    tekst = "September";
                    dagen =  dag2;
                    break;
                case 10:
                    tekst = "Oktober";
                    dagen =  dag1;
                    break;
                case 11:
                    tekst = "November";
                    dagen =  dag2;
                    break;
                case 12:
                    tekst = "December";
                    dagen =  dag1;
                    break;
                default:
                    if (maanden < 0) {
                        tekst = " negative maanden, ja man";
                    }
                    else if (maanden > 12) {
                        tekst = "ik weet niet hoeveel maanden jouw jaar heeft, vriend";
                    }
                    else
                        tekst = "dat is geen nr. man";
            }

            repaint();
        }
    }
    class Tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jaartal = Double.parseDouble(tekstvak1.getText());
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                dagF = ""+29;
                schrikkelJaar = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                schrikkelJaar = ""+ jaartal + " is geen schrikkeljaar";
                dagF = ""+28;
            }

            repaint();
        }
    }

}