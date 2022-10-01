package com.demo.OopsUsage;



class Parent{
	int i =10; //parent class instance variable
	
	Parent(){ // this is parent class constructor
		System.out.println("in parent class");
	}
	
	void show(int i) {
		System.out.println(i + "this is inside Parent class");
	}
	
	void m1() {
		System.out.println("m in parents m1");
	}
}

public class SuperKeyworrd extends Parent {
	
	SuperKeyworrd()
	{
		super();
		System.out.println("contructor called... ");
	}
	int  i =20; //current class instance variable
	
	void m1() {
		System.out.println("m in child m1");
	}
	
	void show(int i) {
		
		System.out.println(super.i + " child class ");
	}
	
	public static void main(String[] args) {
		SuperKeyworrd keyworrd = new SuperKeyworrd(); // keyworrd --> (obj) ,new object created in heap memory
		keyworrd.show(30);
	}
}


//usage of super keyword, inheritance- parent-child
//1. "super" keyword can be used to refer immediate parent class instance variable

//2. super keyword can be used to invoke immediate parent class method

//3. "super" keyword can be used to invoke immediate parent class constructor.

