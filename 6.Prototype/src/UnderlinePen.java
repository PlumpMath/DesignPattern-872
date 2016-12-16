import framework.Product;

public class UnderlinePen implements Product {

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
