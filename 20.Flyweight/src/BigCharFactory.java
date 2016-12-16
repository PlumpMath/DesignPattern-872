import java.util.HashMap;

/**
 * BigCharのインスタンスを共有しながら生成するクラス
 */
public class BigCharFactory {
	//すでに作ったBigCharのインスタンスを管理
	private HashMap pool = new HashMap();
	//Singletonパターン
	private static BigCharFactory singleton = new BigCharFactory();

	private BigCharFactory() {
	}

	//唯一のインスタンスを得る
	public static BigCharFactory getInstance() {
		return singleton;
	}

	//BigCharのインスタンスを得る
	public synchronized BigChar getBigChar(char charname) {
		//Listから大文字を得る
		BigChar bc = (BigChar) pool.get("" + charname);
		if (bc == null) {
			//ここでBigCharのインスタンスを生成
			bc = new BigChar(charname);
			pool.put("" + charname, bc);
		}
		return bc;
	}
}
