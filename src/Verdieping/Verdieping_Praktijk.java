package Verdieping;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Verdieping_Praktijk extends Applet {
    TextField tekstvak;
    int smileys,takeOnTurn;
    Button knop;
    Label title;

    int[] optimalSmilCount;


    public void init() {
        optimalSmilCount = new int[6];
        smileys = 23;
        title = new Label("Hoeveel smileys neem je (één, twee of drie)?");
        tekstvak = new TextField("", 10);
        knop = new Button("Ok");
        tekstvak.addActionListener(new KnopListener());
        knop.addActionListener(new KnopListener());

        add(title);
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString("smiley's "+smileys,50,50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            takeOnTurn = Integer.parseInt(tekstvak.getText());
            repaint();
            algorithm();
        }
    }
     void algorithm (){

     }
}
