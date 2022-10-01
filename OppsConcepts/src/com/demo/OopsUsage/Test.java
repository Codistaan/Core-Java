package com.demo.OopsUsage;

import java.util.ArrayList;
import java.util.List;

interface Test {
	void show(); // by default public abstract
}

interface Test3 {
	void display(); // by default public abstract
}

class Test2 implements Test{

	@Override
	public void show() {
		System.out.println("TEST 1...");
		
	}
	
	public static void main(String[] args) {
		//Test t = new Test();//cant create object of interface
		
		//Test2 t2 = new Test2();
		//t2.show();
		
		int arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> l = new ArrayList<>();
		l.add(8);
		l.add(7);
		
		//() -> {}
		System.out.println(l);
		
		//l.forEach(list -> System.out.println());
		
	}
	
}


 