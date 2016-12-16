
public interface Strategy {
	// 「次に出す手を得る」ためのメソッド
	public abstract Hand nextHand();

	// さっきの勝ったかどうかを学習する
	public abstract void study(boolean win);
}
