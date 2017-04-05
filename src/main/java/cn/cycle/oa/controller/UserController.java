package cn.cycle.oa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cycle.oa.po.User;
import cn.cycle.oa.service.UserService;
import cycle.oa.easyui.Json;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	@ResponseBody
	public Json login(HttpServletRequest request,User user){
		Json json = new Json();
		HttpSession session=request.getSession();
		User u = userService.findByLoginNameAndPassword(user.getLoginName(), user.getPassword());
		if(u!=null){
			session.setAttribute("USER", u);
			json.setSuccess(true);
			json.setMsg("登录成功！！！");
		} else {
			json.setMsg("登录失败，账号或者密码错误！！！");
		}
			
		return json;
	}

}
