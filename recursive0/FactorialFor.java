/**
 * 
 */
package recursive0;

/**
 * @author b1021008 井上芽依
 *
 */
public class FactorialFor {
	public static int fact(int n) {
		//n=valueで考える
		int ans=1;
		for(int i=1;i<=n;i++) {
				ans=ans*i;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int value = 5;//範囲
		System.out.println(value + "! = " + fact(value));//fact関数の中の引数にvalue入れて考える（mainからFactorialFor)
	}
}
