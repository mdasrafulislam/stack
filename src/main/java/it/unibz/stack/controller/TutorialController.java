package it.unibz.stack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialController {
	
	@RequestMapping("/tutorial")
	public String tutorial() {
		return "tutorial";
	}

}
