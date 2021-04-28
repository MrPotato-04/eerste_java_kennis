package Methodes;

import java.applet.Applet;
import java.awt.*;

public class Methodes_ChessBoard extends Applet {


    public void init() {

    }
    public void paint(Graphics g) {
        this.setSize(1600,1000);
        drawBoard(g);

    }

    void drawBoard( Graphics g){
        int offset=0;
        for (int j = 0; j < (7); j++) {
            for (int i = 0; i < (7); i++) {

                if(offset%2==0) {
                    drawSquare(g,Color.white,i*100,j*100);
                }
                else {
                    drawSquare(g,Color.black,i*100,j*100);
                }
                offset++;
            }

        }

    }
    void drawSquare(Graphics g,Color squareColor,int xSquare,int ySquare){
        g.setColor(squareColor);
        g.fillRect(xSquare,ySquare,100,100);
        g.setColor(Color.black);
        g.drawRect(xSquare,ySquare,100,100);



    }
}


