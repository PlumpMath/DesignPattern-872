package extendsAdapter;

public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	//細い表示
	public void printWeak() {
		//String⇒(String)
		showWithParen();
	}

	//太い表示
	public void printStrong() {
		//String⇒*String*
		showWithAster();
	}
}
