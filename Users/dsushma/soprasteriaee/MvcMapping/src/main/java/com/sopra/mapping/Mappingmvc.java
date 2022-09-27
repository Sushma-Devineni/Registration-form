package com.sopra.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mappingmvc {
	@RequestMapping("/sushma")
	public String Home() {
		return "hello";
	}
	@RequestMapping("/about")
	public String About() {
		return "sopra";
	}
	

}
