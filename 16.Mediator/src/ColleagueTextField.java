import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) {
		super(text, columns);
	}

	// 相談役を設定
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	// 相談役からの指示（有効状態の制御）
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	//文字列を変更したら
	// 相談役への「相談」
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();
	}
}
