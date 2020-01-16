package com.yuzhou.controller.cust.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.Orders;
import com.yuzhou.service.cust.bxy.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;

	//通过ID查询用户历史订单的方法
	@RequestMapping("/selectOrders")
	public List<Orders> selectOrders(@RequestBody Orders orders) throws Exception {
		return ordersService.selectOrders(orders);
	}
}
