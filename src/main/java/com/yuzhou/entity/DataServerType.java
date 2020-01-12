package com.yuzhou.entity;

public class DataServerType {
	private int dstId;
	private String dstName;
	public int getDstId() {
		return dstId;
	}
	public void setDstId(int dstId) {
		this.dstId = dstId;
	}
	public String getDstName() {
		return dstName;
	}
	public void setDstName(String dstName) {
		this.dstName = dstName;
	}
	public DataServerType() {
		super();
	}
	public DataServerType(int dstId, String dstName) {
		super();
		this.dstId = dstId;
		this.dstName = dstName;
	}
	
}
