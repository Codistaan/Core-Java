package com.demo.OopsUsage;


class A extends B{
	void showA(){
		System.out.println("A class method");
	}
}

class B {
	

	void showB(){
		System.out.println("B class method!!");
	}
}

class C extends B {
	void showC() {
		System.out.println("C class method..");
	}
}

public class Inheritance {
	

	 public static void main(String[] args) {
		 
		 //single inheritance
		 A ob = new A();
		 ob.showA();
		ob.showB();
		 
		 B ob2 = new B();
		 ob2.showB();
		 //ob2.showA();
		 //ob2.showC();
		
		 
		 //multilevel
		 
		 C ob3 = new C();
		//ob3.showA();
		ob3.showB();
		 ob3.showC();
	}

}


