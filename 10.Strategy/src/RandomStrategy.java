import java.util.Random;

// 問題10-1
// 随機的に次の手を出す
public class RandomStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	//前回の手
	private Hand prevHand;

	public RandomStrategy(int seed) {
		random = new Random(seed);
	}

	public Hand nextHand() {
		//0,1,2の中から随機の一つ数字
		prevHand=Hand.getHand(random.nextInt(3));

		return prevHand;
	}

	public void study(boolean win) {
}

}
