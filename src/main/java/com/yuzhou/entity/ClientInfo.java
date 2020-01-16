package com.yuzhou.entity;
/**
 * 用户表的实体类
 * 创建了一个Sysuser类型的对象 ,DataArea类型对象
 * 用于在网页上显示客户经理的姓名，地区名称
 */


public class ClientInfo {
	private String clientCode;
	private String clientName;
	private int clientAreaId;
	private int clientCustId;
	private int clientLevelId;
	private int clientContentment;
	private int clientCredit;
	private String clientAddress;
	private String clientDakCode;
	private String clientTel;
	private String clientFax;
	private String clientNet;
	private String clientCharter;
	private String clientCorporation;
	private int clientBankroll;
	private int clientTurnoverYear;
	private String clientBank;
	private String clientAccounts;
	private String clientNativeTax;
	private String clientCountryTax;
	private int clientState;
	private String clientLoseReason;
	private String clientLoseDate;
	// sysUser 用于调用sysUser表中的客户经理姓名
	private Sysuser sysUser = new Sysuser();
	//dataArea 用于调用DataArea表中的daName地区名称
	private DataArea dataArea = new DataArea();
	//用于区分客户等级的属性
	private DataClientLevel dataClientLevel;
	
	//转用于分页的分两个属性
	private Integer beginNum;
	private Integer maxPageNum;
	
	public DataClientLevel getDataClientLevel() {
		return dataClientLevel;
	}
	public void setDataClientLevel(DataClientLevel dataClientLevel) {
		this.dataClientLevel = dataClientLevel;
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
	public DataArea getDataArea() {
		return dataArea;
	}
	public void setDataArea(DataArea dataArea) {
		this.dataArea = dataArea;
	}
	public Sysuser getSysUser() {
		return sysUser;
	}
	public void setSysUser(Sysuser sysUser) {
		this.sysUser = sysUser;
	}
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getClientAreaId() {
		return clientAreaId;
	}
	public void setClientAreaId(int clientAreaId) {
		this.clientAreaId = clientAreaId;
	}
	public int getClientCustId() {
		return clientCustId;
	}
	public void setClientCustId(int clientCustId) {
		this.clientCustId = clientCustId;
	}
	public int getClientLevelId() {
		return clientLevelId;
	}
	public void setClientLevelId(int clientLevelId) {
		this.clientLevelId = clientLevelId;
	}
	public int getClientContentment() {
		return clientContentment;
	}
	public void setClientContentment(int clientContentment) {
		this.clientContentment = clientContentment;
	}
	public int getClientCredit() {
		return clientCredit;
	}
	public void setClientCredit(int clientCredit) {
		this.clientCredit = clientCredit;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientDakCode() {
		return clientDakCode;
	}
	public void setClientDakCode(String clientDakCode) {
		this.clientDakCode = clientDakCode;
	}
	public String getClientTel() {
		return clientTel;
	}
	public void setClientTel(String clientTel) {
		this.clientTel = clientTel;
	}
	public String getClientFax() {
		return clientFax;
	}
	public void setClientFax(String clientFax) {
		this.clientFax = clientFax;
	}
	public String getClientNet() {
		return clientNet;
	}
	public void setClientNet(String clientNet) {
		this.clientNet = clientNet;
	}
	public String getClientCharter() {
		return clientCharter;
	}
	public void setClientCharter(String clientCharter) {
		this.clientCharter = clientCharter;
	}
	public String getClientCorporation() {
		return clientCorporation;
	}
	public void setClientCorporation(String clientCorporation) {
		this.clientCorporation = clientCorporation;
	}
	public int getClientBankroll() {
		return clientBankroll;
	}
	public void setClientBankroll(int clientBankroll) {
		this.clientBankroll = clientBankroll;
	}
	public int getClientTurnoverYear() {
		return clientTurnoverYear;
	}
	public void setClientTurnoverYear(int clientTurnoverYear) {
		this.clientTurnoverYear = clientTurnoverYear;
	}
	public String getClientBank() {
		return clientBank;
	}
	public void setClientBank(String clientBank) {
		this.clientBank = clientBank;
	}
	public String getClientAccounts() {
		return clientAccounts;
	}
	public void setClientAccounts(String clientAccounts) {
		this.clientAccounts = clientAccounts;
	}
	public String getClientNativeTax() {
		return clientNativeTax;
	}
	public void setClientNativeTax(String clientNativeTax) {
		this.clientNativeTax = clientNativeTax;
	}
	public String getClientCountryTax() {
		return clientCountryTax;
	}
	public void setClientCountryTax(String clientCountryTax) {
		this.clientCountryTax = clientCountryTax;
	}
	public int getClientState() {
		return clientState;
	}
	public void setClientState(int clientState) {
		this.clientState = clientState;
	}
	public String getClientLoseReason() {
		return clientLoseReason;
	}
	public void setClientLoseReason(String clientLoseReason) {
		this.clientLoseReason = clientLoseReason;
	}
	public String getClientLoseDate() {
		return clientLoseDate;
	}
	public void setClientLoseDate(String clientLoseDate) {
		this.clientLoseDate = clientLoseDate;
	}
	public ClientInfo() {
		super();
	}
	public ClientInfo(String clientCode, String clientName, int clientAreaId, int clientCustId, int clientLevelId,
			int clientContentment, int clientCredit, String clientAddress, String clientDakCode, String clientTel,
			String clientFax, String clientNet, String clientCharter, String clientCorporation, int clientBankroll,
			int clientTurnoverYear, String clientBank, String clientAccounts, String clientNativeTax,
			String clientCountryTax, int clientState, String clientLoseReason, String clientLoseDate) {
		super();
		this.clientCode = clientCode;
		this.clientName = clientName;
		this.clientAreaId = clientAreaId;
		this.clientCustId = clientCustId;
		this.clientLevelId = clientLevelId;
		this.clientContentment = clientContentment;
		this.clientCredit = clientCredit;
		this.clientAddress = clientAddress;
		this.clientDakCode = clientDakCode;
		this.clientTel = clientTel;
		this.clientFax = clientFax;
		this.clientNet = clientNet;
		this.clientCharter = clientCharter;
		this.clientCorporation = clientCorporation;
		this.clientBankroll = clientBankroll;
		this.clientTurnoverYear = clientTurnoverYear;
		this.clientBank = clientBank;
		this.clientAccounts = clientAccounts;
		this.clientNativeTax = clientNativeTax;
		this.clientCountryTax = clientCountryTax;
		this.clientState = clientState;
		this.clientLoseReason = clientLoseReason;
		this.clientLoseDate = clientLoseDate;
	}
	
}
