package cn.cycle.oa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.cycle.oa.po.Unit;

public interface UnitDao extends JpaRepository<Unit, Integer>, JpaSpecificationExecutor<Unit> {


	//根据传过来的myGroupId,nowpage,size分页查询
	Page<Unit> findByMyGroupId(Integer myGroupId,Pageable pageable);
}
