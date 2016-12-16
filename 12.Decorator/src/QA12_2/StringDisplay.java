package QA12_2;

public class StringDisplay extends Display {
	// 表示文字列
	private String string;

	// 引数の表示文字列を判定
	public StringDisplay(String string) {
		this.string = string;
	}

	// 文字数
	public int getColums() {
		return string.getBytes().length;
	}

	// 行数
	public int getRows() {
		return 1;
	}

	// row番目の文字列を得る
	public String getRowText(int row) {
		if (row == 0) {
			return string;
		} else {
			return null;
		}
	}

}
