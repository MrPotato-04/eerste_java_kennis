package Verdieping;

import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Game {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game (){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        frame = new JFrame("snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

        label =new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,10,10);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
        label.getActionMap().put("upAction",upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
        label.getActionMap().put("downAction",downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
        label.getActionMap().put("leftAction",leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        frame.add(label);
        frame.setVisible(true);

    }
    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
        }
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
        }
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());
        }
    }
}
