package cn.ashitaba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_sys_resource")
public class Resource  implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="resource_name",length=40) 
	private String resourceName;
	
	@Column(length=100) 
	private String url;
	
	@Column(length=200) 
	private String memo;
	
	@Column(length=10) 
	private String type;
	
	@Column(name="parent_id")
	private Integer parentId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	
}
