package com.activeweb.css.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.activeweb.css.service.beans.ScoreDetails;

@WebService
public interface CreditScoreService {

	@WebMethod
	public Integer getScore(String ssn);
	
	@WebMethod
	public ScoreDetails getScoreDetails(String ssn);
	
}
