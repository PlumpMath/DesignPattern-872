package QA17_1;
import java.util.Random;


public class IncremetialNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;
	private int startInt;
	private int endInt;
	private int plusInt;

	public IncremetialNumberGenerator(int startInt,int endInt,int plusInt){
		this.startInt = startInt;
		this.endInt = endInt;
		this.plusInt = plusInt;
	}

	//数を取得
	public int getNumber() {
		return number;
	}

	//数を生成
	public void execute() {
		//だんだん増える数字を生成。
		for (int i = 0; i < (endInt-startInt)/plusInt; i++) {
			number = startInt + i*plusInt;
			notifyObservers();
		}
	}
}
