/**
 * 
 */
package recursive;

/**
 * @author b1021008 井上芽依
 *
 */
public class Factorial {
	public int fact(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*fact(n-1);
		}

        //停止条件を書く

//再帰呼び出しを書く
       // return xxx;
}

public static void main(String[] args) {
int value = 5;
        Factorial fa = new Factorial();
System.out.println(value + "! = " + fa.fact(value));
}
}
