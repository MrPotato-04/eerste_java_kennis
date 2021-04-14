package Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Herhaling11_9 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(1500,600);
        int x = 50;
        int y = 50;
        //rij 1
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        x = 50;
        y += 50;
        //rij 2
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
            }
        x = 50;
        y +=50;
        //rij 3
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        x = 50;
        y +=50;
        //rij 4
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        x = 50;
        y +=50;
        //rij 5
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        x = 50;
        y +=50;
        //rij 6
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        x = 50;
        y +=50;
        //rij 7
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        x = 50;
        y +=50;
        //rij 8
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.drawRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
                g.drawRect(x, y, 50, 50);

            }
            x +=50;
        }
        }
    }
