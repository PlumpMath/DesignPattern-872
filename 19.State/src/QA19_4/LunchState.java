package QA19_4;

//QA19_4
//昼食時追加（12:00~12:59）
public class LunchState implements State {
	private static LunchState singleton = new LunchState();

	private LunchState() {
	}

	public static State getInstance() {
		return singleton;
	}

	public void doClock(Context context, int hour) {
		// 12時～13時の場合、「昼食時」状態にする
		if (12 > hour || hour >= 13) {
			// 状態変化（遷移）
			context.changeState(DayState.getInstance());
		}
	}

	 //金庫使用
    public void doUse(Context context) {
        context.recordLog("金庫使用（昼食時）");
    }

    //非常ベル
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル（昼食時）");
    }

    //通常通話
    public void doPhone(Context context) {
        context.callSecurityCenter("留守録（昼食時）");
    }

    //文字列表現
    public String toString() {
        return "[昼食時]";
    }
}
