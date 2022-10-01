package com.demo.OopsUsage;



public class Polymorphism {

	
	void show(StringBuffer b) {
		System.out.println("1");
	}
	void show(char a) {
		System.out.println("char method");
	}
	
	void show(String s){
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		
		polymorphism.show("ABC");//1
		
		//polymorphism.show(10);//2
		//polymorphism.main(10);//overloaded
	}
	
	public static void main(int a) {
		System.out.println("overloaded main()");
	}
	
	
}
