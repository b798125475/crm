package com.yuzhou.mapper.cust.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.ClientInfo;

@Mapper
public interface ClientInfoMapper {
	// 查询客户名单的方法
	public List<ClientInfo> selectClient();

	// 总行数
	public int selectClientCount(ClientInfo clientInfo);

	//  返回客户列表（模糊查询分页）
	public List<ClientInfo> selectClientPaging(ClientInfo clientInfo);

	// 更新客户信息的方法
	@Update("update clientinfo set clientName=#{clientName},clientAreaId=#{clientAreaId},clientLevelId=#{clientLevelId},clientContentment=#{clientContentment},clientCredit=#{clientCredit},clientCorporation=#{clientCorporation},clientBank=#{clientBank},clientAccounts=#{clientAccounts},clientAddress=#{clientAddress},clientTel=#{clientTel},clientFax=#{clientFax},clientDakCode=#{clientDakCode},clientNet=#{clientNet},clientCharter=#{clientCharter},clientBankroll=#{clientBankroll},clientTurnoverYear=#{clientTurnoverYear},clientCountryTax=#{clientCountryTax},clientNativeTax=#{clientNativeTax}  where newsId=#{newsId}")
	public int updateClientById(ClientInfo clientInfo);
	
	//删除客户的方法
	@Delete("delete from clientinfo where clientCode=#{clientCode}")
	public int deleteClientById(ClientInfo clientInfo);
}
