import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
	private Mediator mediator;

	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		super(caption, group, state);
	}

	// 相談役を設定
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	// 相談役からの指示（有効状態の制御）
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

	//状態を変更したら
	//相談役への「相談」
	public void itemStateChanged(ItemEvent e) {
		mediator.colleagueChanged();
	}
}
