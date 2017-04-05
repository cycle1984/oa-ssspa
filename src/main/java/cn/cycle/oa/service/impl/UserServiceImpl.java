package cn.cycle.oa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cycle.oa.dao.UserDao;
import cn.cycle.oa.po.User;
import cn.cycle.oa.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	//根据登录名和密码查询
	@Override
	public User findByLoginNameAndPassword(String loginName, String password) {
		// TODO Auto-generated method stub
		return userDao.findByLoginNameAndPassword(loginName, password);
	}

}
