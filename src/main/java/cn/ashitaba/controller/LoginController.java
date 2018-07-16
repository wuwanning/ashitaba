package cn.ashitaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value={"/", "/index"})
	public String toIndex(){
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String toLogin(){
		
		return "login";
	}

}
