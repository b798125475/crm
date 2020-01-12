package com.yuzhou.service.cust.bxy;

import org.springframework.web.bind.annotation.RequestBody;

import com.yuzhou.entity.ClientLinkman;

public interface ClientLinkmanService {
	// 通过客户编号查询客户联系人
	public ClientLinkman selectClientlinkmanById(ClientLinkman clientLinkman);

	// 新建客户联系人
	public int insertClientLinkman(ClientLinkman clientLinkman);
	
	//更新客户联系人
	public int updateClientLinkman(ClientLinkman clientLinkman);
	
	//删除客户联系人
	public int deleteClientLinkman(ClientLinkman clientLinkman);
}
