package cn.cycle.oa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.cycle.oa.po.MyGroup;
import cn.cycle.oa.po.User;

public interface MyGroupDao extends JpaRepository<MyGroup, Integer>, JpaSpecificationExecutor<User> {


}
