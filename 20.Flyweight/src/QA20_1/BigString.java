package QA20_1;

/**
 * BigCharを集めて作った「大きな文字列」を表すクラス
 */
public class BigString {
	// 大きな文字を配列
	private BigChar[] bigchars;

	// コンストラクタ
	// TODO：QA20_1
	public BigString(String string, boolean shared) {
		if(shared){
			initShared(string);
		}else{
			initUnShared(string);
		}
	}

	// TODO
	// 共有して初期化
	private void initShared(String string) {
		// インスタンスを配列に変換
		bigchars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < bigchars.length; i++) {
			//TODO：存在するものを使う
			bigchars[i] = factory.getBigChar(string.charAt(i));
		}
	}

	// 共有してない初期化
		private void initUnShared(String string) {
			// インスタンスを配列に変換
			bigchars = new BigChar[string.length()];
			BigCharFactory factory = BigCharFactory.getInstance();
			for (int i = 0; i < bigchars.length; i++) {
				//TODO：新規しる
				bigchars[i] = new BigChar(string.charAt(i));
			}
		}

	// 配列を出力
	public void print() {
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i].print();
		}
	}
}
