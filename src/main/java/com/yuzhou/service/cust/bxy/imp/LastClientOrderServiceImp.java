package com.yuzhou.service.cust.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.LastClientOrders;
import com.yuzhou.mapper.cust.bxy.LastClientOrderMapper;
import com.yuzhou.service.cust.bxy.LastClientOrderService;

@Service
public class LastClientOrderServiceImp implements LastClientOrderService {
	@Autowired
	private LastClientOrderMapper lastClientOrderMapper;
	
	
	@Override
	public List<LastClientOrders> selectLastOrders(LastClientOrders lastClientOrders) {
		// TODO Auto-generated method stub
		return lastClientOrderMapper.selectLastOrders(lastClientOrders);
	}


	@Override
	public int selectLastClientOrdersCount(LastClientOrders lastClientOrders) {
		// TODO Auto-generated method stub
		return lastClientOrderMapper.selectLastClientOrdersCount(lastClientOrders);
	}


	@Override
	public LastClientOrders selectOrdersByClientCode(LastClientOrders lastClientOrders) {
		// TODO Auto-generated method stub
		return lastClientOrderMapper.selectOrdersByClientCode(lastClientOrders);
	}

}
