package com.ashokit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.entity.ContactsEntity;
import com.ashokit.model.Contact;
import com.ashokit.service.ContactService;




@Controller
public class NewContactController {
    
	@Autowired
	ContactService service;
	
	@GetMapping("/")
	public String welcomepage(Model model) {
		Contact cpojo=new Contact();
		model.addAttribute("contacts",cpojo );
		return "index";
	}
	@PostMapping("/add")
	public String newContactformHandler(@ModelAttribute("contacts") Contact cpojo, RedirectAttributes redrct) {
		
		boolean addNewContact = service.addNewContact(cpojo);
		redrct.addFlashAttribute("status", "contact saved successfully");
	return "redirect:/";
	}
	
//	@GetMapping("/savedcontact")
//	public String contactSavedStatus(Model model) {
//		
//	
//	model.addAttribute("contacts",new Contact());
//	
//	return "index";
//	}
	@RequestMapping("/viewall")
	public String viewAllContactslinkhandler() {
		
		
		return "viewcontacts";
	}
	
}
