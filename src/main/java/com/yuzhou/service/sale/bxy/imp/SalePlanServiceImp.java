package com.yuzhou.service.sale.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.SalePlan;
import com.yuzhou.mapper.sale.bxy.SalePlanMapper;
import com.yuzhou.service.sale.bxy.SalePlanService;
@Service
public class SalePlanServiceImp implements SalePlanService{
	
	@Autowired
	private SalePlanMapper salePlanMapper;

	@Override
	public List<SalePlan> selectSalePlanAll() {
		// TODO Auto-generated method stub
		return salePlanMapper.selectSalePlanAll();
	}

	@Override
	public int insertSalePlan(SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanMapper.insertSalePlan(salePlan);
	}

	@Override
	public int updateSalePlan(SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanMapper.updateSalePlan(salePlan);
	}

	@Override
	public int deleteSalePlan(SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanMapper.deleteSalePlan(salePlan);
	}

	@Override
	public List<SalePlan> selectSalePlanByplanChcId(SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanMapper.selectSalePlanByplanChcId(salePlan);
	}

	@Override
	public SalePlan selectSalePlanByplanId(SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanMapper.selectSalePlanByplanId(salePlan);
	}

}
