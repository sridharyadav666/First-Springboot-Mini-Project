package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewAllContactsController {

	
	@GetMapping("/viewall")
	public String viewAllContactsPage() {
		System.out.println("view controller");
		System.out.println("view controller");
		System.out.println("pulling");
		return "viewcontacts";
	}
}
