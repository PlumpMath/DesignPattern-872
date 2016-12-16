
public class SideBorder extends Border {

	// 飾りとなる文字
	private char borderChar;

	protected SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	public int getColums() {
		// 文字数は中身の両側に飾り文字分を加えたもの
		return 1 + display.getColums() + 1;
	}

	public int getRows() {
		// 行数は中身の行数に同じ
		return display.getRows();
	}

	public String getRowText(int row) {
		// 指定行の内容は、中身の指定行の両側
		// に飾り文字をつけたもの
		return borderChar + display.getRowText(row) + borderChar;
	}

}
