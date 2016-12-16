package QA17_1;
import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;

	//数を取得
	public int getNumber() {
		return number;
	}

	//数を生成
	public void execute() {
		//0～49の中で20個乱数を生成する。
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}
}
