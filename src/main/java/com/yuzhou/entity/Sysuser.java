package com.yuzhou.entity;

public class Sysuser {
	private Integer userId;
	private String  userName;
	private String  userPassword;
	private Integer  daId;
	private Integer userRoleId;
	
	
	@Override
	public String toString() {
		return "Sysuser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", daId="
				+ daId + ", userRoleId=" + userRoleId + "]";
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public Integer getDaId() {
		return daId;
	}


	public void setDaId(Integer daId) {
		this.daId = daId;
	}


	public Integer getUserRoleId() {
		return userRoleId;
	}


	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}


	public Sysuser() {
		super();
	}


	public Sysuser(Integer userId, String userName, String userPassword, Integer daId, Integer userRoleId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.daId = daId;
		this.userRoleId = userRoleId;
	}

}
