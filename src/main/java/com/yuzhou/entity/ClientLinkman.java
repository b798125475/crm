package com.yuzhou.entity;

public class ClientLinkman {
	private int clientLinkmanId;
	private String clientLinkmanName;
	private int clientLinkmanSex;
	private String clientLinkmanJob;
	private String clientLinkmanTel;
	private String clientLinkmanMobile;
	private String remark;
	private String clientCode;
	public int getClientLinkmanId() {
		return clientLinkmanId;
	}
	public void setClientLinkmanId(int clientLinkmanId) {
		this.clientLinkmanId = clientLinkmanId;
	}
	public String getClientLinkmanName() {
		return clientLinkmanName;
	}
	public void setClientLinkmanName(String clientLinkmanName) {
		this.clientLinkmanName = clientLinkmanName;
	}
	public int getClientLinkmanSex() {
		return clientLinkmanSex;
	}
	public void setClientLinkmanSex(int clientLinkmanSex) {
		this.clientLinkmanSex = clientLinkmanSex;
	}
	public String getClientLinkmanJob() {
		return clientLinkmanJob;
	}
	public void setClientLinkmanJob(String clientLinkmanJob) {
		this.clientLinkmanJob = clientLinkmanJob;
	}
	public String getClientLinkmanTel() {
		return clientLinkmanTel;
	}
	public void setClientLinkmanTel(String clientLinkmanTel) {
		this.clientLinkmanTel = clientLinkmanTel;
	}
	public String getClientLinkmanMobile() {
		return clientLinkmanMobile;
	}
	public void setClientLinkmanMobile(String clientLinkmanMobile) {
		this.clientLinkmanMobile = clientLinkmanMobile;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public ClientLinkman() {
		super();
	}
	public ClientLinkman(int clientLinkmanId, String clientLinkmanName, int clientLinkmanSex, String clientLinkmanJob,
			String clientLinkmanTel, String clientLinkmanMobile, String remark, String clientCode) {
		super();
		this.clientLinkmanId = clientLinkmanId;
		this.clientLinkmanName = clientLinkmanName;
		this.clientLinkmanSex = clientLinkmanSex;
		this.clientLinkmanJob = clientLinkmanJob;
		this.clientLinkmanTel = clientLinkmanTel;
		this.clientLinkmanMobile = clientLinkmanMobile;
		this.remark = remark;
		this.clientCode = clientCode;
	}
	
}
