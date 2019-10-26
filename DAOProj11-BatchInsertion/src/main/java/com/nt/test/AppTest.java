package com.nt.test;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.PassengerDTO;
import com.nt.service.PassengerMgmtService;

public class AppTest 
{
    public static void main( String[] args )
    {  ApplicationContext ctx=null;
        Scanner sc=null;
        int count=0;
        String source=null,dest=null,name=null;
        int price=0;
        PassengerDTO dto=null;
        List<PassengerDTO> listDTO=new ArrayList();
        PassengerMgmtService service;
    //read inputs
        sc=new Scanner(System.in);
        System.out.println("Enter Soure place::");
        source=sc.next();
        System.out.println("Enter Destination place::");
        dest=sc.next();
        System.out.println("Enter price::");
        price=sc.nextInt();
        System.out.println("Enter group size::");
        count=sc.nextInt();
        //read multiple passenger names and add them listDTO
        for(int i=1;i<=count;++i) {
        	System.out.println("enter "+i+" passenger name:");
        	name=sc.next();
        	//prepare each DTO
        	dto=new PassengerDTO();
        	dto.setName(name);
        	dto.setSource(source);
        	dto.setDest(dest);
        	dto.setPrice(price);
        	//add them docs
        	listDTO.add(dto);
        }
        //create IOC container
    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    //get sErvcei class obj
    service=ctx.getBean("pService",PassengerMgmtService.class);
    //invoke mehods
    System.out.println(service.groupTicketReservation(listDTO));
    
    //close container
     ((AbstractApplicationContext) ctx).close();
       
    }//main
}//class
