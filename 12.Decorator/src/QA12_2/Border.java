package QA12_2;

public abstract class Border extends MultiStringDisplay {
	//この飾り枠の中身
	protected MultiStringDisplay display;

	//インスタンス生成時に「中身」を引数で設定
	protected Border(MultiStringDisplay display) {
		this.display = display;
	}
}
