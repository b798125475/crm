package com.yuzhou.service.cust.bxy.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientLinkman;
import com.yuzhou.mapper.cust.bxy.ClientLinkmanMapper;
import com.yuzhou.service.cust.bxy.ClientLinkmanService;

@Service
public class ClientLinkServiceImp implements ClientLinkmanService {
	@Autowired
	private ClientLinkmanMapper clientLinkmanMapper;

	// 通过客户编号查询客户联系人
	@Override
	public ClientLinkman selectClientlinkmanById(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.selectClientlinkmanById(clientLinkman);
	}

	//新建客户联系人
	@Override
	public int insertClientLinkman(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.insertClientLinkman(clientLinkman);
	}

	//更新客户联系人
	@Override
	public int updateClientLinkman(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.updateClientLinkman(clientLinkman);
	}

	//删除客户联系人
	@Override
	public int deleteClientLinkman(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.deleteClientLinkman(clientLinkman);
	}
	
	
	

}
