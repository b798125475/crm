package com.yuzhou.mapper.server.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.SaleChance;

@Mapper
public interface SaleChanceMapper {
	
	//分页
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
}
