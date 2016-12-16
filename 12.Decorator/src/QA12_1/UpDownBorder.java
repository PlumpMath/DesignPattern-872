package QA12_1;

public class UpDownBorder extends Border {

	// 飾りとなる文字
	private char borderChar;

	protected UpDownBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	public int getColums() {
		// 文字数は中身の両側に飾り文字分を加えたもの
		return 1 + display.getColums() + 1;
	}

	public int getRows() {
		// 行数は中身の行数に同じ
		return 1+display.getRows()+1;
	}

	public String getRowText(int row) {
		// 指定行の内容は、中身の指定行の両側
		// に飾り文字をつけたもの

		if (row == 0) {
			// 枠の上端
			return makeLine(borderChar, display.getColums());
		} else if (row == display.getRows() + 1) {
			// 枠の下端
			return makeLine(borderChar, display.getColums());
		} else {
			// それ以外
			return display.getRowText(row-1);
		}

	}

	// 文字chをcount個連続させた文字列を作る
		private String makeLine(char ch, int count) {
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < count; i++) {
				buf.append(ch);
			}
			return buf.toString();
		}

}
