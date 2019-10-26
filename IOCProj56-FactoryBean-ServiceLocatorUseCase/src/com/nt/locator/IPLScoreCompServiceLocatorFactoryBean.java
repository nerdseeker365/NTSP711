package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ExternalIPLScoreComp;
import com.nt.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean implements FactoryBean<ExternalIPLScoreComp> {
	
    private Map<String,ExternalIPLScoreComp>  cacheMap=null;
	private  String jndi;
	
	public IPLScoreCompServiceLocatorFactoryBean(String jndi) {
		this.jndi = jndi;
		cacheMap=new HashMap();
	}
	

	@Override
	public ExternalIPLScoreComp getObject() throws Exception {
		ExternalIPLScoreComp  extComp=null;
		//Actually we should write Jndi lookup code here but  we are writing
		//logic to create and return Externalservice class object becoz we have
		//Dummy External service  (Here also maintain caching)
		if(!cacheMap.containsKey(jndi)) {
			extComp=new ExternalIPLScoreCompImpl();
			cacheMap.put(jndi,extComp);
		}
		return cacheMap.get(jndi);
	}

	@Override
	public Class<?> getObjectType() {
	
		return ExternalIPLScoreComp.class;
	}
	
	@Override
	public boolean isSingleton() {
	return true;
	}
	

}
