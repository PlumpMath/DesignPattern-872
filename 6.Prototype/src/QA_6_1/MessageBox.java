package QA_6_1;

public class MessageBox extends ConcreteProduct {

	// 周り表示用文字（*）
	private char decochar;

	// コンストラクタ
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	// 使用、下記ような出力
	//*********
	//* Hello *
	//*********
	public void use(String s) {
		int length = s.getBytes().length;
		// トップライン
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);

		// 下ライン
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");

	}

}
