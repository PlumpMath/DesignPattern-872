package QA14_4;

public class OddSupport extends Support {

	public OddSupport(String name) {
		super(name);
	}

	// 解決用メソッド
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

}
