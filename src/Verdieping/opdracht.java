package Verdieping;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class opdracht extends Applet implements KeyListener {
    //direction strings
    String down = "Down"; String up = "Up"; String left = "Left"; String right = "Right", loss ="loss";
    String badDirection = up;
    String direction = down;
    String test = "false";
    int score = 0;
    int[] xstukken = new int[0];
    int[] ystukken = new int[0];



    int x = 20, y = 20,xId=0,yId=0,time;
    int fruitLocationRandY,fruitLocationRandX, fruitLocationX, fruitLocationY,fruitXid=0,fruitYid=0;
    boolean collideFruit = true;

    public void FruitLocation(){
        if(collideFruit == true){
            fruitLocationX = fruitLocationRandX;
            fruitLocationY = fruitLocationRandY;
            score++;
        }
    }

    public void growth(){
        int[] txstukken = new int[xstukken.length];
        int[] tystukken = new int[ystukken.length];
        //copy
        for (int i = 0; i < txstukken.length; i++) {
            txstukken[i] = xstukken[i];
            tystukken[i] = ystukken[i];
        }

        xstukken = new int[xstukken.length + 1];
        ystukken = new int[ystukken.length + 1];

        for (int i = 0; i < txstukken.length; i++) {
            xstukken[i] = txstukken[i];
            ystukken[i] = tystukken[i];
        }
    }
    public void growthMove(int xg,int yg){
        for (int i =1; i < xstukken.length; i++) {

        }
        xstukken[0]= xg;
        ystukken[0]= yg;
    }

    public void UpdateFruit(){
        fruitXid = (int)Math.round(Math.random()*19);
        fruitYid = (int)Math.round(Math.random()*19);
        fruitLocationRandX = 20+fruitXid*20;
        fruitLocationRandY = 20+fruitYid*20;
    }
    public void UpdateSnake(String[] args){

    }

    public void init(){
        this.setSize(700,700);
        this.requestFocus();
        addKeyListener(this);



        setBackground(Color.black);
        UpdateFruit();




    }
    public void paintBoard(Graphics g) {
        g.setColor(Color.yellow);
        g.drawRect(19, 19, 400, 400);

        g.setColor(Color.white);
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                g.drawRect(i * 20, j * 20, 20, 20);
            }
        }

    }

    public void paint(Graphics g) {
        showStatus("Score: "+score+" Time: "+time+" "+collideFruit);


        if(y<=9||y>=410||x<=9||x>=410){
            g.setColor(Color.red);
            g.setFont(new Font("",Font.BOLD,50));
            g.drawString("Game over",10,100);
            direction = loss;
        }
        g.setFont(new Font("",Font.PLAIN,10));
        //fruit
        FruitLocation();


        //snake
        g.setColor(Color.white);
        g.fillRect(x,y,20,20);

        g.setColor(Color.orange);
        g.fillRect(fruitLocationX,fruitLocationY,20,20);

        g.drawString(""+xId+"  "+yId,50,430);
        g.drawString(""+fruitXid+"  "+fruitYid,80,430);
        paintBoard(g);

        loop();

    }
    //loop
    public void loop() {

        if(direction == right){xId+=1;}
        if(direction == left){xId-=1;}
        if(direction == up){yId-=1;}
        if(direction == down){yId+=1;}
        if(direction == loss){yId=60;xId=60;}

        x = xId*20+20;
        y = yId*20+20;

        if(xId == fruitXid && yId == fruitYid && time>1){
            collideFruit = true;
            UpdateFruit();
            growth();
        }
        else {
            collideFruit = false;
        }


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        time++;
        repaint();
    }

    public void keyTyped(KeyEvent e) {
    }
    /** Handle the key-pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==e.VK_UP){
            if (y > 20) {
                if(badDirection != up) {
                    direction = up;
                    badDirection = down;
                }
            }

        }
        if(e.getKeyCode()==e.VK_DOWN){
            if (y < 410) {
                if(badDirection != down) {
                    direction = down;
                    badDirection = up;
                }
            }
        }
        if(e.getKeyCode()==e.VK_LEFT){
            if (x > 20) {
                if(badDirection != left) {
                    direction = left;
                    badDirection = right;
                }
            }
        }
        if(e.getKeyCode()==e.VK_RIGHT){
            if (x < 410) {
                if(badDirection != right) {
                    direction = right;
                    badDirection = left;
                }
            }
        }
    }
    /** Handle the key-released event from the text field. */
    public void keyReleased(KeyEvent e) {
    }


}

