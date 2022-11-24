/**
 * 
 */
package recursive;

/**
 * @author b1021008 井上芽依
 *
 */
public class Fibonacci {
	public int calcFn(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return calcFn(n-1)+calcFn(n-2);
        //再帰処理を書く
	}
	public static void main(String[] args) {
		int n = 20;
                Fibonacci fib = new Fibonacci();
		for(int i = 0;i < n;i++) {
			System.out.print(fib.calcFn(i) + " ");
		}
	}
}
