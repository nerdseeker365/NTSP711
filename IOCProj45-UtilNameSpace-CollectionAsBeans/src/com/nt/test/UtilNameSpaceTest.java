package com.nt.test;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilNameSpaceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		List<String> list1=null;
		List<Date> list2=null;
		Set<Long>  set1=null;
		Set<Date>  set2=null;
		Map<String,Date>  map1=null;
		Properties props1=null,props2=null;
		Float mPI=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		list1=ctx.getBean("list1",List.class);
		System.out.println("list1===>"+list1+" type"+list1.getClass());
		list2=ctx.getBean("list2",List.class);
		System.out.println("list2===>"+list2+"  type"+list2.getClass());
		System.out.println("..................................");
		set1=ctx.getBean("set1",Set.class);
		System.out.println("set1=====>"+set1+" type::"+set1.getClass());
		set2=ctx.getBean("set2",Set.class);
		System.out.println("set2=====>"+set2+" type::"+set2.getClass());
		System.out.println(".................................");
		map1=ctx.getBean("map1",Map.class);
		System.out.println("map1=====>"+map1+"  type::"+map1.getClass());
		System.out.println(".................................");
		props1=ctx.getBean("props1",Properties.class);
		System.out.println("Props1=====>"+props1);
		System.out.println(".......................................");
		props2=ctx.getBean("props2",Properties.class);
		System.out.println("Props2=====>"+props2);
		System.out.println("........................");
		mPI=ctx.getBean("mPI",Float.class);
		System.out.println(mPI);
		
		
		//close the container
		((AbstractApplicationContext) ctx).close();
		

	}

}
