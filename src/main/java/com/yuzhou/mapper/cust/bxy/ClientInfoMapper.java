package com.yuzhou.mapper.cust.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.DataArea;
import com.yuzhou.entity.DataClientLevel;
import com.yuzhou.entity.Sysuser;

@Mapper
public interface ClientInfoMapper {
	// 查询客户名单的方法
	public List<ClientInfo> selectClient();

	// 总行数
	public int selectClientCount(ClientInfo clientInfo);

	//  返回客户列表（模糊查询分页）
	public List<ClientInfo> selectClientPaging(ClientInfo clientInfo);

	// 更新客户信息的方法
	@Update("update clientinfo set clientName=#{clientName},clientAreaId=#{clientAreaId},clientLevelId=#{clientLevelId},clientContentment=#{clientContentment},clientCredit=#{clientCredit},clientCorporation=#{clientCorporation},clientBank=#{clientBank},clientAccounts=#{clientAccounts},clientAddress=#{clientAddress},clientTel=#{clientTel},clientFax=#{clientFax},clientDakCode=#{clientDakCode},clientNet=#{clientNet},clientCharter=#{clientCharter},clientBankroll=#{clientBankroll},clientTurnoverYear=#{clientTurnoverYear},clientCountryTax=#{clientCountryTax},clientNativeTax=#{clientNativeTax}  where clientCode=#{clientCode}")
	public int updateClientById(ClientInfo clientInfo);
	
	//删除客户的方法
	@Delete("delete from clientinfo where clientCode=#{clientCode}")
	public int deleteClientById(ClientInfo clientInfo);
	
	//查寻客户经理
	@Select("SELECT * from sysuser")
	public List<Sysuser> selectSysuser();
	
	//查询全部地区
	@Select("select * from dataarea")
	public List<DataArea> selectDataArea();
	
	//查询全部客户等级
	@Select("select * from dataclientlevel")
	public List<DataClientLevel> selectDataClientLevel();
	
	//通過ID查詢客戶
	@Select("SELECT * from clientinfo where clientCode=#{clientCode}")
	public ClientInfo selectClientInfoById(ClientInfo clientInfo);
	
	//通过ID查询客户经理
	@Select("SELECT * from sysuser where userId=#{userId}")
	public Sysuser selectSysuserById(Sysuser sysUser);
	
	
	//更新客户状态为流失状态
	@Update("update clientinfo set clientState=#{clientState}, clientLoseReason=#{clientLoseReason} where clientCode=#{clientCode}")
	public int updateClientStateById(ClientInfo clientInfo);
}
