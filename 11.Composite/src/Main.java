
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

			rootdir.printList("");

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

			tomuradir.add(new File("game.doc", 220));
			tomuradir.add(new File("junk.mail", 130));
			rootdir.printList();

			// 問題11-2
			// フルパスを得る
			File fileX = new File("junk2.mail", 230);
			tomuradir.add(fileX);

			System.out.println("");
			System.out.println("bindir:");
			System.out.println(bindir.getPath());

			System.out.println("");
			System.out.println("yukidir:");
			System.out.println(yukidir.getPath());

			System.out.println("");
			System.out.println("junk2.mail:");
			System.out.println(fileX.getPath());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
