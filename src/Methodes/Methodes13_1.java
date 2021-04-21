package Methodes;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Methodes13_1 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        tekenDriehoek(g,50,50,10,90,90,90);
    }
    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);
    }
}

