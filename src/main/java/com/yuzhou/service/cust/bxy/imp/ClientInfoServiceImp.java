package com.yuzhou.service.cust.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.DataArea;
import com.yuzhou.entity.DataClientLevel;
import com.yuzhou.entity.Sysuser;
import com.yuzhou.mapper.cust.bxy.ClientInfoMapper;
import com.yuzhou.service.cust.bxy.ClientInfoService;

@Service
public class ClientInfoServiceImp implements ClientInfoService {
	@Autowired
	private ClientInfoMapper clientInfoMapper;
	// 查询全部客户的方法（普通查询 可删除）
	@Override
	public List<ClientInfo> selectClient() {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectClient();
	}

	// 专门用于分页的方法(总行数)
	@Override
	public int selectClientCount(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectClientCount(clientInfo);
	}

	// 查询全部（做模糊查询）
	@Override
	public List<ClientInfo> selectClientPaging(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectClientPaging(clientInfo);
	}

	// 更新客户信息的方法
	@Override
	public int updateClientById(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.updateClientById(clientInfo);
	}
	
	//删除客户的方法
	@Override
	public int deleteClientById(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.deleteClientById(clientInfo);
	}

	//查询全部客户经理
	@Override
	public List<Sysuser> selectSysuser() {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectSysuser();
	}
	
	//查询全部地区
	@Override
	public List<DataArea> selectDataArea() {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectDataArea();
	}
	//查询全部客户等级
	@Override
	public List<DataClientLevel> selectDataClientLevel() {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectDataClientLevel();
	}

	@Override
	public ClientInfo selectClientInfoById(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectClientInfoById(clientInfo);
	}

	@Override
	public Sysuser selectSysuserById(Sysuser sysUser) {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectSysuserById(sysUser);
	}

	//更新客户状态为流失
	@Override
	public int updateClientStateById(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.updateClientStateById(clientInfo);
	}

	
}
