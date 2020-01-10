package com.yuzhou.service.server.bxy.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuzhou.entity.Sysuser;
import com.yuzhou.mapper.server.bxy.SysuserMapper;
import com.yuzhou.service.server.bxy.Sysuserservice;
@Service
@Transactional
public class Sysuserserviceimp implements Sysuserservice {
    @Autowired 
	SysuserMapper sm;
	@Override
	public Sysuser login(Sysuser u) {
		
		return sm.login(u);
	}

}
