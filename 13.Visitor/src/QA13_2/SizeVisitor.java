package QA13_2;

import java.util.Iterator;

//visitorの実装
public class SizeVisitor extends Visitor {
	// 現在注目しているディレクトリ名
	private String currentdir = "";

	// サイズ
	private int size = 0;

	public void visit(File file) {
		// 問題13-2
		this.size += file.getSize();
	}

	public void visit(Directory direcotry) {
		Iterator it = direcotry.iterator();

		while (it.hasNext()) {
			// 問題13-2
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
	}

	// 問題13-2
	public int getSize() {
		return this.size;
	}

}
