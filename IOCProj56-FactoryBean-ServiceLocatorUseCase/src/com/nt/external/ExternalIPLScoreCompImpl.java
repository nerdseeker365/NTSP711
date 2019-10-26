package com.nt.external;

public class ExternalIPLScoreCompImpl implements ExternalIPLScoreComp {

	@Override
	public String getScore(int mid) {
	
		 if(mid==1001)
			 return " KKR vs RCB ---> 123/6 (kkr)";
		 else if(mid==1002)
			 return " CSK vs RCB ---> 190/6 (csk)";
		 else if(mid==1003)
			 return " SRH vs MI ---> 90/6 (MI)";
		 else
			 return " Invalid Match Id";
	}

}
