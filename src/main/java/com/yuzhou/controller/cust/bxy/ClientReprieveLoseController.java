package com.yuzhou.controller.cust.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.ClientReprieveLose;
import com.yuzhou.service.cust.bxy.ClientReprieveLoseService;

@RestController
public class ClientReprieveLoseController {
	@Autowired
	private ClientReprieveLoseService clientReprieveLoseService;

	// 通过客户ID查询暂缓措施
	@RequestMapping("/selectClientReprieveLoseById")
	public List<ClientReprieveLose> selectClientReprieveLoseById(@RequestBody ClientReprieveLose clientReprieveLose)
			throws Exception {
		return clientReprieveLoseService.selectClientReprieveLoseById(clientReprieveLose);
	}
	
	@RequestMapping("/insertClientReprieveLose")
	public int insertClientReprieveLose(@RequestBody ClientReprieveLose clientReprieveLose) throws Exception{
		return clientReprieveLoseService.insertClientReprieveLose(clientReprieveLose);		
	}



}
