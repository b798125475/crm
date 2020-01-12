package com.yuzhou.service.cust.bxy;

import java.util.List;

import com.yuzhou.entity.ClientInfo;

public interface ClientInfoService {
	// 查询全部客户的方法
	public List<ClientInfo> selectClient();

	// 专门用于分页的方法(总行数)
	public int selectClientCount(ClientInfo clientInfo);

	// 查询全部（做模糊查询）
	public List<ClientInfo> selectClientPaging(ClientInfo clientInfo);

	// 更新客户信息的方法
	public int updateClientById(ClientInfo clientInfo);
	
	//删除客户的方法
	public int deleteClientById(ClientInfo clientInfo);
}
