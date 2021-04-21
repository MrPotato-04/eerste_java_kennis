package Methodes;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Methodes13_2En3 extends Applet {


    public void init() {
    }
    public void paint(Graphics g) {
        drawWall(g,15,4,33,33,Color.green);
    }

    void drawWall( Graphics g,int widthWall,int heightWall,int widthBrick,int heightBrick,Color brickColor){
        g.setColor(brickColor);


        for (int j = 0; j < heightWall ; j++) {
            for (int i = 0; i < widthWall; i++) {
                if(j%2==0) {
                    g.fillRect(i * (widthBrick + 5), j * (heightBrick + 5), widthBrick, heightBrick);
                    g.setColor(Color.gray);
                    g.drawRect(i * (widthBrick + 5), j * (heightBrick + 5), widthBrick, heightBrick);
                    g.setColor(brickColor);
                }
                else {
                    g.fillRect(widthBrick/2+(i * (widthBrick + 5)), j * (heightBrick + 5), widthBrick, heightBrick);
                    g.setColor(Color.gray);
                    g.drawRect(widthBrick/2+(i * (widthBrick + 5)), j * (heightBrick + 5), widthBrick, heightBrick);
                    g.setColor(brickColor);
                }

            }

        }

    }
}


