package cn.cycle.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cycle.oa.dao.MyGroupDao;
import cn.cycle.oa.po.MyGroup;
import cn.cycle.oa.service.MyGroupService;

@Service("myGroupService")
public class MyGroupServiceImpl implements MyGroupService {

	@Autowired
	private MyGroupDao myGroupDao;

	//获取所以的组织机构
	@Override
	public List<MyGroup> findAllMyGroup() {
		return myGroupDao.findAll();
	}
	

}
