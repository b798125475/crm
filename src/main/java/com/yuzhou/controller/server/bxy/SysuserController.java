package com.yuzhou.controller.server.bxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.Sysuser;
import com.yuzhou.service.server.bxy.Sysuserservice;
@RestController
public class SysuserController {
	@Autowired
	Sysuserservice sv;
	
 @RequestMapping("/login")
  public  Sysuser login(@RequestBody Sysuser u) {
	 
	  return sv.login(u);
  }
}
