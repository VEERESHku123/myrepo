package Assignment2;

public class TicketBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBooking obj=new TicketBooking();
		for(int i=0;i<3;i++) {
			System.out.println("Person:"+(i+1));
			obj. bookTicket();
		}
		
	}

}
