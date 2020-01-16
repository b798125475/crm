package com.yuzhou.mapper.cust.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.LastClientOrders;
@Mapper
public interface LastClientOrderMapper {
	
	public List<LastClientOrders> selectLastOrders(LastClientOrders lastClientOrders);
	
	//查询总行数
	public int selectLastClientOrdersCount(LastClientOrders lastClientOrders);
	//通过ID查询客户最新订单
	@Select("select * from LastClientOrders where clientCode=#{clientCode}")
	public LastClientOrders selectOrdersByClientCode(LastClientOrders lastClientOrders);
}
