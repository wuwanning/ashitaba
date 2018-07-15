package cn.ashitaba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_sys_role")
public class Role implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="role_name",length=20) 
	private String roleName;
	
	@Column(length=200) 
	private String memo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
}
