package com.ashokit.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.model.Contact;
import com.ashokit.service.ContactService;

@Controller
public class ViewAllContactsController {
    
	@Autowired
	ContactService contactService;
	
   
	@RequestMapping("/editContact")
	public String editLinkHandler(@RequestParam("id") Integer cid, Model model) {
		
		Contact contactById = contactService.getContactById(cid);
		System.out.println("edit controller");
		model.addAttribute("contacts", contactById);
	return "index";	
	}
	@RequestMapping("/deleteContact")
	public String deleteLinkHandler(@RequestParam("id") Integer cid, RedirectAttributes rattr) {
		
		boolean deleteContact = contactService.deleteContact(cid);
		rattr.addFlashAttribute("dltmsg","Contact Deleted Successfully");
		
		return "redirect:viewall";
	}
}
