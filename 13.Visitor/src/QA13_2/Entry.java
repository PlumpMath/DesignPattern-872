package QA13_2;

public abstract class Entry implements Element{
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

	// 文字列表現
	public String toString() {
		return getName() + "（" + getSize() + "）";
	}

}
