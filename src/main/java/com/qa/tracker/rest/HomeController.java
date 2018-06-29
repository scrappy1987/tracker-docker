package com.qa.tracker.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qa.tracker.constants.Constants;

@Controller
public class HomeController {
	
	@RequestMapping(Constants.HOME)
	public String home() {
		return Constants.INDEX;
	}
}
