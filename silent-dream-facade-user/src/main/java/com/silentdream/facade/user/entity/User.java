package com.silentdream.facade.user.entity;

import java.io.Serializable;
import java.util.Date;

import com.silentdream.common.entity.BaseEntity;

public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 2128346393707857300L;

	private String nickName;
	private String address;
	private Date postCode;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getPostCode() {
		return postCode;
	}

	public void setPostCode(Date postCode) {
		this.postCode = postCode;
	}
}
