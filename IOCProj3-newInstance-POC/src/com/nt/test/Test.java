package com.nt.test;

public class Test {
	static {
		System.out.println("Test.static block");
	}
	public  Test() {
		System.out.println("Test::0-param constructor");
	}
	public  Test(int x,int y) {
		System.out.println("Test::2-param constructor");
	}
	
	public String toString() {
		return  "Test....";
	}
	
	

}
