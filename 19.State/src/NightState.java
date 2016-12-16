public class NightState implements State {
	private static NightState singleton = new NightState();

	private NightState() {
	}

	public static State getInstance() {
		return singleton;
	}

	public void doClock(Context context, int hour) {
		// 9時～17時の場合、「昼」状態にする
		if (9 <= hour && hour < 17) {
			// 状態変化（遷移）
			context.changeState(DayState.getInstance());
		}
	}

	// 金庫使用
	public void doUse(Context context) {
		context.callSecurityCenter("非常：夜間の金庫使用！");
	}

	// 非常ベル
	public void doAlarm(Context context) {
		context.callSecurityCenter("非常ベル（夜間）");
	}

	// 通常通話
	public void doPhone(Context context) {
		context.recordLog("夜間通話録音");
	}

	// 文字列表現
	public String toString() {
		return "[夜間]";
	}
}
