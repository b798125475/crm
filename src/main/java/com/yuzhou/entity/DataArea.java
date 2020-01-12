package com.yuzhou.entity;

public class DataArea {
	private int daId;
	private String daName;
	public int getDaId() {
		return daId;
	}
	public void setDaId(int daId) {
		this.daId = daId;
	}
	public String getDaName() {
		return daName;
	}
	public void setDaName(String daName) {
		this.daName = daName;
	}
	public DataArea() {
		super();
	}
	public DataArea(int daId, String daName) {
		super();
		this.daId = daId;
		this.daName = daName;
	}
	
}
