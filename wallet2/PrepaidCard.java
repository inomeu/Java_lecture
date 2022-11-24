
package wallet2;

import java.util.Arrays;



/**
 * @author b1021008 井上芽依
 *
 */
public class PrepaidCard implements Comparable{
	private String owner;
	private  int credit;
	private Object e;
	private String name;
	
	@Override
	//追加した
	public int compareTo(Object o) {
	    PrepaidCard c = (PrepaidCard)o;
	    return Integer.valueOf(this.credit).compareTo(Integer.valueOf(c.credit));
	}

	/*
	 *   コンストラクタ
	 */
	public PrepaidCard(String a,int b) {
		this.owner=a;
		this.credit=b;
		this.name=("");
		
	}
	public PrepaidCard(String c) {
		this.owner=c;
		this.credit=0;
		this.name=("");
	}
	public PrepaidCard(String a,String b,int c) {
		this.owner=a;
		this.name=b;
		this.credit=c;
	}
	
	//追加
	public String getName() { return this.name; }
	
	public String getOwner() { return this.owner; }
	public int getCredit() { return this.credit; }
	
	public void setOwner(String owner) { this.owner = owner; }
	
	public String toString() {
		//return "owner: "+ owner + " (credit: "+ credit +")";
		return name + " (" + "owner: " + owner +","+" credit: " + credit +")";
	}
	
	public int charge(int x) {
		if(x<0) {
			return credit;
		}else {
			credit=credit+x;
		}
	return credit;
	}
	
	public boolean pay(int y) {
		if(y<0||y>credit) {
			return false;
		}else{
			credit=credit-y;
			return true;
		}
	}

	public void transfer(PrepaidCard m) {
		if(! this.owner .equals(m.getOwner())) {
			m.credit=this.credit+m.getCredit();
			this.credit=0;
		}else {
			
		}
	}
		
	public static void transfer(PrepaidCard d,PrepaidCard e) {
		if((! d.getOwner().equals(e.getOwner()))) {
			e.credit=e.credit+d.getCredit();
			d.credit=0;
		}else {
	}
	}
		
	public static boolean transfer(PrepaidCard d,PrepaidCard e,int a) {
		if(d.getOwner().equals(e.getOwner())) {
			return false;
		}
			if(a<0 || d.credit<a) {
				return false;
			}else {
				d.credit=d.getCredit()-a;
				e.credit=e.getCredit()+a;
				return true;
			}
		}
	
	public static void main(String[] args) {
	    PrepaidCard [] cards = new PrepaidCard[5];
	    cards[0] = new PrepaidCard("Taro Mirai", "nimoca", 100);
	    cards[1] = new PrepaidCard("Taro Mirai", "Suica", 200);
	    cards[2] = new PrepaidCard("Taro Mirai", "PiTaPa", 300);
	    cards[3] = new PrepaidCard("Taro Mirai", "SAPICA", 400);
	    cards[4] = new PrepaidCard("Hana Mirai", "nimoca", 250);
	 
	    Arrays.sort(cards);
	    for (int i = 0; i < 5; i++) {
	        System.out.println("Card Info.:: " + cards[i].toString());
	    }
	}
		
			
//	public static void main(String[] args) {
//		PrepaidCard c1 = new PrepaidCard("Mirai Masaru");
//		System.out.println("Card Info.:: " + c1.toString());
//	}

}
