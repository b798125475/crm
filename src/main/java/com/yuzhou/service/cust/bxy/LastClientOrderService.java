package com.yuzhou.service.cust.bxy;

import java.util.List;

import com.yuzhou.entity.LastClientOrders;

public interface LastClientOrderService {
	public List<LastClientOrders> selectLastOrders(LastClientOrders lastClientOrders);
	
	public int selectLastClientOrdersCount(LastClientOrders lastClientOrders);
	
	public LastClientOrders selectOrdersByClientCode(LastClientOrders lastClientOrders);
}	
