package com.ashokit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashokit.entity.ContactsEntity;
import com.ashokit.service.ContactService;




@Controller
public class NewContactController {
    
	@Autowired
	ContactService service;
	
	@GetMapping("/")
	public String welcomepage() {
		
		
		return "index";
	}
	@PostMapping("/add")
	public String newContactformHandler(@ModelAttribute ContactsEntity entity) {
		
		boolean b = service.addNewContact(entity);
		if(b==true) {
			return "status";	
		}
		return "failure";
	}
	
	@RequestMapping("/viewall")
	public String viewAllContactslinkhandler() {
		
		
		return "viewcontacts";
	}
	
}
