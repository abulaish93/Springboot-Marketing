package com.marketingapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp1.dto.LeadDto;
import com.marketingapp1.entity.Lead;
import com.marketingapp1.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService; //new LeadServiceImpl();
	
	//http:localhost:8080/create
	@RequestMapping("/create")
	public String viewLeadForm() {
		return "create_lead";
		
	}
	
	@RequestMapping("/saveReg")
	public String saveLead(@ModelAttribute Lead lead, Model model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Record is Saved!!");
		return "create_lead";
		
	}

//	@RequestMapping("/saveReg")
//	public String saveLead(@ModelAttribute Lead lead) {   // 1st Approach
//		leadService.saveLead(lead);
//		System.out.println(lead.getFirstName());
//		System.out.println(lead.getLastName());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
//		return "create_lead";
//	}
//	@RequestMapping("/saveReg")
//	public String saveLead
//	(@RequestParam("firstName")String firstName,     // 2nd Approach
//		@RequestParam("lastName")String lastName,
//		@RequestParam("email")String email,
//		@RequestParam("mobile")long mobile
//			
//			) {
//		Lead lead = new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastName);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		leadService.saveLead(lead);
//		return "create_lead";
//}
//	@RequestMapping("/saveReg")
//	public String saveLead(
//	LeadDto leadDto                                 // 3rd Approach
//			) {
//		Lead lead = new Lead();
//		lead.setFirstName(leadDto.getFirstName());
//		lead.setLastName(leadDto.getLastName());
//		lead.setEmail(leadDto.getEmail());
//		lead.setMobile(leadDto.getMobile());
//		leadService.saveLead(lead);
//		return "create_lead";
//}
//http://localhost:8080/listall
@RequestMapping("/listall")
public String listAllLeads(Model model) {
	List<Lead> leads = leadService.listLeads();
	model.addAttribute("leads", leads);
	return "search_results";
}

@RequestMapping("/delete")
public String deleteLead(@RequestParam("id") long id,Model model) {
	leadService.deleteLead(id);
	List<Lead> leads = leadService.listLeads();
	model.addAttribute("leads", leads);
	return "search_results";
}
@RequestMapping("/update")
public String updateLead(@RequestParam("id") long id,Model model) {
	Lead lead=leadService.findLead(id);
	model.addAttribute("leads", lead);
	return "update_lead";
}
@RequestMapping("/updateReg")
public String updateReg(LeadDto leadDto, Model model) {
	Lead lead = new Lead();
	lead.setId(leadDto.getId());
	lead.setFirstName(leadDto.getFirstName());
	lead.setLastName(leadDto.getLastName());
	lead.setEmail(leadDto.getEmail());
	lead.setMobile(leadDto.getMobile());
	leadService.saveLead(lead);
	List<Lead> leads = leadService.listLeads();
	model.addAttribute("leads", leads);
	return "search_results";
}
}

