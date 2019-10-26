

function validate(frm){
	//chang vflg to "yes" indicating client side form vlaidations are done
	alert("java scripint is on......")
	frm.vflag.value="yes";
	// empty  form validation   error messages
	document.getElementById("name.err").innerHTML="";
	document.getElementById("addrs.err").innerHTML="";
	document.getElementById("mobileNo.err").innerHTML="";
	document.getElementById("billAmt.err").innerHTML="";
	
		//read form data
	let name=frm.cname.value;
	let addrs=frm.addrs.value;
	let  mobile=frm.mobileNo.value;
	let  billAmt=frm.billAmt.value;
	  //client side form validation logics
	if(name==""){
		document.getElementById("name.err").innerHTML="customer name is mandatory";
		  frm.cname.focus();
		  return false;
	}
	
	 if(addrs==""){
		document.getElementById("addrs.err").innerHTML="customer address  is mandatory ";
		  frm.addrs.focus();
		  return false;
	}
	else if(addrs.length<5 ||  addrs.length>10){
		document.getElementById("addrs.err").innerHTML="customer address  must be have >=5 chars and <=10 chars";
		  frm.addrs.focus();
		  return false;
	}
	 
	 if(mobile==""){
			document.getElementById("mobileNo.err").innerHTML="customer mobileNo  is mandatory ";
			  frm.mobileNo.focus();
			  return false;
		}
		else if(mobile.length!=10){
			document.getElementById("mobileNo.err").innerHTML="customer mobileNumber   must  have 10 digits";
			  frm.mobileNo.focus();
			  return false;
		}
	 
	 if(billAmt==""){
			document.getElementById("billAmt.err").innerHTML="customer billAmt  is mandatory ";
			  frm.billAmt.focus();
			  return false;
		}
		return true;
	}//validate(-)
