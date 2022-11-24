package cardBattle1;
/**
 * cardBattle1
 * 学生のプレイヤー（Playerクラスを継承）
 * XXXXは自分の学籍番号の下4桁
 * たとえば 1021123なら，Player1123
 * 
 * @author b1021008 InoueMei 
 *
 */
import java.util.*;

public class Player1008 extends Player {
	// メンバ変数
	private Random rnd;
	
	// コンストラクタ
	public Player1008() {
		super();
		this.rnd = new Random();
		// TODO: プレイヤー名を設定すること
		this.name = "mei" + rnd.nextInt(5); 
	}
	
	/*
	 * TODO: このメソッドを自分で作ること．
	 *  以下はサンプル
	 *  注意：
	 *  1. 札に書いてある得点がpointで与えられる
	 *  2. 初回かどうかはfirstでわかる
	 *  3. 前回全プレイヤーが出した札はlastCardsでわかる（初回以外）
	 *  4. 自分の残り手札はhandでわかる
	 *  5. 自分の得点はscoreでわかる
	 *  6. 前回重複したかどうかはduplicateでわかる
	 *  7. putCardメソッドを必ず呼んで，カードを場に出すこと
	 */
	@Override
	public void play(int point, boolean first) throws Exception {
		
		// 使える手札からランダムに提出
		int card = 0;
//		do {
//			card = rnd.nextInt(15) + 1;
//	} while (!isInHand(card));
//	
		if(first==true) {
		if(point<0 && point>=-5) {//マイナスが出たら手持ちで一番小さい数を出す
			card=point-(point-1);
		}
		if(point>0 && point<=5) {//0から5以下の数が出たら出た数に5を足す（できるだけでかい数になるけど、10は超えない）
			card=point+5;
		}
		if(point>5 && point<=10) {
			card=point+1;
		}
		}
		
		if(point<0 && point>=-5) {//マイナスが出たら手持ちで一番小さい数を出す
			card=point-(point-1);
		}
		if(point<0 && point>=-5) {
			card=point-(point-2);
		}
		if(point>5 && point<=10) {
			card=point+1;
		}
		System.out.println(this.lastCards);
		System.out.println(this.score);
		
			
		// 場に提出
		putCard(card);
		
		// メッセージを作る
		message = "を出します";
		
		
	}
	
	/*
	 * テスト用メイン
	 */
	public static void main(String[] args) throws Exception {
		// プレイヤーを作成して初期化
		Player p = new Player1008();
		// 15回手を出す
		for(int i = 0; i < 15; ++i) {
			p.play(15, true);
			System.out.println( p.getCard() + " " + p.say());
		}
	}
}
