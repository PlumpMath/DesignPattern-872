
public abstract class Builder {
	private int index = 0;

	// Title作成
	public abstract void makeTitle(String title);

	// 文字列作成
	public abstract void makeString(String str);

	// 項目作成
	public abstract void makeItems(String[] items);

	// ビルド完了
	public abstract void close();
}
