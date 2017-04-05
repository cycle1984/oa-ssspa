package cn.cycle.oa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cycle.oa.po.MyGroup;
import cn.cycle.oa.po.User;
import cn.cycle.oa.service.MyGroupService;

@Controller
@RequestMapping("/myGroup")
public class MyGroupController extends BaseController{

	@Autowired
	private MyGroupService myGroupService;
	
	@RequestMapping("/list")
	@ResponseBody
	public Object list(){
		Page<MyGroup> page = myGroupService.findAllMyGroup();
		//总记录数
		Long total = page.getTotalElements();
		//当前页面的 List
		List<MyGroup> myGroups = page.getContent();
		
		return null;
	}
}
