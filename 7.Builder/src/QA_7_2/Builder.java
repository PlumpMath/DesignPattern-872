package QA_7_2;

public abstract class Builder {
	private int index = 0;

	private boolean initialized = false;

	// Title作成
	public void makeTitle(String title) {
		if (!initialized) {
			buildTitle(title);
			initialized = true;
		}
	}

	// 文字列作成
	public void makeString(String str) {
		if (initialized) {
			buildString(str);
		}
	}

	// 項目作成
	public void makeItems(String[] items) {
		if (initialized) {
			buildItems(items);
		}
	}

	// ビルド完了
	public void close() {
		if (initialized) {
			buildDone();
		}
	}

	// Title作成
	protected abstract void buildTitle(String title);

	// 文字列作成
	protected abstract void buildString(String str);

	// 項目作成
	protected abstract void buildItems(String[] items);

	// ビルド完了
	protected abstract void buildDone();
}
