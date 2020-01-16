package com.yuzhou.controller.cust.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.LastClientOrders;
import com.yuzhou.service.cust.bxy.LastClientOrderService;

@RestController
public class LastClientOrderController {

	@Autowired
	private LastClientOrderService lastClientOrderService;

	@RequestMapping("/selectLastOrders")
	public List<LastClientOrders> selectLastOrders(@RequestBody LastClientOrders lastClientOrders) throws Exception {
		return lastClientOrderService.selectLastOrders(lastClientOrders);
	}

	@RequestMapping("/selectLastClientOrdersCount")
	public int selectLastClientOrdersCount(@RequestBody LastClientOrders lastClientOrders) throws Exception {
		return lastClientOrderService.selectLastClientOrdersCount(lastClientOrders);
	}

	@RequestMapping("/selectOrdersByClientCode")
	public LastClientOrders selectOrdersByClientCode(@RequestBody LastClientOrders lastClientOrders) throws Exception {
		return lastClientOrderService.selectOrdersByClientCode(lastClientOrders);
	}
}
