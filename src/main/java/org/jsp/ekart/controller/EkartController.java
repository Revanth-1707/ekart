package org.jsp.ekart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EkartController {
	
	@GetMapping
	public String loadHomePage() {
		return "home.html";
	}
}
