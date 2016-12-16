package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {
		// newでインスタンス生成させないためにprivate宣言
	}

	public static void makeWelcomePage(String mailaddr, String filename) throws IOException {
		Properties mailprop = Database.getProperties("maildata");
		String username = mailprop.getProperty(mailaddr);
		HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
		writer.title("Welcome to " + username + "'s page!");
		writer.paragraph(username + "のページへようこそ。");
		writer.paragraph("メール待っていますね。");
		writer.mailto(mailaddr, username);
		writer.close();
		System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
	}

	public static void makeLinkPage(String filename) throws IOException {
		Properties mailprop = Database.getProperties("maildata");

		HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
		writer.title("Link page");

		//リンクリスト
		 for (Enumeration<?> e = mailprop.propertyNames(); e.hasMoreElements(); ) {
		      String propertyName = (String)e.nextElement();
		      String propertyValue = mailprop.getProperty(propertyName);
		      writer.link("mailto:"+propertyName, propertyValue);
		    }

		writer.close();
		System.out.println(filename + " is created .");
	}
}
