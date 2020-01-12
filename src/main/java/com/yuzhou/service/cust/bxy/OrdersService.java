package com.yuzhou.service.cust.bxy;

import java.util.List;

import com.yuzhou.entity.Orders;

public interface OrdersService {
	//查询用户订单的方法
	public List<Orders> selectOrders(Orders orders);
}
