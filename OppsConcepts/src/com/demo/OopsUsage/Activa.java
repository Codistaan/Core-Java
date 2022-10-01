package com.demo.OopsUsage;

abstract class Vehicle {
	
public int i = 10;
public int j;


//
public Vehicle(int i, int j){

this.i = i;
this.j  = j;

}

abstract void start();//what}

public void run() { //invoke , called

	int locatVar = 1;
	System.out.println("Run method..." + this.i);
}

}

//cant instantiate-- can not create object of abstract class
//constructor chaining

class Car extends Vehicle{

	
	int k ;
	int l;
	
	public Car(int k, int l) {
		
		super(10, 10);//contructor chaining
		this.k = k;
		this.l = l;
		
	}
	
	@Override //dynamic polymorphism
	void start() {
		System.out.println("In Car class ");
		System.out.println(k  + " " + l + " " + i + " " + j);
		
	}
	
	@Override
	public void run() {
		System.out.println("inside car class");
	}

}
	
 public class Activa extends Vehicle {

	 
	public Activa(int i, int j) {
		super(i, j);
	}


	@Override
	void start() {
		System.out.println("I am on my active ..");
	}

	
	public static void main(String[] args) {
		Car c1 = new Car(10, 10);
		c1.start();
		c1.run();
		
	}
	
}
