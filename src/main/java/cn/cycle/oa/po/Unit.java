package cn.cycle.oa.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 单位
 * @author Administrator
 *
 */
@Entity
@Table
public class Unit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id ;//主键
	private String name ;//名称
	private String tel ;//电话
	
	private Unit parent;//上级单位
	private MyGroup myGroup;//所属组织机构
	
	private Set<User> user = new HashSet<User>();
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=15)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	@ManyToOne
	@JoinColumn(name="parent_Id")
	public Unit getParent() {
		return parent;
	}
	public void setParent(Unit parent) {
		this.parent = parent;
	}
	
	@ManyToOne
	@JoinColumn(name="myGroup_Id")
	public MyGroup getMyGroup() {
		return myGroup;
	}
	public void setMyGroup(MyGroup myGroup) {
		this.myGroup = myGroup;
	}
	
	@OneToMany(mappedBy="unit")
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	
	
}
