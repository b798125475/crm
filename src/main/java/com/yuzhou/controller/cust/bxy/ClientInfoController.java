package com.yuzhou.controller.cust.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.service.cust.bxy.ClientInfoService;

@RestController
public class ClientInfoController {
	@Autowired
	private ClientInfoService clientInfoService;

	// 查询客户信息的表
	@RequestMapping("/selectClientAll")
	public List<ClientInfo> selectClient() throws Exception {
		return clientInfoService.selectClient();
	}

	// 转用于分页的方法
	@RequestMapping("/selectClientCount")
	public int selectClientCount(@RequestBody ClientInfo clientInfo) throws Exception {
		return clientInfoService.selectClientCount(clientInfo);
	}

	// 全查询多条件模糊 且分页
	@RequestMapping("/selectClientPaging")
	public List<ClientInfo> selectClientPaging(@RequestBody ClientInfo clientInfo) throws Exception {
		return clientInfoService.selectClientPaging(clientInfo);
	}

	// 编辑客户信息的方法
	@RequestMapping("/updateClientById")
	public int updateClientById(@RequestBody ClientInfo clientInfo) throws Exception {
		return clientInfoService.updateClientById(clientInfo);
	}
	
	//删除客户的方法
	@RequestMapping("/deleteClientById")
	public int deleteClientById(@RequestBody ClientInfo clientInfo) throws Exception{
		return clientInfoService.deleteClientById(clientInfo);
	}

}
