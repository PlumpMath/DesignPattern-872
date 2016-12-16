package QA14_4;

public abstract class Support {
	// そのトラブル解決者の名前
	private String name;
	// たらい回しの先（次の人）
	private Support next;

	// トラブル解決者の生成
	public Support(String name) {
		this.name = name;
	}

	// たらい回しの先を設定
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	// トラブル解決の手順
	public final void support(Trouble trouble) {

		//ループ（問題14-4）
		for (Support obj = this; true; obj = obj.next) {
			if (obj.resolve(trouble)) {
				obj.done(trouble);
				break;
			} else if (obj.next == null) {
				obj.fail(trouble);
				break;
			}
		}
	}

	// 文字列表現
	public String toString() {
		return "[" + name + "]";
	}

	// 解決用メソッド
	protected abstract boolean resolve(Trouble trouble);

	// 解決
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	// 未解決
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
