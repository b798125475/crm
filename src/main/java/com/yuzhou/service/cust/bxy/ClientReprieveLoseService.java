package com.yuzhou.service.cust.bxy;

import java.util.List;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.ClientReprieveLose;

public interface ClientReprieveLoseService {
	
	
	
	//通过用户ID查询
	public List<ClientReprieveLose> selectClientReprieveLoseById(ClientReprieveLose clientReprieveLose);

	public int insertClientReprieveLose(ClientReprieveLose clientReprieveLose);
	
}
