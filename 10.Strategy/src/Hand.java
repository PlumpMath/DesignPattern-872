
public class Hand {
	// ゲーを表す値
	public static final int HANDVALUE_GUU = 0;
	// チョキを表す値
	public static final int HANDVALUE_CHO = 1;
	// パーを表す値
	public static final int HANDVALUE_PAA = 2;

	// じゃんけんの手を表す3つのインスタンス
	public static final Hand[] hand = { new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA), };

	// じゃんけんの手の文字列表現
	private static final String[] name = { "ゲー", "チョキ", "パー", };

	// じゃんけんの手の値
	private int handvalue;

	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	// 値からインスタンスを得る
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	// thisがhより強いときtrue
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}

	// thisがhより弱いときtrue
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}

	// 引き分け(同じ)は0,thisの勝ちなら1,hの勝ちなら-1
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		} else {
			return -1;
		}
	}
}
