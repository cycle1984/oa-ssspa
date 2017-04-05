package cn.cycle.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cycle.oa.model.PageModel;

@Controller
@RequestMapping("unit")
public class UnitController {

	
	@RequestMapping("list")
	@ResponseBody
	public Object list(PageModel pageModel,Integer myGroupId ){
		
		
		return null;
	}
}
