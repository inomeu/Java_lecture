/**
 * 
 */
package graph1;

import java.util.*;
/**
 * @author b1021008 井上芽依
 *
 */
public class Point {
    // TODO インスタンス変数(フィールド)は必要に応じて宣言
	
	public int id;//int型のidをひとつ格納する場所のインスタンス
	public HashMap<Point,Integer> map;//「次の地点への経路」の格納場所
    /**
     * コンストラクタ
     * @param id 地点id
     */
    public Point(int id) {
        // TODO どんな処理が必要か各自で判断して実装
    	this.id=id;//コンストラクタ内で格納されたidを指定する
    	this.map=new HashMap<>();//コンストラクタ内で次の地点への経路への格納場所を指定する
    }
    
    /*
     * Point型引数とArrayList<Point>型引数の2つの引数を持つpathToメソッド
     */
    public void pathTo(Point a,ArrayList<Point> b) {
    	b.add(this);
    	
    	if(a.getId()==this.id) {
    		System.out.println(b);
    	}
    	if(!(a.getId()==this.id)) {
    		for(Map.Entry<Point,Integer> e:map.entrySet()) {
    			Point p=e.getKey();
    			int t=e.getValue();
    			p.pathTo(a,b);
    		}
    	}
    	
    	b.remove(b.size()-1);
    }
 
    /**
     * 地点idのゲッターメソッド
     * @return 地点id
     */
    public int getId() {
        // TODO どんな処理が必要か各自で判断して実装
        //return 0; // 仮実装のため、各自書き換える
    	return this.id;//ゲッターが機能するように実装する
    }
 
    /**
     * 地点pへの経路を追加
     * @param p 行き先
     * @param t 移動時間
     */
    public void addPath(Point p, int t) {
        // TODO どんな処理が必要か各自で判断して実装
//    	nmap=new HashMap<>();
//    	nmap.put(p,t);
    	//this.map.put(p, Integer.valueOf(t));//addPathで登録される「次の地点への経路」を複数格納する場所が必要
    	this.map.put(p, t);
    	//保存方法を参照（String型pをkeyとして、Integerのオブジェクト（整数のラッパークラス）tを格納する場合）Integer.valueOf(t))
    }
 
    /**
     * 地点goalへの移動時間を返す
     * @param goal 行き先
     * @return 移動時間
     */
    public int timeTo(Point goal) {
        // TODO 問題文の指示に沿って実装
    	if(goal.getId()==this.id) {//goalのidと自分自身のidが等しいかどうかを比較する、goalのidはgeter()で呼び出す
    		return 0;
    	}else {
    		/*文字列と整数のペアを格納するHashMap変数mapに格納されているすべての文字列keyと整数valueのペアに対して、
    		 * forループを用いて何らかの処理を行いたい場合の拡張for文
    		 */
    		for(Map.Entry<Point,Integer>e:this.map.entrySet()) {//拡張for文
    			if(e.getKey().id==goal.id) {//引数で指定された地点が含まれるかどうかを判定するには、HashMapの要素を一つずつ取り出してidを確認する
    				return e.getValue();
    			}
    		}
    		return Integer.MAX_VALUE;
    	}
 
       // return 0; // 仮実装のため、各自書き換える
    }
 
    /*
     * @return idを文字列化したもの
     */
    public String toString() {
        // TODO どんな処理が必要か各自で判断して実装
        return String.valueOf(this.id);
    }
}