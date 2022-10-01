package com.demo.OopsUsage;

class T {
	

	Object show() {
		System.out.println("1");
		return null;
	}
}

public class DynamicPolymorphism extends T{

	Object show() {
		System.out.println("2");
		return null;
	}
	
	public static void main(String[] args) {
		T t = new T();
		t.show();
		
		DynamicPolymorphism dynamicPolymorphism = new DynamicPolymorphism();
		//t1.show();
		//dynamicPolymorphism.show();
	}
}
