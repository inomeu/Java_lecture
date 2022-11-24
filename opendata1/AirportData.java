/**
 * 
 */
package opendata1;

/**
 * @author b1021008 井上芽依
 *
 */
import opendata0.ReadFromURL;
import java.util.*;

public class AirportData {
	private static final String URL = "http://linkdata.org/download/rdf1s2795i/link/airport_japan.txt";
	private static final String CODE = "UTF-8";	
	private final int INDEX_NICKNAME = 2;
	protected ArrayList<String> data;
	protected int count;
	
//	public ArrayList<String> readData() { return this.data; }
//	public ArrayList<String> getData() { return this.data; }
	public int getCount() { return this.count; }
	
//	
//	public static void main(String[] args) {
//		ReadFromURL data = new ReadFromURL(null, null);
//	}
	
	public AirportData() {
		//public static void main(String[] args){
			ReadFromURL rcsv = new ReadFromURL(URL,CODE);
			rcsv.readData();
			data = rcsv.getData();
			this.count=0;
	}
	
	
	public void preview() {
		for (String w: data)
			if(!w.startsWith("#")){
				//String s = URL;
				String word []= w.split("\t");
			//for (String w: word) System.out.print( "(" + w + ")");
		try {
			//例外が発生する可能性のある処理
				System.out.println(word[INDEX_NICKNAME]);
		} catch (Exception e) {
			//例外が発生した場合の処理
			   count++;
		   }
			}
		}
	
	
	public static void main(String[] args) {
		AirportData trfd = new AirportData();
		trfd.preview();
		System.out.println("Exceptions: " + trfd.getCount());		
	}

}
