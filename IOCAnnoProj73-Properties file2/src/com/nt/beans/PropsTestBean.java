package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component("props")
/*@PropertySource(value="classpath:com/nt/commons/info.properties")
@PropertySource(value="classpath:com/nt/commons/info1.properties") */

@PropertySources(value = {@PropertySource(value="classpath:com/nt/commons/info.properties"),
                                                     @PropertySource(value="classpath:com/nt/commons/info1.properties") 
                                                    }
                                    )
public class PropsTestBean {
	@Value("${user.uname}")
	private String name;
	@Value("${user.addrs}")
	private  String addrs;
	@Value("${user.age}")
	private  int age;
	@Value("${os.name}")
	private  String osName;
	@Value("${JAVA_HOME}")
	private  String  javaHome;
	
	@Override
	public String toString() {
		return "PropsTestBean [name=" + name + ", addrs=" + addrs + ", age=" + age + ", osName=" + osName
				+ ", javaHome=" + javaHome + "]";
	}

}
