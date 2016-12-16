import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
	// ディレクトリの名前
	private String name;
	// ディレクトリエントリの集合
	private ArrayList directory = new ArrayList();

	// コンストラクタ
	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		int size = 0;
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	// エントリの追加
	public Entry add(Entry entry) {

		directory.add(entry);

		// 親をセット（問題11-2）
		entry.parent = this;

		return this;
	}

	// Iteratorの生成
	public Iterator iterator() {
		return directory.iterator();
	}

	// 訪問者の受け入れ
	public void accept(Visitor v) {
		v.visit(this);
	}

}
