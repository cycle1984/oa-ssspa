package cn.cycle.oa.service;

import cn.cycle.oa.po.User;

public interface UserService {

	public User findByLoginNameAndPassword(String loginName,String password);
}
