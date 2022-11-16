package com.SearchPage2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SearchPage2.DTO.LeadData;

@Controller
public class SearchLeadController {

	
	@RequestMapping("/SearchPage")
	public String searchPage()
	{
		return"Search_lead";
	}
	
	@RequestMapping("searchlead")
	public String searchLead(@RequestParam("id") long id,ModelMap m)
	{
		RestLeadClient client = new RestLeadClient();
		LeadData lead = client.getLeadByid(id);
		m.addAttribute("l", lead);
		return "Result_Lead";
		
	}
}
