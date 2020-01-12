package com.yuzhou.service.cust.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.Orders;
import com.yuzhou.mapper.cust.bxy.OrdersMapper;
import com.yuzhou.service.cust.bxy.OrdersService;
@Service
public class OrdersServiceImp implements OrdersService {
	@Autowired
	private OrdersMapper ordersMapper;
	
	//查询用户订单的方法
	@Override
	public List<Orders> selectOrders(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.selectOrders(orders);
	}

}
