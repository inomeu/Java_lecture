/**
 * 
 */
package javaintro;

/**
 * @author b1021008 井上芽依
 *
 */
public class FtoC {
	public static double ftoc(int deg_f) {
		return (deg_f - 32.0) / 1.8;
		// TODO Cのソースを参考に、華氏温度を摂氏温度に変換する処理を実装

	}

	public static void main(String[] args) {
		int deg_f = 100;
		System.out.println (deg_f + " Degrees Fahrenheit is " + ftoc (deg_f) + " Degrees Celsius.");
		// TODO ftocメソッドを呼び出して結果を表示

	}

}
