package cn.cycle.oa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import cn.cycle.oa.dao.UnitDao;
import cn.cycle.oa.po.Unit;
import cn.cycle.oa.service.UnitService;

@Service("unitService")
public class UnitServiceImpl implements UnitService {

	@Autowired
	private UnitDao unitDao;
	
	@Override
	public Page<Unit> findByMyGroupId(Integer myGroupId, int nowpage, int size) {
		
		
		Order order = new Order(Direction.DESC, "");
		Sort sort = new Sort(order );
		Pageable pageable = new PageRequest(nowpage, size, sort );
		return unitDao.findByMyGroupId(myGroupId, pageable  );
	}

}
