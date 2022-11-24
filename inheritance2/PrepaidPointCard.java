/**
 * 
 */
package inheritance2;

//import inheritance1.PrepaidCard;

/**
 * @author b1021008 井上芽依
 *
 */
public class PrepaidPointCard extends PrepaidCard{
	private int commonPoint;

public PrepaidPointCard(String a, String b, int c) {
	super(a, b, c);
	this.commonPoint=0;
}
public int getCommonPoint() { return this.commonPoint; }

public boolean pay(int x) {
	boolean result = super.pay(x);
	if(result==true) {
		commonPoint=(int) ((int) this.commonPoint+(x*0.1));
	}
	return result;
}
public String toString() {
	//return "owner: "+ owner + " (credit: "+ credit +")";
	return getName() + " (" + "owner: " + getOwner() + ", " + "credit: " + getCredit() + ", " + "point: " + commonPoint +")";			}

}