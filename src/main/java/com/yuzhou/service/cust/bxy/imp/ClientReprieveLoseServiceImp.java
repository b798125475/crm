package com.yuzhou.service.cust.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.ClientReprieveLose;
import com.yuzhou.mapper.cust.bxy.ClientReprieveLoseMapper;
import com.yuzhou.service.cust.bxy.ClientReprieveLoseService;
@Service
public class ClientReprieveLoseServiceImp implements ClientReprieveLoseService {
	@Autowired
	private ClientReprieveLoseMapper clientReprieveLoseMapper;

	
//通过ID查询暂缓措施
	@Override
	public List<ClientReprieveLose> selectClientReprieveLoseById(ClientReprieveLose clientReprieveLose) {
		// TODO Auto-generated method stub
		return clientReprieveLoseMapper.selectClientReprieveLoseById(clientReprieveLose);
	}


	@Override
	public int insertClientReprieveLose(ClientReprieveLose clientReprieveLose) {
		// TODO Auto-generated method stub
		return clientReprieveLoseMapper.insertClientReprieveLose(clientReprieveLose);
	}
	
	

}
