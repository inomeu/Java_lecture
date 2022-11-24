/**
 * 
 */
package medals2;

//import medals1.Color;

/**
 * @author b1021008 井上芽依
 *
 */
public class Country implements Comparable{
	
	private String name;
	private int gold, silver, bronze;
	
    public Country (String countryName) {
        this.name = countryName;
        this.gold = 0;
        this.silver = 0;
        this.bronze = 0;
 
    }
    
    public int compareTo(Object obj) {
        Country c = (Country) obj;
        // ここに作業3で処理を加える
        if(this.gold>c.gold) {
        	return -1;
        }else if(this.gold<c.gold) {
        	return 1;
        }else if(this.silver>c.silver) {
        	return -1;
        }else if(this.silver<c.silver){
        	return 1;
        }else if(this.bronze>c.bronze) {
        	return -1;
        }else if(this.bronze<c.bronze) {
        	return 1;
        }else {
        return this.name.compareTo(c.getName());
    }
    }

    
    public String getName() { return this.name; }


public void add(Color m) {
	//if(! m.equals(Gold)&& ! m.equals(Silver)&& !m.equals(Bronze)){
	if(m.equals(Color.Gold)){
		gold++;
	}
	if(m.equals(Color.Silver)) {
		silver++;
	}
	if(m.equals(Color.Bronze)) {
		bronze++;
	}
}



public String toString() {
	int sum;
	sum=gold+silver+bronze;
	return name + "("+ gold+","+ silver + "," + bronze +")" + "[" + sum +"]";
}
}

