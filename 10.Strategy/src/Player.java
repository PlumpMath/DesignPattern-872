//じゃんけんを行う人
public class Player {
	// 人名
	private String name;
	// 戦略
	private Strategy strategy;
	// 勝った回数
	private int wincount;
	// 負けた回数
	private int losecount;
	// 合計回数
	private int gamecount;

	// 名前と戦略を授けられる
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	// 戦略にお伺いを立てる
	public Hand nextHand() {
		return strategy.nextHand();
	}

	// 勝った
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	// 負けた
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	// 引き分け
	public void even() {
		gamecount++;
	}

	// 結果出力用
	public String toString() {
		return "[" + name + ":" + gamecount + " games," + wincount + " wins, " + losecount + " lose ]";
	}
}
