package QA_6_1;

public class UnderlinePen extends ConcreteProduct {

	// 周り表示用文字（*）
	private char ulchar;

	// コンストラクタ
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	// 使用、下記ような出力
	//"Hello"
	// ~~~~~
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");

		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");

	}

}
