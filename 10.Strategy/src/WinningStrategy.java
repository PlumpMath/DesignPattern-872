import java.util.Random;

// ①	勝ったら次も同じ手を出す
public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	//前回の手
	private Hand prevHand;

	public WinningStrategy(int seed) {
		random = new Random(seed);
	}

	public Hand nextHand() {
		if(!won){
			//random.nextInt(3)
			//0,1,2の中から随機の一つ数字
			prevHand=Hand.getHand(random.nextInt(3));
		}
		return prevHand;
	}

	public void study(boolean win) {
		won = win;
	}

}
