package QA12_2;

public class FullBorder extends Border {

	protected FullBorder(MultiStringDisplay display) {
		super(display);
	}

	public int getColums() {
		// 文字数は中身の両側に飾り文字分を加えたもの
		return 1 + display.getColums() + 1;
	}

	public int getRows() {
		// 行数は中身の行数に同じ
		return 1 + display.getRows() + 1;
	}

	// 指定した行の内容
	public String getRowText(int row) {
		if (row == 0) {
			// 枠の上端
			return "+" + makeLine('-', display.getColums()) + "+";
		} else if (row == display.getRows() + 1) {
			// 枠の下端
			return "+" + makeLine('-', display.getColums()) + "+";
		} else {
			// それ以外
			int length = display.getRowText(row - 1).getBytes().length;
			return "|" + display.getRowText(row - 1) + makeLine(' ', display.getColums() - length) + "|";
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
