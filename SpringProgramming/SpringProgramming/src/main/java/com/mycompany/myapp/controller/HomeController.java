package com.mycompany.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { // controller�μ� ����ϰڴٴ� ��.
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/") // url mapping
	public String home( ) {
		logger.info("HomeController-home()");
		logger.debug("HomeController-home()");
		return "home"; // view �̸�
	}
	
}
