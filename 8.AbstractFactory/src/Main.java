import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class Main {

	// パラメータ：listfactory.ListFactory or tablefactory.TableFactory
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("Usage:java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1:java Main listfactory.ListFactory");
			System.out.println("Example 2:java Main tablefactory.TableFactory");
			System.exit(0);
		}

		//newインスタンス(パラメータ：クラス名)
		Factory factory = Factory.getFactory(args[0]);

		Link google = factory.createLink("Google", "https://www.google.co.jp");

		Link baidu = factory.createLink("Baidu", "https://www.baidu.com/");

		Link yahoo = factory.createLink("Yahoo!", "http://www.yahoo.co.jp/");

		Tray trayJanpan = factory.createTray("日本");
		trayJanpan.add(google);
		trayJanpan.add(yahoo);

		Tray trayOther = factory.createTray("海外");
		trayOther.add(baidu);

		Page page = factory.createPage("リンクページ", "タイ");
		page.add(trayJanpan);
		page.add(trayOther);

		//QA_8_2 Yahoo専用ページ
//		Page page = factory.createYahooPage();

		page.output();

	}

}
