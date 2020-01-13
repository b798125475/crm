package com.yuzhou.entity;

public class SalePlan {
	private int planId;
	private int planChcId;
	private String planTodo;
	private String planResult;
	
	
	//作用于分页
	private int beginNum;
	private int maxPageNum;
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getPlanChcId() {
		return planChcId;
	}
	public void setPlanChcId(int planChcId) {
		this.planChcId = planChcId;
	}
	public String getPlanTodo() {
		return planTodo;
	}
	public void setPlanTodo(String planTodo) {
		this.planTodo = planTodo;
	}
	public String getPlanResult() {
		return planResult;
	}
	public void setPlanResult(String planResult) {
		this.planResult = planResult;
	}
	public SalePlan() {
		super();
	}
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
	public SalePlan(int planId, int planChcId, String planTodo, String planResult) {
		super();
		this.planId = planId;
		this.planChcId = planChcId;
		this.planTodo = planTodo;
		this.planResult = planResult;
	}
	
}
