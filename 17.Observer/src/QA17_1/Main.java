package QA17_1;

public class Main {
	public static void main(String[] args) {
		// 数字生成機、観察者（2人）をインスタンスする。
		NumberGenerator generator = new IncremetialNumberGenerator(10, 90, 5);
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();

		// 数字生成機の観察者を指定する。
		generator.addObserver(observer1);
		generator.addObserver(observer2);

		// 問題17-2
		// 観察者追加(年齢を文字列で表示)
		Observer observer3 = new StringObserver();
		generator.addObserver(observer3);

		// 数字を生成
		generator.execute();

	}
}
