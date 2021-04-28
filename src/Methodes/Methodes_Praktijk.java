package Methodes;

import org.w3c.dom.css.RGBColor;

import java.applet.Applet;
import java.awt.*;

public class Methodes_Praktijk extends Applet {


    public void init() {

    }
    public void paint(Graphics g) {
        drawForrest(g,20,3);

    }

    void drawForrest( Graphics g,int widthForrest,int heightForrest){

        for (int j = 0; j < (heightForrest); j++) {
            for (int i = 0; i < (widthForrest); i++) {

                if(j%2==0) {
                    drawTree(g,50+i*100,j*100+50,40,40,5,60,Color.green,new Color(139,71,38));
                }
                else {
                    drawTree(g,100+i*100,j*100+50,40,40,5,60,Color.green,new Color(139,71,38));
                }

            }

        }

    }
    void drawTree(Graphics g,int xTree,int yTree,int widthLeaf,int heightLeaf,int widthStem,int heightStem,Color leafColor,Color stemColor){
        g.setColor(stemColor);
        g.fillRect(xTree-(widthStem/2),yTree,widthStem,heightStem);
        g.setColor(leafColor);
        g.fillOval(xTree-(widthLeaf-widthLeaf/4) ,yTree-(heightLeaf/2) ,widthLeaf ,heightLeaf );
        g.fillOval(xTree-widthLeaf/4 ,yTree-(heightLeaf/2) ,widthLeaf ,heightLeaf );
        g.fillOval(xTree-widthLeaf/2 ,yTree-heightLeaf ,widthLeaf ,heightLeaf );

    }
}


