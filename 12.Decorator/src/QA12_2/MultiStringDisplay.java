package QA12_2;

import java.util.ArrayList;

public class MultiStringDisplay extends Display {
	// 表示文字列
	private ArrayList list;

	// 引数の表示文字列を判定
	public MultiStringDisplay() {
		list=new ArrayList();
	}

	// 文字数
	public int getColums() {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			int length = list.get(i).toString().getBytes().length;
			if (length > max) {
				max = length;
			}
		}
		return max;
	}

	// 行数
	public int getRows() {
		return list.size();
	}

	// row番目の文字列を得る
	public String getRowText(int row) {
		return list.get(row).toString();
	}

	// 文字行追加
	public void add(String string) {
		list.add(string);
	}

}
