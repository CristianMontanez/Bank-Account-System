import java.util.*;
public class CustomerCollector extends Customer{

	
	
	public static void CustomerCollector() {
		Customer c = new Customer();
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Please enter first name: ");
		c.setFirstName(myScan.nextLine());
		
		System.out.println("Please enter last name: ");
		c.setLastName(myScan.nextLine());
		
		System.out.println("Please enter age: ");
		c.setMyAge(myScan.nextLine());
		
		
	}
	
	
	// attempted to collect user input to store into customer varibles (did not work nothing shows in console) 
	
	
	
}
