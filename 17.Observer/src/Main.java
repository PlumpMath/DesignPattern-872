public class Main {
    public static void main(String[] args) {
    	//数字生成機、観察者（2人）をインスタンスする。
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        //数字生成機の観察者を指定する。
        generator.addObserver(observer1);
        generator.addObserver(observer2);

        //数字を生成
        generator.execute();
    }
}
