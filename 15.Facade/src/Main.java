import java.io.IOException;

import pagemaker.PageMaker;

public class Main {

	public static void main(String[] args) throws IOException {
		PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
		PageMaker.makeLinkPage("Link.html");
	}

}
