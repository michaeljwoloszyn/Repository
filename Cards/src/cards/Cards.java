package cards;
import java.util.*;
public class Cards {

    public static void main(String[] args) {
        String[] cards = new String[52];
        int t=1;
        for(int j=0; j<cards.length; j++){
            cards[j]=t+"Diamond";
            j++;
            cards[j]=t+"Heart";
            j++;
            cards[j]=t+"Club";
            j++;
            cards[j]=t+"Spade";
            t++;
        }
        for(int j=0; j<cards.length; j++){
            System.out.println(cards[j]);
        }
    }
}
