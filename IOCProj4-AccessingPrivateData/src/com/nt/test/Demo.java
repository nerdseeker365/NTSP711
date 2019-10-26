package com.nt.test;

public class Demo {
	static {
		System.out.println("Demo:: static block");
	}
	private Demo() {
		System.out.println("Demo:: 0-param construtor");
	}
	private Demo(int x,int y) {
		System.out.println("Demo:: 2-param construtor");
	}
	
	public   int sum(int x,int y) {
		return x+y;
	}

}
