package com.yuzhou.mapper.cust.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yuzhou.entity.Orders;

@Mapper
public interface OrdersMapper {
	//查询订单
	@Select("SELECT * from orders where clientCode=#{clientCode} and ordersState=2 ORDER BY ordersDate DESC;")
	public List<Orders> selectOrders(Orders orders);
}
