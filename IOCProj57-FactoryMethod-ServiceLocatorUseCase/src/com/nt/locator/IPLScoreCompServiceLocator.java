package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.external.ExternalIPLScoreComp;
import com.nt.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocator{
    private  static Map<String,ExternalIPLScoreComp> cacheMap=new HashMap();

   public  static   ExternalIPLScoreComp   getExtService(String jndi){
            ExternalIPLScoreComp extComp=null;
          if(!cacheMap.containsKey(jndi)){
                extComp=new ExternalIPLScoreCompImpl();
                cacheMap.put(jndi,extComp);
           }
           return cacheMap.get(jndi);
     }//method
 }//class