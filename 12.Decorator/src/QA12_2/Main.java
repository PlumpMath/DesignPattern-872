package QA12_2;

public class Main {
	public static void main(String[] args) {
		MultiStringDisplay md =new MultiStringDisplay();
		md.add("Hello,world!");
		md.add("Welcome to here!");
		md.add("Good night!");
		md.show();

		MultiStringDisplay d1= new SideBorder(md,'#');
		d1.show();

		MultiStringDisplay d2= new FullBorder(md);
		d2.show();
	}
}
