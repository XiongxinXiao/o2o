package com.xxx.o2o.entity;

import java.util.Date;

public class Area {
	// ID
	private Integer areaId;
	// name
	private String areaName;
	// priority
	private Integer priority;
	// create time
	private Date createTime;
	// last edit time
	private Date LastEditTime;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return LastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		LastEditTime = lastEditTime;
	}

}
