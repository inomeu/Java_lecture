/**
 * 
 */
package wallet1;

import java.util.ArrayList;
import java.util.Collections;

//import java.util.Arrays;

/**
 * @author b1021008 井上芽依
 *
 */
public class Wallet {
	//private PrepaidCard[] cards;
	private ArrayList<PrepaidCard> cards;
    //private int next;
    private String owner;
     
//    public Wallet(String owner, int max_cards) {
//        this.cards = new PrepaidCard[max_cards];
//        this.next = 0;
//        this.owner = owner;
//    }
    
    public Wallet(String owner) {
        // 作業1: ここで変数cardsを初期化する
    	this.cards=new ArrayList<>();
        this.owner = owner;
    }

         
    public void sort() {
    	Collections.sort(cards);
    }
         
    public void add(PrepaidCard c) {
        //this.cards[this.next++] = c;
    	cards.add(c);
    }
    
    public String toString() {
    	String s = "Wallet owner:: " + owner + "\n";
        for (PrepaidCard i: cards) {
        	s=s+"Card: "+ i.toString() + "\n";
        }
        return s;
    }
     
//    public static void main(String[] args) {
//        Wallet w = new Wallet("Taro Mirai", 10);
//        w.add(new PrepaidCard("Hana Mirai", "nimoca", 250));
//        w.add(new PrepaidCard("Taro Mirai", "Suica", 200));
//        w.add(new PrepaidCard("Taro Mirai", "PiTaPa", 300));
//        w.add(new PrepaidCard("Taro Mirai", "nimoca", 100));
//        w.add(new PrepaidCard("Taro Mirai", "SAPICA", 400));
//             
//        w.sort();
//             
//        for (int i = 0; i < w.cards.length; i++) {
//            if (w.cards[i] != null) {
//                System.out.println(w.cards[i]);
//            }
//        }
//    public static void main(String[] args) {
//        Wallet w = new Wallet("Taro Mirai");
//        w.add(new PrepaidCard("Taro Mirai", "nimoca", 100));
//        w.add(new PrepaidCard("Taro Mirai", "Suica", 200));
//        w.add(new PrepaidCard("Taro Mirai", "PiTaPa", 300));
//        w.add(new PrepaidCard("Taro Mirai", "SAPICA", 400));
//        w.add(new PrepaidCard("Hana Mirai", "nimoca", 200));
//        w.add(new PrepaidCard("Taro Mirai", "Sugoca", 10));
//        w.add(new PrepaidCard("Taro Mirai", "Kitaca", 20));
//             
//        w.sort();
//         
//        for (int i = 0; i < w.cards.size(); i++) {
//            System.out.println(w.cards.get(i));
//        }
//    }
    public static void main(String[] args) {
        Wallet w = new Wallet("Taro Mirai");
        w.add(new PrepaidCard("Taro Mirai", "nimoca", 100));
        w.add(new PrepaidCard("Taro Mirai", "Suica", 200));
        w.add(new PrepaidCard("Taro Mirai", "PiTaPa", 300));
        w.add(new PrepaidCard("Taro Mirai", "SAPICA", 400));
        w.add(new PrepaidCard("Hana Mirai", "nimoca", 200));
        w.add(new PrepaidCard("Taro Mirai", "Sugoca", 10));
        w.add(new PrepaidCard("Taro Mirai", "Kitaca", 20));
             
        w.sort();
         
        System.out.print(w);
    }
    }


	/**
	 * 
	 */
	
