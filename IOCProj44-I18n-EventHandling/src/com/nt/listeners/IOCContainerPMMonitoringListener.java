package com.nt.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerPMMonitoringListener implements ApplicationListener {
         private  long start,end;
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event.toString().contains("Refreshed")) {
			start=System.currentTimeMillis();
		}
		else if(event.toString().contains("Closed")) {
                 end=System.currentTimeMillis();
                 System.out.println("IOC container has stayed in execution "+(end-start)+" ms");
		}
		
	}

}
