package Verdieping;
import java.applet.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.math.*;


public class test extends Applet {
    int[] test = {1,2,3,4};
    int[] temp = new int[4];


    public void init() {
        //nodig voor copy
        for (int i = 0; i < temp.length; i++) {
            temp[i] = test[i];
        }


        for (int i =1; i < test.length; i++) {
            test[i]=temp[i-1];
        }
        test[0]=8;
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        System.out.println("//////////////");

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

    }
}

