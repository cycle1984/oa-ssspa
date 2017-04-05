package cn.cycle.oa.service.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cn.cycle.oa.dao.MyGroupDao;
import cn.cycle.oa.po.MyGroup;
import cn.cycle.oa.service.MyGroupService;

@Service("myGroupService")
public class MyGroupServiceImpl implements MyGroupService {

	@Autowired
	private MyGroupDao myGroupDao;

	@Override
	public Page<MyGroup> findAllMyGroup() {
		Sort sort = null;
		int size = 0;//每页显示条数
		int page = 0;//当前页
		PageRequest pageable = new PageRequest(page, size, sort);
				//new PageRequest(pageNo, pageSize);
		Specification<MyGroup> specification=new Specification<MyGroup>() {
			/**
			 * @param *root: 代表查询的实体类. 
			 * @param query: 可以从中可到 Root 对象, 即告知 JPA Criteria 查询要查询哪一个实体类. 还可以
			 * 来添加查询条件, 还可以结合 EntityManager 对象得到最终查询的 TypedQuery 对象. 
			 * @param *cb: CriteriaBuilder 对象. 用于创建 Criteria 相关对象的工厂. 当然可以从中获取到 Predicate 对象
			 * @return: *Predicate 类型, 代表一个查询条件. 
			 */
			@Override
			public Predicate toPredicate(Root<MyGroup> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path path = root.get("id");
				Predicate predicate = cb.gt(path, 5);
				return predicate;
			}
		};
		Specification<MyGroup> spec = null;
		return myGroupDao.findAll(spec, pageable);
	}
	

}
