package com.activeweb.css.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.activeweb.css.service.beans.ScoreDetails;

@WebService(endpointInterface="com.activeweb.css.service.CreditScoreService")
public class CreditScoreServiceImpl implements CreditScoreService {

	private static Map<String, Integer> ssnScoreMap = new HashMap<String, Integer>();

	static {
		ssnScoreMap.put("12345", 700);
		ssnScoreMap.put("123456", 750);
		ssnScoreMap.put("12345678", 600);
		ssnScoreMap.put("123456789", 650);
	}

	@Override
	public Integer getScore(String ssn) {
		return ssnScoreMap.get(ssn);
	}

	@Override
	public ScoreDetails getScoreDetails(String ssn) {
		
		ScoreDetails sd = new ScoreDetails();
		sd.setScore(ssnScoreMap.get(ssn));
		List<String> accounts = new ArrayList<>();
		accounts.add("BOFA");
		accounts.add("BBT");
		List<String> loans = new ArrayList<>();
		loans.add("Car");
		loans.add("mortagage");

		sd.setBankAccountNumbers(accounts);
		sd.setLoanAccountNumbers(loans);
		
		return sd;
	}

}
