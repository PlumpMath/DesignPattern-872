package instanceAdapter;

/*
 * 提供されているクラス
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	// String⇒*String*
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	// String⇒(String)
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
