
public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello,Japan."));
		Display d2 = new Display(new StringDisplayImpl("Hello,World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));

		// 問題9-2
		CountDisplay d4 = new CountDisplay(new FileDisplayImpl("src/read.conf"));

		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);

		// 問題9-1
		d3.randomDisplay(10);
		d4.multiDisplay(2);

		// 問題9-3
		CountDisplay d5 = new CountDisplay(new SharpDisplayImpl("#"));
		d5.plusDisplay(7);

		CountDisplay d6 = new CountDisplay(new TagDisplayImpl("*"));
		d6.plusDisplay(5);
	}

}
