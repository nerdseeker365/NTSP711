package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceTestApp {
	public static void main(String[] args)throws Exception {
		//Load class
		Class c=Class.forName(args[0]);
		//object creation using 0-param constructor
		Object o1=c.newInstance();
		System.out.println("obj1..."+o1);
		//object creation using 0-param constructor
		Constructor cons[]=c.getDeclaredConstructors();
		Object o2=cons[1].newInstance();
		System.out.println("obj2..."+o2);
		//object creation using 2-param constructor
		Object o3=cons[0].newInstance(10,20);
		System.out.println("obj3..."+o3);

	}

}
