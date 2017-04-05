package cn.cycle.oa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.cycle.oa.po.User;

public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

	User findByLoginNameAndPassword(String loginName, String password);

}
