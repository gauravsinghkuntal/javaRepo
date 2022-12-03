package com.ineuron.ai;

class GrandFather extends Object
{
	//private members don't take part in inheritance because if they can be inherited then there is no point of using private access modifier.
	/*
	 we use private method so that their access can be restricted and this processis called encapsulation of the process.
	*/
	private String name;
	private int age ;
	
	
	public GrandFather(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("paramertirized cons call of grandfather");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void display()
	{
		System.out.println("this is grandfather class and the name of grandfather is :- "+ this.getName());
	}
	public void displayAge()
	{
		System.out.println("Age of grandfather is :- " + this.getAge());
	}
}

class Parent extends GrandFather
{
	public Parent(String name,int age)
	{
		
		super(name,age);
		System.out.println("paramertirized cons call of parent");
	}
    @Override
	void display()
	{
		System.out.println("it is a Parent class and name of the parent is :- " + this.getName());
	}
    
    @Override
    public void displayAge() 
    {
    	System.out.println("Age of the parent is :- " + this.getAge());
    }
}

class Child extends Parent
{
	public Child(String name,int age)
	{
		super(name,age);
		System.out.println("paramertirized cons call of child");
	}
	
	@Override
	void display()
	{
		System.out.println("it is a child class and name of the child is :- " + this.getName());
	}
    
    @Override
    public void displayAge() 
    {
    	System.out.println("Age of the child is :- " + this.getAge());
    }
     void displayChildDetails(String school)
    {
    	System.out.println("thr address of the school of child is :- " + school);
    }
}
public class InheritanceAndpolymorphism {

	public static void main(String[] args) {

		GrandFather a=new Child("Gaurav Singh Kuntal",25);
		a.display();
		a.displayAge();
		Child child=(Child)a;
		child.displayChildDetails("Simpkins school");
	
	}

}
