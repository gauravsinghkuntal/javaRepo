package com.ineuron.ai;

class Participant
{
private  static int counter;
private String registrationId;
private String name;
private String city;
private long contactNumber;

static
{
counter=0;	
}

public Participant( String name,long contactNumber, String city) {
	super();
	this.registrationId ="D100" + (++counter) ;
	this.name = name;
	this.city = city;
	this.contactNumber=contactNumber;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public static int getCounter() {
	return counter;
}
public static void setCounter(int counter) {
	Participant.counter = counter;
}
public String getRegistrationId() {
	return registrationId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}


public class staticAssignment {

	public static void main(String[] args) {
		
     Participant participant=new Participant("Gaurav Singh Kuntal",9557554453l, "Agra");
     Participant participant2=new Participant("yash",9557554453l, "Agra");
     Participant participant3=new Participant("Lucky",9557554453l, "Agra");
     Participant participant4=new Participant("Mother",9557554453l, "Agra");
     Participant participant5=new Participant("Father",9557554453l, "Agra");


    Participant[] part= new Participant[4];
    part[0]=participant;part[1]=participant2;part[3]=participant3;
    try {
    for(int i=0;i<part.length;i++)
    {
    	System.out.println(part[i].getCity()+part[0].getContactNumber()+part[i].getName()+part[i].getRegistrationId());
    }
    }
    catch(Exception e)
    {
    	System.out.println("exception occured");
    	System.out.println("exception caught");
    }
	}

}
