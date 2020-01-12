package com.yuzhou.entity;

public class ClientReprieveLose {
	private int clientReprieveLoseId;
	private String reprieveStep;
	private String clientCode;
	public int getClientReprieveLoseId() {
		return clientReprieveLoseId;
	}
	public void setClientReprieveLoseId(int clientReprieveLoseId) {
		this.clientReprieveLoseId = clientReprieveLoseId;
	}
	public String getReprieveStep() {
		return reprieveStep;
	}
	public void setReprieveStep(String reprieveStep) {
		this.reprieveStep = reprieveStep;
	}
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public ClientReprieveLose() {
		super();
	}
	public ClientReprieveLose(int clientReprieveLoseId, String reprieveStep, String clientCode) {
		super();
		this.clientReprieveLoseId = clientReprieveLoseId;
		this.reprieveStep = reprieveStep;
		this.clientCode = clientCode;
	}
	
}	
