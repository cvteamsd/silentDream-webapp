package com.silentdream.login.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 2128346393707857300L;

	private Integer id;
	private String nickName;
	private String address;
	private Date postCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
