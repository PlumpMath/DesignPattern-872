import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	// 相談役を設定
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	// 相談役からの指示（有効状態の制御）
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}
}
