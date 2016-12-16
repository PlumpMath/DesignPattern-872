package QA12_1;

public abstract class Border extends Display {
	//この飾り枠の中身
	protected Display display;

	//インスタンス生成時に「中身」を引数で設定
	protected Border(Display display) {
		this.display = display;
	}
}
