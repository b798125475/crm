package com.yuzhou.controller.cust.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientLinkman;
import com.yuzhou.service.cust.bxy.ClientLinkmanService;

@RestController
public class ClientLinkmanController {
	@Autowired
	private ClientLinkmanService clientLinkmanService;

	// 查询客户联系人 通过客户Id查询
	@RequestMapping("/selectClientLinkmanById")
	public List<ClientLinkman> selectClientlinkmanById(@RequestBody ClientLinkman clientLinkman) throws Exception {
		return clientLinkmanService.selectClientlinkmanById(clientLinkman);
	}

	// 新建客户联系人
	@RequestMapping("/insertClientLinkman")
	public int insertClientLinkman(@RequestBody ClientLinkman clientLinkman) throws Exception {
		return clientLinkmanService.insertClientLinkman(clientLinkman);
	}
	
	//更新客户联系人
	@RequestMapping("/updateClientLinkman")
	public int updateClientLinkman(@RequestBody ClientLinkman clientLinkman) throws Exception{
		return clientLinkmanService.updateClientLinkman(clientLinkman);
	}
	
	//删除联系人
	@RequestMapping("/deleteClientLinkman")
	public int deleteClientLinkman(@RequestBody ClientLinkman clientLinkman) throws Exception{
		return clientLinkmanService.deleteClientLinkman(clientLinkman);	
	}
	
	//通过ID查询客户联系人
	@RequestMapping("/selectclientLinkmanByIdObj")
	public ClientLinkman selectclientLinkmanById(@RequestBody ClientLinkman clientLinkman) throws Exception{
		return clientLinkmanService.selectclientLinkmanById(clientLinkman);
	}
}
