package com.yuzhou.mapper.sale.bxy;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yuzhou.entity.SalePlan;

@Mapper
public interface SalePlanMapper {

	@Select("select * from SalePlan")
	public List<SalePlan> selectSalePlanAll();
	
	@Insert("insert into SalePlan values(null,#{planChcId},#{planTodo},#{planResult})")
	public int insertSalePlan(SalePlan salePlan);
	
	@Update("update SalePlan set planChcId=#{planChcId},planTodo=#{planTodo},planResult=#{planResult} where planId=#{planId}")
	public int updateSalePlan(SalePlan salePlan);
	
	@Delete("delete from SalePlan where planId=#{planId}")
	public int deleteSalePlan(SalePlan salePlan);
	
	@Select("select * from SalePlan where planChcId=#{planChcId}")
	public List<SalePlan> selectSalePlanByplanChcId(SalePlan salePlan);
	
	@Select("select * from SalePlan where planId=#{planId}")
	public SalePlan selectSalePlanByplanId(SalePlan salePlan);
}
