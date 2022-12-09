package com.test;

public class SingletonTest {
	private static SingletonTest s;
	private static SingletonTest test() {
		s = new SingletonTest();
		return s;
	}
	
	public static void main(String[] args) {
		
		System.out.println("one instance = " + SingletonTest.s.test().hashCode());
		System.out.println("two");
	}
}
