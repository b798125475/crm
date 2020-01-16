package com.yuzhou.entity;

public class LastClientOrders {
	private String clientCode;
	// 转用于分页的分两个属性
	private Integer beginNum;
	private Sysuser sysUser = new Sysuser();
	private ClientInfo clientInfo = new ClientInfo();

	public Sysuser getSysUser() {
		return sysUser;
	}

	public void setSysUser(Sysuser sysUser) {
		this.sysUser = sysUser;
	}

	public ClientInfo getClientInfo() {
		return clientInfo;
	}

	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}

	public LastClientOrders() {

	}

	public Integer getBeginNum() {
		return beginNum;
	}

	public void setBeginNum(Integer beginNum) {
		this.beginNum = beginNum;
	}

	public Integer getMaxPageNum() {
		return maxPageNum;
	}

	public void setMaxPageNum(Integer maxPageNum) {
		this.maxPageNum = maxPageNum;
	}

	private Integer maxPageNum;

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public LastClientOrders(String clientCode, Integer ordersId, String ordersDate, Integer ordersState,
			Integer ordersTotal, String remark) {
		super();
		this.clientCode = clientCode;
		this.ordersId = ordersId;
		this.ordersDate = ordersDate;
		this.ordersState = ordersState;
		this.ordersTotal = ordersTotal;
		this.remark = remark;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public String getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}

	public Integer getOrdersState() {
		return ordersState;
	}

	public void setOrdersState(Integer ordersState) {
		this.ordersState = ordersState;
	}

	public Integer getOrdersTotal() {
		return ordersTotal;
	}

	public void setOrdersTotal(Integer ordersTotal) {
		this.ordersTotal = ordersTotal;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	private Integer ordersId;
	private String ordersDate;
	private Integer ordersState;
	private Integer ordersTotal;
	private String remark;
}
