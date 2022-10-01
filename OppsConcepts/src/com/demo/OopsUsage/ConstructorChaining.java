package com.demo.OopsUsage;

public class ConstructorChaining {
	
	public ConstructorChaining() {
		
		this(10.10);
		System.out.println("Hi");
		
	}

	public ConstructorChaining(int a, String s){
		
		System.out.println(a + "Hello !");
	}
	
	public ConstructorChaining(double d) {

		this(10, "abc");
		System.out.println(d + "bye");
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining  c = new ConstructorChaining();
		
	}

}
