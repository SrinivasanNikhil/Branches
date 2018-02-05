
public class TicketMachine { //class signature, name of the class

	int price;
	String destination;
	int moneyCollections;
	
	
	public TicketMachine(int newValue, String newLocation)
	{
		price = newValue;
		destination = newLocation;
		moneyCollections = 0;
		
	}
	
	
	public void printTicket() //method signature, method name, public - accessibility
	// of the method from external classes
	{
		System.out.println("************************");
		System.out.println("********MARTA********");
		System.out.println("******RED LINE******");
		System.out.println("****Cost : " + price + " dollars ****");
		System.out.println("****Destination : " + destination + " ****");
		System.out.println("*************************");
		
		moneyCollections = moneyCollections + price;
			
	}
	
	public void printCollections()
	{
		System.out.println("Money Collected : " + moneyCollections);
		
		
	}
	
	public void setPrice(int newValue)//newValue is a parameter and price is set to this parameter
	{
		price = newValue;
	}
	
	public void setDestination(String newDestination)
	{
		destination = newDestination;
	}
	
	public int getPrice()
	{
		
		return price;
	}
	
	public String getDestination()
	{
		return destination;
	}

}

