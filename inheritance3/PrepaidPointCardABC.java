/**
 * 
 */
package inheritance3;

/**
 * @author b1021008 井上芽依
 *
 */
public class PrepaidPointCardABC extends PrepaidPointCard{
	private int abcPoint;

public PrepaidPointCardABC(String a, String b, int c) {
	super(a, b, c);
	this.abcPoint=0;
}

public int getAbcPoint() { return this.abcPoint; }

public boolean pay(int x) {
	boolean result = super.pay(x);
	if(result==true) {
		abcPoint++;
	}
	return result;
}

public String toString() {
	//return "owner: "+ owner + " (credit: "+ credit +")";
	return getName() + " (" + "owner: " + getOwner() + ", " + "credit: " + getCredit() + ", " + "point: " + getCommonPoint() + "," + " ABC point: "+ abcPoint + ")";			}

}