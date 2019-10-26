package com.nt.editors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class IntrAmtDetailsEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt=0.0f;
		float time=0.0f;
		float rate=0.0f;
		IntrAmtDetails details=null;
		//get content from value attribute
		pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));
		time=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
	     rate=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
	     //create IntrAmtDetails class obj
	     details=new IntrAmtDetails();
	     details.setPamt(pAmt);details.setRate(rate);details.setTime(time);
	     //set value(obj) to Bean property
	     setValue(details);
	}//method
}//class
