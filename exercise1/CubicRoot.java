/**
 * 
 */
package exercise1;

/**
 * @author b1021008 井上芽依
 *
 */
public class CubicRoot {
	public static double calcCBRoot(int calcCBRoot) {
		
		if(calcCBRoot<=0) {
			return 0.0;
		}
		
		double x_0;
		double x_n1;
		//int i;
		x_0=1.0;
		x_n1=0;
		double epsilon = 1e-10;  //10の-10乗
		
	
		for( ; ; ) {
			x_n1=(2*x_0+calcCBRoot/(x_0*x_0))/3;
			
			if(Math.abs(x_n1 - x_0) < epsilon) 
				break;
			x_0=x_n1;
			System.out.println(x_n1);
	}
		
		
		return x_n1;
		
		
		}
		
		
	//public static void main(String[] args) {
		
	//	System.out.println(calcCBRoot(80));
	public static void main(String[] args) {
		int[] testData = {
				177284860,
				259035259,
				581542783,
				1528114004,
				1933225154,
				2135616153
		};
		for (int i = 0; i < testData.length; i++) {
			System.out.println(calcCBRoot(testData[i]));
		}
	}
	
}