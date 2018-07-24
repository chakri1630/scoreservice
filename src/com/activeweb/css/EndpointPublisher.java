package com.activeweb.css;

import javax.xml.ws.Endpoint;

import com.activeweb.css.service.CreditScoreServiceImpl;

public class EndpointPublisher {

	public static void main(String args[]) {
		Endpoint.publish("http://localhost:9712/CreditScoreService", new CreditScoreServiceImpl());
	}
	
}
