package me.shijunjie.SiteAccountingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherController {
	
	@GetMapping("other")
	public String other() {
		return "view/other";
	}
	
}
