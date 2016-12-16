package QA_7_1;

public interface Builder {
	//Title作成
	public abstract void makeTitle(String title);

	//文字列作成
	public abstract void makeString(String str);

	//項目作成
	public abstract void makeItems(String[] items);

	//ビルド完了
	public abstract void close();
}
