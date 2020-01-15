package com.yuzhou.service.sale.bxy;

import java.util.List;


import com.yuzhou.entity.SalePlan;

public interface SalePlanService {

	public List<SalePlan> selectSalePlanAll();

	public int insertSalePlan(SalePlan salePlan);

	public int updateSalePlan(SalePlan salePlan);

	public int deleteSalePlan(SalePlan salePlan);
	
	public List<SalePlan> selectSalePlanByplanChcId(SalePlan salePlan);
	
	public SalePlan selectSalePlanByplanId(SalePlan salePlan);

}
