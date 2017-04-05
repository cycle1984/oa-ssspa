package cn.cycle.oa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.activiti.engine.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private IdentityService identityService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		HttpSession session=request.getSession();
		if(session.getAttribute("USER")!=null){
			return "redirect:/home/index";
		}else{
			return "/user/loginUI";
		}
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request){
		HttpSession session=request.getSession();
		
		return "/home/index";
	}
}
