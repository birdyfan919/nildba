package com.enmotech.nildba.domain;

import java.io.Serializable;

public class Navigation implements Serializable {

	private static final long serialVersionUID = 1552422603190357528L;

	private Integer id;
	private String name;
	private Integer parentId;
	private String iconFile;
	private String action;
	private Integer childIndex;
	private String status;
	private String remark;
	private String target;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getIconFile() {
		return iconFile;
	}

	public void setIconFile(String iconFile) {
		this.iconFile = iconFile;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getChildIndex() {
		return childIndex;
	}

	public void setChildIndex(Integer childIndex) {
		this.childIndex = childIndex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

}
