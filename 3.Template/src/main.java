
public class main {

	public static void main(String[] args) {
		// インスタンス作る
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("こんにちは。");

		d1.display();
		d2.display();
		d3.display();
	}

}
