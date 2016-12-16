import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		try {

			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");

			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);

			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));

			//ルートフォルダを訪問
			rootdir.accept(new ListVisitor());

			System.out.println("");
			System.out.println("Making user entries");
			Directory yukidir = new Directory("yuki");
			Directory hanakodir = new Directory("hanako");
			Directory tomuradir = new Directory("tomura");
			usrdir.add(yukidir);
			usrdir.add(hanakodir);
			usrdir.add(tomuradir);

			yukidir.add(new File("diary.html", 200));
			yukidir.add(new File("Composite.java", 300));

			hanakodir.add(new File("memo.tex", 100));
			hanakodir.add(new File("memo2.html", 100));

			tomuradir.add(new File("game.doc", 220));
			tomuradir.add(new File("junk.mail", 130));
			tomuradir.add(new File("www.html", 130));

			//ルートフォルダを訪問
			rootdir.accept(new ListVisitor());

			System.out.println("");

			//問題13-1
			System.out.println("HTML files are:");

			//拡張子が.htmlのファイルを集める
			FileFindVisitor ffv = new FileFindVisitor(".html");
			rootdir.accept(ffv);
			Iterator it = ffv.getFoundFiles().iterator();
			while(it.hasNext()){
				File file = (File)it.next();
				System.out.println(file.toString());
			}



		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
