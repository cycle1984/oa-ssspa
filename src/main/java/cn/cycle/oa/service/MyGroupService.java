package cn.cycle.oa.service;

import org.springframework.data.domain.Page;

import cn.cycle.oa.po.MyGroup;

public interface MyGroupService {

	public Page<MyGroup> findAllMyGroup();
}
