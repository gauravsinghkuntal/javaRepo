package com.ineuron.ai;

class Booking 
{
private static int seatsAvailable;
private int seatsRequired;
private String customerEmail;
private boolean isBooked;

static 
{
seatsAvailable=400;	
}
public Booking(int seatsRequired, String customerEmail) {
	super();
	this.seatsRequired = seatsRequired;
	this.customerEmail = customerEmail;
	if(this.seatsRequired<seatsAvailable)
	{
		this.setBooked(true);
		seatsAvailable=seatsAvailable-this.seatsRequired;
		System.out.println("seats Booked and available seats are " +seatsAvailable);
	}
	else 
	{
		System.out.println("sorry seats are not booked and seats are :- " + seatsAvailable);
		this.setBooked(false);
	}
}

public static int getSeatsAvailable() {
	return seatsAvailable;
}

public static void setSeatsAvailable(int seatsAvailable) {
	Booking.seatsAvailable = seatsAvailable;
}

public int getSeatsRequired() {
	return seatsRequired;
}

public void setSeatsRequired(int seatsRequired) {
	this.seatsRequired = seatsRequired;
}

public String getCustomerEmail() {
	return customerEmail;
}

public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}

public boolean isBooked() {
	return isBooked;
}

public void setBooked(boolean isBooked) {
	this.isBooked = isBooked;
}
}

public class staticAssignment02 {

	public static void main(String[] args) {
		
		Booking booking=new Booking(50,"gauravsinghkuntal@gmail.com");
		
		
	}
}
