package instanceAdapter;

public class PrintBanner extends Print {

	// Bannerに委譲
	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	// 細い表示
	public void printWeak() {
		// String⇒(String)
		banner.showWithParen();
	}

	// 太い表示
	public void printStrong() {
		// String⇒*String*
		banner.showWithAster();
	}
}
