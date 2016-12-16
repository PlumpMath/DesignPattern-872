import framework.Product;

public class MessageBox implements Product {

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

	// インスタンス複製
	public Product createClone() {
		Product p = null;
		try{
			p = (Product)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}

}
