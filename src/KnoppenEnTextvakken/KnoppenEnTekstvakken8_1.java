package KnoppenEnTextvakken;
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnoppenEnTekstvakken8_1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop_reset;
    Label label;


    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label("Type iets in het tekstvakje ");
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        knop_reset = new Button("reset");
        knop_reset.addActionListener( new Knop_resetListener() );
        add(tekstvak);
        add(knop);
        add(knop_reset);
        add(label);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        this.setSize(1680,1050);
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            label.setText(tekstvak.getText());
            repaint();
        }
    }
    class Knop_resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            label.setText("Type iets in het tekstvakje");
            repaint();
        }
    }
}