package cn.cycle.oa.service;

import org.springframework.data.domain.Page;

import cn.cycle.oa.po.Unit;

public interface UnitService {

	public Page<Unit> findByMyGroupId(Integer myGroupId,int nowpage,int size);
}
