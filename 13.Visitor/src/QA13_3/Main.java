package QA13_3;

public class Main {

	public static void main(String[] args) {
		try {
			Directory root1 = new Directory("root1");

			root1.add(new File("diary.html", 20));
			root1.add(new File("Composite.java", 30));

			Directory root2 = new Directory("root2");

			root2.add(new File("diary.html", 200));
			root2.add(new File("Composite.java", 300));

			ElementArrayList list = new ElementArrayList();
			list.add(root1);
			list.add(root2);
			list.add(new File("etc.html", 1234));


			//ルートフォルダを訪問
			list.accept(new ListVisitor());

			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
