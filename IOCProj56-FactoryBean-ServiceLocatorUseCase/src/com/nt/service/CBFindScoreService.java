package com.nt.service;

import com.nt.external.ExternalIPLScoreComp;

public class CBFindScoreService {
	private ExternalIPLScoreComp extComp;
	
	public CBFindScoreService(ExternalIPLScoreComp extComp) {
		this.extComp = extComp;
	}

	public   String findScore(int mid) {
		String score=null;
		//use ExternalService
		score=extComp.getScore(mid);
		return score;
	}
	
	

}
