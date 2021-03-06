package QA19_4;
public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {
    }

    //インスタンスを得る
    public static State getInstance() {
        return singleton;
    }

    //時刻設定
    public void doClock(Context context, int hour) {
    	//状態変化（遷移）
    	if (hour < 9 || 17 <= hour) {
    		//9時～17時以外の場合、「夜」状態にする
            context.changeState(NightState.getInstance());
        }else if (12 <= hour && hour < 13) {
        	//昼御飯
        	 context.changeState(LunchState.getInstance());
        }
    }

    //金庫使用
    public void doUse(Context context) {
        context.recordLog("金庫使用（昼間）");
    }

    //非常ベル
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル（昼間）");
    }

    //通常通話
    public void doPhone(Context context) {
        context.callSecurityCenter("通常電話（昼間）");
    }

    //文字列表現
    public String toString() {
        return "[昼間]";
    }
}
