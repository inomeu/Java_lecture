/**
 * 
 */
package recursive;

/**
 * @author b1021008 井上芽依
 *
 */
public class Combination {
	public int nCr(int n, int r) {
		//nCrを求める再帰メソッドを実装
			if(n==0) {
				return 1;
			}
			if(r==0) {
				return 1;
			}
			if(r==n) {
				return 1;
			}
		return nCr(n-1,r)+nCr(n-1,r-1);
		}
		
		


public static void main(String[] args) {
	int n = 4;
	int r = 2;
           Combination comb = new Combination();
	System.out.println(n + "C" + r + " = " + comb.nCr(n,r));
	
}

}
