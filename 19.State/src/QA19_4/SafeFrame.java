package QA19_4;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//金庫警備システム（GUI）
public class SafeFrame extends Frame implements ActionListener, Context {
	// 現在時刻表示
	private TextField textClock = new TextField(60);
	// 警備センター出力
	private TextArea textScreen = new TextArea(10, 60);

	// ボタン
	private Button buttonUse = new Button("金庫使用");
	private Button buttonAlarm = new Button("非常ベル");
	private Button buttonPhone = new Button("通常通話");
	private Button buttonExit = new Button("終了");

	// 現在の状態
	private State state = DayState.getInstance();

	// コンストラクタ
	public SafeFrame(String title) {
		super(title);

		// 各部品の配置
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());

		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);

		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);

		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);

		add(panel, BorderLayout.SOUTH);

		// 表示
		pack();
		show();

		// リスナーの設定
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}

	// Event追加
	// ボタンが押されたらここに来る
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		if (e.getSource() == buttonUse) {
			// 金庫使用
			state.doUse(this);
		} else if (e.getSource() == buttonAlarm) {
			// 非常ベル
			state.doAlarm(this);
		} else if (e.getSource() == buttonPhone) {
			// 通話
			state.doPhone(this);
		} else if (e.getSource() == buttonExit) {
			// 終了
			System.exit(0);
		} else {
			System.out.println("?");
		}
	}

	// 時刻の設定
	public void setClock(int hour) {
		String clockstring = "現在の時刻は";
		if (hour < 10) {
			clockstring += "0" + hour + ":00";
		} else {
			clockstring += hour + ":00";
		}
		System.out.println(clockstring);
		textClock.setText(clockstring);
		state.doClock(this, hour);
	}

	// 状態変化
	public void changeState(State state) {
		System.out.println(this.state + "から" + state + "へ状態が変化しました。");
		this.state = state;
	}

	// 警備センター呼び出し
	public void callSecurityCenter(String msg) {
		textScreen.append("call! " + msg + "\n");
	}

	// 警備センター記録
	public void recordLog(String msg) {
		textScreen.append("record ... " + msg + "\n");
	}
}
