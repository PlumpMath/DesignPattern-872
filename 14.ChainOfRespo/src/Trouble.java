
public class Trouble {
	// トラブル番号
	private int number;

	// トラブル生成
	public Trouble(int number) {
		this.number = number;
	}

	// トラブル番号を得る
	public int getNumber() {
		return number;
	}

	// トラブルの文字列表現
	public String toString() {
		return "[Trouble " + number + "]";
	}
}
