package com.demo.OopsUsage;

//this - refs to object of current class, this
//this.var - refs to instance variable, this.var, this()

class MyClass{
	int i;
	
	MyClass m1(MyClass obj) {
		
		System.out.println("got my class object as param..");
		return this; //MyClass obj = this;
	}
	public void setValue(int i) {
		this.i = i;
		System.out.println(this.i);
	}
	
	public void displayValue(int i) {
	this.setValue(i);
	System.out.println(this.m1(this));//param - this= current class obj
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		MyClass c  = new MyClass();
		c.displayValue(100);// o/p = 0;
	}

}