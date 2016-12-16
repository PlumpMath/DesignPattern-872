package singleton_5_1;

public class main {

	public static void main(String[] args) {
		TicketMaker tM1 = new TicketMaker();
		System.out.println(tM1.getNextTicketNumber());
		System.out.println(tM1.getNextTicketNumber());
		System.out.println(tM1.getNextTicketNumber());

		TicketMaker tM2 = new TicketMaker();
		System.out.println(tM2.getNextTicketNumber());
		System.out.println(tM2.getNextTicketNumber());
		System.out.println(tM2.getNextTicketNumber());
	}
}
