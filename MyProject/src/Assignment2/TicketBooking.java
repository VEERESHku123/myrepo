package Assignment2;

public class TicketBooking {
	private static int ticket=2;
	
	static {
		System.out.println("Totale Nr of ticket available:"+ticket);
		System.out.println();
	}
	
	public void bookTicket() {
		if(ticket<=0) {
			System.out.println("Tickets are sold out.");
		}
		else {
			System.out.println("Tickets booked succesfully.");
			ticket--;
			System.out.println("Available Tickets:"+ticket);
			System.out.println();
		}
	}
}
