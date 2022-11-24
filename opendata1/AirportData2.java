/**
 * 
 */
package opendata1;


import java.util.*;
/**
 * @author b1021008 井上芽依
 *
 */
public class AirportData2 extends AirportData {
	private final int INDEX_NAME = 1;
    private final int INDEX_TYPE = 8;
    private final int INDEX_LAT = 19;
    private final int INDEX_LNG = 20;
    private final int INDEX_RUNWAY = 30;
    protected ArrayList<Airport> data2;
    protected int total;
    protected double average;
    
    public AirportData2() {
    	super();
    	data2=new ArrayList<Airport>();
    	total=0;
    	average=0;
    }
    
    public void register() {
    	Airport x;
    	for (String w: super.data) {
    		String word []= w.split("\t");
    		try {
    			x=new Airport(word[INDEX_NAME],word[INDEX_TYPE],Double.parseDouble(word[INDEX_LAT]),Double.parseDouble(word[INDEX_LNG]),word[INDEX_RUNWAY]);
    	        data2.add(x);
    	        total+=x.getRunways().length;
    		}catch(Exception e) {
    		count++;
    	}
    	}
    	average=(double)this.total/(double)this.data2.size();
    }
    
    public String toString() {
        String sumStr = "";
        int t = 0;
        for(Airport ap: data2) {
          //sumStr += ap + "\n";
          sumStr += ap.toString() + "\n";
          t++;
        }
        return sumStr + "Airport total: " + t + "\n" + "Runway total: " + total + "\n" + "average: " + average;
      }

    
    public static void main(String[] args) {
		AirportData2 trfd = new AirportData2();
		trfd.register();
		System.out.println(trfd.toString());
	}

  
}
