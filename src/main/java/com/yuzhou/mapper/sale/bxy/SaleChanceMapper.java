package com.yuzhou.mapper.sale.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.SaleChance;
import com.yuzhou.entity.Sysuser;

@Mapper
public interface SaleChanceMapper {

	// 分页
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);

	public int selectSaleChanceCount(SaleChance saleChance);

	@Select("select * from SaleChance")
	public List<SaleChance> selectSaleChanceAll();

	@Insert("insert into SaleChance values(null,#{chanceSource},#{chanceCustName},#{chanceTitle},#{chanceRate},#{chanceLinkman},#{chanceTel},#{chanceDesc},#{chanceCreateId},#{chanceCreateDate},#{chanceDueId},#{chanceDueDate},#{chanceStatus})")
	public int insertSaleChance(SaleChance saleChance);

	@Update("update SaleChance set chanceSource=#{chanceSource},chanceCustName=#{chanceCustName},chanceTitle=#{chanceTitle},chanceRate=#{chanceRate},chanceLinkman=#{chanceLinkman},chanceTel=#{chanceTel},chanceDesc=#{chanceDesc},chanceCreateId=#{chanceCreateId},chanceCreateDate=#{chanceCreateDate},chanceDueId=#{chanceDueId},chanceDueDate=#{chanceDueDate},chanceStatus=#{chanceStatus} where chanceId=#{chanceId}")
	public int updateSaleChance(SaleChance saleChance);

	@Delete("delete from SaleChance where chanceId=#{chanceId}")
	public int deleteSaleChance(SaleChance saleChance);

	@Select("select * from SaleChance where chanceStatus=#{chanceStatus}")
	public List<SaleChance> selectSaleChanceByChanceStatus(SaleChance saleChance);

	@Select("select * from SaleChance where chanceId=#{chanceId}")
	public SaleChance selectSaleChanceBychanceId(SaleChance saleChance);

	// 创建人编号查询用户名
	@Select("select * from sysUser where userId=#{userId}")
	public Sysuser selectSysUserByuserId(Sysuser sysUser);

	// 用户名查询创建人编号
	@Select("select * from sysUser where userName=#{userName}")
	public Sysuser selectSysUserByuserName(Sysuser sysUser);
	
	// 用户职责ID创建人姓名
	@Select("select * from sysUser where userRoleId=#{userRoleId}")
	public List<Sysuser> selectSysUserByuserRoleId(Sysuser sysUser);
}
