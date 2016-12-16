package singleton_5_1;

public class TicketMaker {
	private static int ticket = 1000;

	public static int getNextTicketNumber() {
		return ticket++;
	}
}
