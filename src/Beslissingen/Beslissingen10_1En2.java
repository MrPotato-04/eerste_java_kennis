package Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen10_1En2 extends Applet {
    TextField tekstvak;
    double number;
    double input1;
    String lastNumber;

    public void init() {
        tekstvak = new TextField("",100);
        tekstvak.addActionListener( new KnopListener());
        number = 0;
        add(tekstvak);
        lastNumber = "";

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        this.setSize(1680,1050);
        g.drawString("Highest nr. : " + number,20,20);
        g.drawString("Last nr. : "+lastNumber,20,40);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            input1 = Double.parseDouble(tekstvak.getText());
            lastNumber = "" + input1;
            if (number < input1) {
                number = input1;
                repaint();
            }
            tekstvak.setText("");
            repaint();

        }
    }
}