package com.mycompany.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { // controller로서 사용하겠다는 것.
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/") // url mapping
	public String home( ) {
		logger.info("HomeController-home()");
		logger.debug("HomeController-home()");
		return "home"; // view 이름
	}
	
}
