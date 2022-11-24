/**
 * 
 */
package inheritance1;


import java.util.ArrayList;
import java.util.Collections;

//import java.util.Arrays;

/**
 * @author b1021008 井上芽依
 *
 */
public class Wallet {
	//private PrepaidCard[] cards;
	private static ArrayList<PrepaidCard> cards;
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
    
    public boolean remove(String a) {
    	Collections.sort(cards);
    	for (PrepaidCard i: cards) {
    	   // System.out.println (a);
    		if(a.equals(i.getName())) {
    			cards.remove(i);
    			cards.get(cards.size()-1).charge(i.getCredit());
    			return true;
    		}
    }
    		return false;
    	}
         
  
         
    public void add(PrepaidCard c) {
        //this.cards[this.next++] = c;
    	if(c.getOwner().equals(owner)) {
    		cards.add(c);
    	}else {
    		
    	}
    }
    
    public String toString() {
    	String s = "Wallet owner:: " + owner + "\n";
        for (PrepaidCard i: cards) {
        	s=s+"Card: "+ i.toString() + "\n";
        }
        return s;
    }
    
    public boolean pay(String cardName, int price) {
		
		for(PrepaidCard c: this.cards) {
			if(c.getName().equals(cardName)) {
				return c.pay(price);
			}
		}
		
		return false;
	}
     

    public static void main(String[] args) {
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
//        System.out.println("--- before ---");
//        System.out.print(w);
//         
//        w.remove("nimoca");
//        w.remove("Sugoca");
//     
//        System.out.println("--- after ---");
//        System.out.print(w);
    	Wallet w = new Wallet("Taro Mirai");
        w.add(new PrepaidPointCard("Taro Mirai", "nimoca", 100));
        w.add(new PrepaidPointCard("Taro Mirai", "Suica", 200));
        w.add(new PrepaidPointCard("Taro Mirai", "PiTaPa", 300));
        w.add(new PrepaidCard("Taro Mirai", "SAPICA", 400));
        w.add(new PrepaidPointCard("Hana Mirai", "nimoca", 200));
        w.add(new PrepaidCard("Taro Mirai", "Sugoca", 10));
        w.add(new PrepaidPointCard("Taro Mirai", "Kitaca", 20));
                 
        w.sort();
             
        System.out.print(w);
        
        System.out.println("-------------------Payment:------------------");
        
        String message = "Pay-->PiTaPa, 100";
        System.out.println(message);
        boolean result1 = w.pay("PiTaPa", 100);
        message = "Result: " + result1;
        System.out.println(message);
        
        message = "Pay-->Pasmo, 100";
        System.out.println(message);
        boolean result2 = w.pay("Pasmo", 100);
        message = "Result: " + result2;
        System.out.println(message);
        
        message = "Pay-->Kitaca, 200";
        System.out.println(message);
        
        boolean result3= w.pay("Kitaca", 200);
        message = "Result: " + result3;
        System.out.println(message);
        
        message = "Pay-->Suica, 10";
        System.out.println(message);
        boolean result4 = w.pay("Suica", 10);
        message = "Result: " + result4;
        System.out.println(message);
        
        message = "Pay-->Kitaca, 10";
        System.out.println(message);
        boolean result5 = w.pay("Kitaca", 10);
        message = "Result: " + result5;
        System.out.println(message);
        
        message = "Pay-->Suica, 60";
        System.out.println(message);
        boolean result6 = w.pay("Suica", 60);
        message = "Result: " + result6;
        System.out.println(message);
        
        System.out.println("--------------------------------------------");
        System.out.print(w);
    }
    }


	/**
	 * 
	 */
	
