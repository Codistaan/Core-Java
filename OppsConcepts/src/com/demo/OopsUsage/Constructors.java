package com.demo.OopsUsage;

public class Constructors {
	
	int i;

	//this is user defined no arg constructor.
	
	public Constructors() {
		System.out.println("this is user define no arg constructor !!");
	}
	
	public Constructors(int a){
		this.i = a;
		System.out.println(i + " this is user define argument contructor !!");
	}
	public static void main(String[] args) {
		
		
		//this is default constructor, created by java compiler.
		Constructors constructors = new Constructors();
		System.out.println(constructors.i);
		
		Constructors  c = new Constructors();
		
		Constructors con  = new Constructors(10);

	}

}


//Q1. What is constructor, what is its return tyep - nothing, what access modifoers can be applied with contructor and what are type of it.
//Q2. how and when constructor gets called? - 
//Q3. Why contructors does not have any return type ? A. because contructors are used to initialize objects.
//Q4. What is return type of compiler defined default constructor ? A. nothing, compiler cant decide on that.
