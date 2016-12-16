
public abstract class Entry {
	// 名前を得る
	public abstract String getName();

	// サイズを得る
	public abstract int getSize();

	// 親を設定（問題11-2）
	protected Entry parent;

	// エントリを追加する
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	// 一覧を表示する
	public void printList() {
		printList("");
	}

	// prefixを前につけて
	// 一覧を表示する
	protected abstract void printList(String prefix);

	// 文字列表現
	public String toString() {
		return getName() + "（" + getSize() + "）";
	}

	// フルパスを得る（問題11-2）
	public String getPath() {
		StringBuffer fullname = new StringBuffer();
		Entry entry = this;
		do {
			fullname.insert(0, "/" + entry.getName());
			entry = entry.parent;
		} while (entry != null);
		return fullname.toString();
	}
}
