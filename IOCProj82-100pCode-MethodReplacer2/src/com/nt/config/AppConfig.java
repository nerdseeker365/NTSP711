package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages= {"com.nt.beans","com.nt.replacer"})
@ImportResource("classpath:com/nt/cfgs/applicationContext.xml")
public class AppConfig {

}
