package com.yuzhou.entity;

public class ClientServer {
	private int serverId;
	private int serverTypeId;
	private String serverTitle;
	private String clientCode;
	private int serverStatus;
	private String serverContent;
	private int serverCreateId;
	private String serverCreateDate;
	private int serverDueId;
	private String serverDueDate;
	private String serverProcessing;
	private String processingDate;
	private String processingResult;
	private int clientContentment;
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public int getServerTypeId() {
		return serverTypeId;
	}
	public void setServerTypeId(int serverTypeId) {
		this.serverTypeId = serverTypeId;
	}
	public String getServerTitle() {
		return serverTitle;
	}
	public void setServerTitle(String serverTitle) {
		this.serverTitle = serverTitle;
	}
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public int getServerStatus() {
		return serverStatus;
	}
	public void setServerStatus(int serverStatus) {
		this.serverStatus = serverStatus;
	}
	public String getServerContent() {
		return serverContent;
	}
	public void setServerContent(String serverContent) {
		this.serverContent = serverContent;
	}
	public int getServerCreateId() {
		return serverCreateId;
	}
	public void setServerCreateId(int serverCreateId) {
		this.serverCreateId = serverCreateId;
	}
	public String getServerCreateDate() {
		return serverCreateDate;
	}
	public void setServerCreateDate(String serverCreateDate) {
		this.serverCreateDate = serverCreateDate;
	}
	public int getServerDueId() {
		return serverDueId;
	}
	public void setServerDueId(int serverDueId) {
		this.serverDueId = serverDueId;
	}
	public String getServerDueDate() {
		return serverDueDate;
	}
	public void setServerDueDate(String serverDueDate) {
		this.serverDueDate = serverDueDate;
	}
	public String getServerProcessing() {
		return serverProcessing;
	}
	public void setServerProcessing(String serverProcessing) {
		this.serverProcessing = serverProcessing;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	public String getProcessingResult() {
		return processingResult;
	}
	public void setProcessingResult(String processingResult) {
		this.processingResult = processingResult;
	}
	public int getClientContentment() {
		return clientContentment;
	}
	public void setClientContentment(int clientContentment) {
		this.clientContentment = clientContentment;
	}
	public ClientServer() {
		super();
	}
	public ClientServer(int serverId, int serverTypeId, String serverTitle, String clientCode, int serverStatus,
			String serverContent, int serverCreateId, String serverCreateDate, int serverDueId, String serverDueDate,
			String serverProcessing, String processingDate, String processingResult, int clientContentment) {
		super();
		this.serverId = serverId;
		this.serverTypeId = serverTypeId;
		this.serverTitle = serverTitle;
		this.clientCode = clientCode;
		this.serverStatus = serverStatus;
		this.serverContent = serverContent;
		this.serverCreateId = serverCreateId;
		this.serverCreateDate = serverCreateDate;
		this.serverDueId = serverDueId;
		this.serverDueDate = serverDueDate;
		this.serverProcessing = serverProcessing;
		this.processingDate = processingDate;
		this.processingResult = processingResult;
		this.clientContentment = clientContentment;
	}
	
}
