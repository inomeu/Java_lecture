/**
 * 
 */
package sphere;
import java.util.Random;
/**
 * @author b1021008 井上芽依
 *
 */
public class Sphere {
	static Random  rnd = new Random();
	
	public static double calc(int n) {
		double p = 0.0;
		double x, y, z;
		int s = 0;
        
        for(int i=0;i<n;i++){
        	x=rnd.nextDouble();
            y=rnd.nextDouble();
            z=rnd.nextDouble();
        	if((x*x+y*y+z*z)<=1.0){
        		s++;
        		}
        	}
        p=(double)s/(double)n*8;

        // ここに，半径１の球の体積の近似値を求めるプログラムを記述．結果をpに返す
		// n回繰り返すものとする．点の座標を表す3つの変数をx, y, z，
		// 球内の点の個数を集計する変数をsとしている
		// 0から1未満の乱数は，「rnd.nextDouble()」とすれば得られる．
		// この場合3つの変数にそれぞれ乱数を入れることに注意
		// 集計で求められた体積は球全体の1/8であることに注意
		
		return p;
	}

	// n=100回と10万回について，近似実数値を表示
public static void main(String[] args) {
		System.out.println( calc(100) );
		System.out.println( calc(100000) );
}
}