import java.util.*;

public class Customer {

  private String firstName ; 
  private String lastName ;
  private String myAge ;
  
  
  
  //Setters & getters for firstName, lastName & myAge variables
  public String getFirstName() 
  {
	  return firstName;
  }
  
  public void setFirstName(String fn) 
  {
	  this.firstName = fn;
  }

  
  public String getLastName() 
  {
	  return lastName;
  }
  
  public void setLastName(String ln) 
  {
	  this.lastName = ln;
  }

  
  public String getMyAge() 
  {
	  return myAge;
  }
  
  public void setMyAge(String ma) 
  {
	  this.lastName = ma;
  }

// End of setters & getters for respected varibles. 
  
  public Customer() {
	  
}
  


  public String toString() 
  {
	  return getFirstName() + getLastName()+ getMyAge();
  }


    
 
    
    
    
  
    
	
}
