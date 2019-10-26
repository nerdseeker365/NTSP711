package com.nt.service;

public class PayrollService {
	
	public  String  generateSalary(int empId,float basicSalary,boolean variablePay) {
		float grossSalary=0.0f;
		float netSalary=0.0f;
		float vp=0.0f;
		if(variablePay)
			  vp=basicSalary*0.1f;
		
		grossSalary=basicSalary+ (basicSalary*0.4f);
		netSalary=grossSalary-(grossSalary*0.2f)+vp;
		return empId +"   basicSalary::"+basicSalary+"Variable pay::"+vp+"  grossSalary::"+grossSalary+"  net salary::"+netSalary;
	}
	
	
	public String   getDesg(int empId) {
		if(empId>=1000 && empId<=1999)
			return "SSE";
		else if(empId>=2000 && empId<=2999)
			return "SE";
		else 
			return  "Unkown";
	}

}
