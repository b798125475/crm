package com.yuzhou.service.cust.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientInfo;
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

}
