package package_default;

interface  Car 
{
  
 public void displayName();
  public void displayModelAndEngineDetails();
}

class AdapterClass implements Car
{
	public void displayName() {}
	
	public void displayModelAndEngineDetails() {}
}

class AdapterClassImpl extends AdapterClass
{
	

	public void displayName() {
	System.out.println("Welcome to impl class this is displayname method ");	
	}
	
	public void displayModelAndEngineDetails() {
		System.out.println("This is displayModelAndEngineDetails class." );
	}
}

public class Abstract {

	public static void main(String[] args) 
	{
      Car car=new AdapterClassImpl();
      car.displayModelAndEngineDetails();
      car.displayName();
	}

}
