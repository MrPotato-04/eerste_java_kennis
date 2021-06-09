package afsluitingJava;

import java.awt.*;
import java.applet.*;

public class java extends Applet  {
    int y =10;

    public void init() {

    }

    public void paint(Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.drawString("Anton Simons",10,y);
            if (i == 4) {
                y+=10;
                g.drawString("we zijn op de helft.",10,y);
            }
            y+=10;


        }

    }

}
