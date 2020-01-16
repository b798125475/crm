package com.yuzhou.mapper.cust.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestBody;

import com.yuzhou.entity.ClientLinkman;

@Mapper
public interface ClientLinkmanMapper {
	// 通过ID查询客户联系人
	@Select("SELECT * from clientlinkman where clientCode=#{clientCode} ")
	public List<ClientLinkman> selectClientlinkmanById(ClientLinkman clientLinkman);

	// 新建客户联系人
	@Insert("insert into clientLinkman values(null,#{clientLinkmanName},#{clientLinkmanSex},#{clientLinkmanJob},#{clientLinkmanTel},#{clientLinkmanMobile},#{remark},#{clientCode})")
	public int insertClientLinkman(ClientLinkman clientLinkman);

	// 更新客户联系人
	@Update("update clientLinkman set clientLinkmanName=#{clientLinkmanName},clientLinkmanSex=#{clientLinkmanSex},clientLinkmanJob=#{clientLinkmanJob},clientLinkmanTel=#{clientLinkmanTel},clientLinkmanMobile=#{clientLinkmanMobile},remark=#{remark}  where clientLinkmanId=#{clientLinkmanId}")
	public int updateClientLinkman(ClientLinkman clientLinkman);
	
	//删除客户联系人
	@Delete("delete from clientLinkman where clientLinkmanId=#{clientLinkmanId}")
	public int deleteClientLinkman(ClientLinkman clientLinkman);
	
	//通过ID查询客户联系人
	@Select("select * from clientLinkman where clientLinkmanId=#{clientLinkmanId}")
	public ClientLinkman selectclientLinkmanById(ClientLinkman clientLinkman);
}
