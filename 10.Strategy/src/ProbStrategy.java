import java.util.Random;

// ②	１回前の手から次の手を確率的に計算する
public class ProbStrategy implements Strategy {
	private Random random;
	// 前回の手値
	private int prevHandValue = 0;
	// 今回の手値
	private int currentHandValue = 0;
	// 手出す履歴([0][1]：[前回の手値][次回の手値])
	private int[][] history = { { 1, 1, 1, }, { 1, 1, 1, }, { 1, 1, 1, }, };

	public ProbStrategy(int seed) {
		random = new Random(seed);
	}

	//次の手を決める
	public Hand nextHand() {

		//0から履歴Total値の一つを随機
		int bet = random.nextInt(getSum(currentHandValue));

		//次の手
		int handvalue = 0;
		if (bet < history[currentHandValue][0]) {
			handvalue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			handvalue = 1;
		} else {
			handvalue = 2;
		}

		//今回の手を前回にセット
		prevHandValue = currentHandValue;
		//次回の手を今回にセット
		currentHandValue = handvalue;
		//次回の手値から手を取得して、戻す
		return Hand.getHand(handvalue);

	}

	// 今回と次回の履歴Total値
	private int getSum(int hv) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[hv][i];
		}
		return sum;
	}

	public void study(boolean win) {
		if (win) {
			//勝ったの場合、該当手の履歴値+1
			history[prevHandValue][currentHandValue]++;
		} else {
			//勝ったの場合、該当手以外の二つ手の履歴値+1
			history[prevHandValue][(currentHandValue + 1) % 3]++;
			history[prevHandValue][(currentHandValue + 2) % 3]++;
		}
	}

}
