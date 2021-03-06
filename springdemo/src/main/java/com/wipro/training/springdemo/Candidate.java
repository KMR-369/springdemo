package com.wipro.training.springdemo;

public class Candidate 
{
	private int id;
	private String name;
	
	private Address a; //Aggregation

	public Candidate() 
	{
		System.out.println("****** Candidate Details ******");
	}
	
	//Loose Coupling
	public Candidate(int id, String name, Address a) {
		this.id = id;
		this.name = name;
		this.a = a;
		
		//this.a=new Address(); // tight Coupling
	}
	
	void disp()
    {
        System.out.println(id+" "+name);
        System.out.println(a);  // invoke toString() method of Address class
    }
	
}
