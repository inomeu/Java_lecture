/**
 * 
 */
package recursive;

/**
 * @author b1021008 井上芽依
 *
 */
public class Sequence3 {
	public int calcNum(int n) {
		int f=0;
		if(n<3) {
			return n;
		}
		if(n>=3) {
			f=calcNum(n-1)+calcNum(n-2)+calcNum(n-3);
		}
		return f;
	}
	public static void main(String[] args) {
        int n = 20;
        Sequence3 seq = new Sequence3();
        for(int i = 0; i < n; i++) {
            System.out.print(seq.calcNum(i) + " ");
        }
    }
}
