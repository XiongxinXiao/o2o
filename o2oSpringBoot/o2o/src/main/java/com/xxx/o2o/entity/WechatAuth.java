package com.xxx.o2o.entity;

import java.util.Date;

public class WechatAuth {
	private Long wehchatAuthId;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;

	public Long getWehchatAuthId() {
		return wehchatAuthId;
	}

	public void setWehchatAuthId(Long wehchatAuthId) {
		this.wehchatAuthId = wehchatAuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
