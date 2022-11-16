package com.SearchPage2.controller;

import org.springframework.web.client.RestTemplate;

import com.SearchPage2.DTO.LeadData;

public class RestLeadClient {

	public LeadData getLeadByid(long id)
	{
		RestTemplate rest = new RestTemplate();
		LeadData lead = rest.getForObject("http://localhost:8080/api/leads/get/"+id, LeadData.class);
		return lead;
		
	}
}
