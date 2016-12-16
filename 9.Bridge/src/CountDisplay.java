import java.util.Random;

public class CountDisplay extends Display {
	Random rand = new Random();


	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {
		open();

		for (int i = 0; i < times; i++) {
			print();
		}

		close();
	}

	//問題9-1
	public void randomDisplay(int times) {
		// ランダム回数表示する
		int randomD = rand.nextInt(times);

		multiDisplay(randomD);
	}

	//問題9-3
	public void plusDisplay(int times) {
		for (int i = 0; i < times; i++) {
			print();
		};
	}

}
