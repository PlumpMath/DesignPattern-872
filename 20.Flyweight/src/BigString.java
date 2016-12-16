/**
 * BigCharを集めて作った「大きな文字列」を表すクラス
 */
public class BigString {
	//大きな文字を配列
	private BigChar[] bigchars;

	//コンストラクタ
	public BigString(String string) {
		//インスタンスを配列に変換
		bigchars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i] = factory.getBigChar(string.charAt(i));
		}
	}

	//配列を出力
	public void print() {
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i].print();
		}
	}
}
