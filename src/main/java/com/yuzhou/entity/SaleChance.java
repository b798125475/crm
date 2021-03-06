package com.yuzhou.entity;

public class SaleChance {
	private int chanceId;
	private String chanceSource;
	private String chanceCustName;
	private String chanceTitle;
	private int chanceRate;
	private String chanceLinkman;
	private String chanceTel;
	private String chanceDesc;
	private int chanceCreateId;
	private String chanceCreateDate;
	private int chanceDueId;
	private String chanceDueDate;
	private int chanceStatus;
	
	//作用于分页
	private int beginNum;
	private int maxPageNum;
	public int getBeginNum() {
		return beginNum;
	}
	public void setBeginNum(int beginNum) {
		this.beginNum = beginNum;
	}
	public int getMaxPageNum() {
		return maxPageNum;
	}
	public void setMaxPageNum(int maxPageNum) {
		this.maxPageNum = maxPageNum;
	}
	public int getChanceId() {
		return chanceId;
	}
	public void setChanceId(int chanceId) {
		this.chanceId = chanceId;
	}
	public String getChanceSource() {
		return chanceSource;
	}
	public void setChanceSource(String chanceSource) {
		this.chanceSource = chanceSource;
	}
	public String getChanceCustName() {
		return chanceCustName;
	}
	public void setChanceCustName(String chanceCustName) {
		this.chanceCustName = chanceCustName;
	}
	public String getChanceTitle() {
		return chanceTitle;
	}
	public void setChanceTitle(String chanceTitle) {
		this.chanceTitle = chanceTitle;
	}
	public int getChanceRate() {
		return chanceRate;
	}
	public void setChanceRate(int chanceRate) {
		this.chanceRate = chanceRate;
	}
	public String getChanceLinkman() {
		return chanceLinkman;
	}
	public void setChanceLinkman(String chanceLinkman) {
		this.chanceLinkman = chanceLinkman;
	}
	public String getChanceTel() {
		return chanceTel;
	}
	public void setChanceTel(String chanceTel) {
		this.chanceTel = chanceTel;
	}
	public String getChanceDesc() {
		return chanceDesc;
	}
	public void setChanceDesc(String chanceDesc) {
		this.chanceDesc = chanceDesc;
	}
	public int getChanceCreateId() {
		return chanceCreateId;
	}
	public void setChanceCreateId(int chanceCreateId) {
		this.chanceCreateId = chanceCreateId;
	}
	public String getChanceCreateDate() {
		return chanceCreateDate;
	}
	public void setChanceCreateDate(String chanceCreateDate) {
		this.chanceCreateDate = chanceCreateDate;
	}
	public int getChanceDueId() {
		return chanceDueId;
	}
	public void setChanceDueId(int chanceDueId) {
		this.chanceDueId = chanceDueId;
	}
	public String getChanceDueDate() {
		return chanceDueDate;
	}
	public void setChanceDueDate(String chanceDueDate) {
		this.chanceDueDate = chanceDueDate;
	}
	public int getChanceStatus() {
		return chanceStatus;
	}
	public void setChanceStatus(int chanceStatus) {
		this.chanceStatus = chanceStatus;
	}
	public SaleChance() {
		super();
	}
	public SaleChance(int chanceId, String chanceSource, String chanceCustName, String chanceTitle, int chanceRate,
			String chanceLinkman, String chanceTel, String chanceDesc, int chanceCreateId, String chanceCreateDate,
			int chanceDueId, String chanceDueDate, int chanceStatus) {
		super();
		this.chanceId = chanceId;
		this.chanceSource = chanceSource;
		this.chanceCustName = chanceCustName;
		this.chanceTitle = chanceTitle;
		this.chanceRate = chanceRate;
		this.chanceLinkman = chanceLinkman;
		this.chanceTel = chanceTel;
		this.chanceDesc = chanceDesc;
		this.chanceCreateId = chanceCreateId;
		this.chanceCreateDate = chanceCreateDate;
		this.chanceDueId = chanceDueId;
		this.chanceDueDate = chanceDueDate;
		this.chanceStatus = chanceStatus;
	}
	
}
