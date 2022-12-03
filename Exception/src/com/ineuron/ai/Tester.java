package com.ineuron.ai;

class InvalidAgeException extends Exception
{
public InvalidAgeException(String message)
{
	super(message);
}
}
class InvalidJobProfileException extends Exception
{
	public InvalidJobProfileException(String message)
	{
		super(message);
	}
	}

class InvalidNameException extends Exception
{
public InvalidNameException(String message)	
{
	super(message);
}
}

class Applicant 
{
private String name;
private String jobProfile;
private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJobProfile() {
	return jobProfile;
}
public void setJobProfile(String jobProfile) {
	this.jobProfile = jobProfile;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}

class Validator
{
	public boolean validateName(String name)
	{
		if(name.isEmpty() || name==null)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	// or 'Clerk' or 'Executive' or 'Officer
	public boolean validateJobProfile(String jobProfile)
	{
		if(jobProfile.equalsIgnoreCase("Associate") || jobProfile.equalsIgnoreCase("Clerk") || jobProfile.equalsIgnoreCase("Executive")
		   || jobProfile.equalsIgnoreCase("Officer")){
			return true;
		}
		else 
		{
			return false;
			}
	}
	public boolean validateAge(int age )
	{
		if(age>=18 && age<=30)
		{
			return true;
		}
		else return false;
	}
	public void Validate(Applicant applicant) throws InvalidJobProfileException,InvalidAgeException, InvalidNameException
	{
		
     if(validateName(applicant.getName())==false)
     {
    	 InvalidNameException e= new InvalidNameException("it is a invalid Name");
    	 throw e;
     }
     
     else if(validateAge(applicant.getAge())==false)
     {
    	 throw new InvalidAgeException("it is invalid age");
     }
     
     else if(validateJobProfile(applicant.getJobProfile())==false)
     {
    	 InvalidJobProfileException e2= new InvalidJobProfileException("It is a invalid job proifile bro!");
    	 throw e2;
     }
	}
}


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Applicant applicant = new Applicant();
     applicant.setAge(31);
     applicant.setName("jenny");
     applicant.setJobProfile("Clerk");
     
     Validator validator= new Validator();
     
     try {
    	 
     validator.Validate(applicant);
     }
     
     catch(InvalidAgeException | InvalidNameException | InvalidJobProfileException e) {
    	 System.out.println(e.getMessage());
     }
     catch(Exception e)
     {
    	 System.out.println("Exception is handled by main exception class ");
     }
     finally {
    	 System.out.println("You have successfully handled the"  + " excpetion !");
     }
     
		
	}

}
