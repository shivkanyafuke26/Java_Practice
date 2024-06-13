// Class 1: Ticket (base class)
class Ticket {
	 String ticketNumber;
	 String eventName;
	 double price;

	public Ticket(String ticketNumber, String eventName, double price) 
	{
		this.ticketNumber = ticketNumber;
		this.eventName = eventName;
		this.price = price;
	}

	public void displayTicketInfo() 
	{
		System.out.println("Ticket Number: " + ticketNumber);
		System.out.println("Event Name: " + eventName);
		System.out.println("Price: " + price);
	}
}

// Class 2: EventTicket (extends Ticket)
class EventTicket extends Ticket
 {
	String eventType;

	public EventTicket(String ticketNumber, String eventName, double price, String eventType) 
	{
		super(ticketNumber, eventName, price); // Calls Ticket constructor
		this.eventType = eventType;
	}

	public void displayEventType() 
	{
		System.out.println("Event Type: " + eventType);
	}
}

// Class 3: ConcertTicket (extends EventTicket)
class ConcertTicket extends EventTicket 
{
	String artistName;

	public ConcertTicket(String ticketNumber, String eventName, double price, String eventType, String artistName) 
	{
		super(ticketNumber, eventName, price, eventType); // Calls EventTicket constructor
		this.artistName = artistName;
	}

	public void displayArtistName()
	{
		System.out.println("Artist Name: " + artistName);
	}
}

// Class 4: SportsTicket (extends EventTicket)
class SportsTicket extends EventTicket 
{
	 String teamName;
	public SportsTicket(String ticketNumber, String eventName, double price, String eventType, String teamName) 
	{
		super(ticketNumber, eventName, price, eventType); // Calls EventTicket constructor
		this.teamName = teamName;
	}

	public void displayTeamName() 
	{
		System.out.println("Team Name: " + teamName);
	}
}

// Class 5: VIPConcertTicket (extends ConcertTicket)
 class VIPConcertTicket extends ConcertTicket 
{
	 String vipPackage;

	public VIPConcertTicket(String ticketNumber, String eventName, double price, String eventType, String artistName, String vipPackage) 
	{
		super(ticketNumber, eventName, price, eventType, artistName); // Calls ConcertTicket constructor
		this.vipPackage = vipPackage;
	}

	public void displayVIPPackage() {
		System.out.println("VIP Package: " + vipPackage);
	}
}

// Main class
public class TicketDriver 
{
	public static void main(String[] args) 
	{
		VIPConcertTicket myTicket = new VIPConcertTicket("TCK001", "Concert", 100.0, "Music", "The Beatles", "VIP Package A");
		myTicket.displayTicketInfo();
		myTicket.displayEventType();
		myTicket.displayArtistName();
		myTicket.displayVIPPackage();
	}
}
