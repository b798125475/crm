package com.yuzhou.mapper.cust.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yuzhou.entity.ClientInfo;
import com.yuzhou.entity.ClientReprieveLose;

@Mapper
public interface ClientReprieveLoseMapper {
	/*@Select("select * from clientReprieveLose where clientCode=#{clientCode}")	
	public List<ClientReprieveLose> selectClientReprieveLoseByCode(ClientReprieveLose clientReprieveLose);
	
	//通过ID查询 （上半部分）
	@Select("select l.ordersDate,cl.clientCode,cl.clientName,sy.userName   from clientinfo cl left join lastclientorders l on  cl.clientCode=l.clientCode left join sysuser sy on  cl.clientCustId=sy.userRoleId where cl.clientCode=#{clientCode}")
	public ClientInfo selectLastOrdersTwo(ClientInfo clientInfo);
	
	//ClientReprieveLose
	@Select("select * from clientReprieveLose where clientCode=#{clientCode}")
	public ClientReprieveLose selectNewOrders(ClientReprieveLose clientReprieveLose);*/
	
	/*@Select("select l.ordersDate,cl.clientCode,cl.clientName,sy.userName  from clientinfo cl left join lastclientorders l on  cl.clientCode=l.clientCode left join sysuser sy on  cl.clientCustId=sy.userRoleId  left join  clientreprievelose cli on cl.clientCode=cli.clientCode where cl.clientCode=#{clientCode}")
	public ClientInfo selectClientReprieveLose(ClientInfo clientInfo);*/

	@Select("select * from ClientReprieveLose where clientCode=#{clientCode}")
	public List<ClientReprieveLose> selectClientReprieveLoseById(ClientReprieveLose clientReprieveLose);
	
	@Insert("insert into clientReprieveLose values(null,#{reprieveStep},#{clientCode})")
	public int insertClientReprieveLose(ClientReprieveLose clientReprieveLose);

}
