package Verdieping;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Verdieping14_2 extends Applet {

    double r1;
    int deckInt;
    String[] deck,player1,player2,player3,player4;

    public void init() {
        player1 =new String[13];
        player2 =new String[13];
        player3 =new String[13];
        player4 =new String[13];
        deck =new String[] {
                " Ace of Hearts","2 of Hearts","3 of Hearts","4 of Hearts","5 of Hearts","6 of Hearts","7 of Hearts","8 of Hearts","9 of Hearts","10 of Hearts",
                "Jack of Hearts","Queen of Hearts","King of Hearts",
                " Ace of Diamonds","2 of Diamonds","3 of Diamonds","4 of Diamonds","5 of Diamonds","6 of Diamonds","7 of Diamonds","8 of Diamonds","9 of Diamonds","10 of Diamonds",
                "Jack of Diamonds","Queen of Diamonds","King of Diamonds",
                " Ace of Clubs","2 of Clubs","3 of Clubs","4 of Clubs","5 of Clubs","6 of Clubs","7 of Clubs","8 of Clubs","9 of Clubs","10 of Clubs",
                "Jack of Clubs","Queen of Clubs","King of Clubs",
                " Ace of Spades","2 of Spades","3 of Spades","4 of Spades","5 of Spades","6 of Spades","7 of Spades","8 of Spades","9 of Spades","10 of Spades",
                "Jack of Spades","Queen of Spades","King of Spades",
        };
        for (int i = 0; i < 13; i++) {
            player1[i] = deelKaart();
            player2[i] = deelKaart();
            player3[i] = deelKaart();
            player4[i] = deelKaart();
        }
        }

    public void paint(Graphics g) {
        int x=50;
        int y=30;
        g.drawString("Player1", x, 15);
        g.drawString("Player2", x+150, 15);
        g.drawString("Player3", x+300, 15);
        g.drawString("Player4", x+450, 15);
        for (int i = 0; i < 13; i++) {
            g.drawString(player1[i], x, i*y);
            g.drawString(player2[i], x+150, i*y);
            g.drawString(player3[i], x+300, i*y);
            g.drawString(player4[i], x+450, i*y);
        }

    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }
}
