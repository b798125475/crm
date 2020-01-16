package com.yuzhou.service.cust.bxy;

import java.util.List;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.DataArea;
import com.yuzhou.entity.DataClientLevel;
import com.yuzhou.entity.Sysuser;

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
	
	//查询全部客户经理
	public List<Sysuser> selectSysuser();
	
	//查询全部地区
	public List<DataArea> selectDataArea();

	//查询全部客户等级
	public List<DataClientLevel> selectDataClientLevel();
	
	//查詢客戶通過ID
	public ClientInfo selectClientInfoById(ClientInfo clientInfo);
	
	
	//通过ID 查询客户经理
	public Sysuser selectSysuserById(Sysuser sysUser);
	
	//更新客户状态为流失
	public int updateClientStateById(ClientInfo clientInfo);
	
}
