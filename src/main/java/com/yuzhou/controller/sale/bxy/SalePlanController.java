package com.yuzhou.controller.sale.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.SalePlan;
import com.yuzhou.service.sale.bxy.SalePlanService;
@RestController
public class SalePlanController {

	@Autowired
	private SalePlanService salePlanService;

	@RequestMapping("/selectSalePlanAll")
	public List<SalePlan> selectSalePlanAll() {
		return salePlanService.selectSalePlanAll();
	}
	@RequestMapping("/insertSalePlan")
	public int insertSalePlan(@RequestBody SalePlan salePlan) {
		return salePlanService.insertSalePlan(salePlan);
	}
	@RequestMapping("/updateSalePlan")
	public int updateSalePlan(@RequestBody SalePlan salePlan) {
		return salePlanService.updateSalePlan(salePlan);
	}
	@RequestMapping("/deleteSalePlan")
	public int deleteSalePlan(@RequestBody SalePlan salePlan) {
		return salePlanService.deleteSalePlan(salePlan);
	}
	@RequestMapping("/selectSalePlanByplanChcId")
	public List<SalePlan> selectSalePlanByplanChcId(@RequestBody SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanService.selectSalePlanByplanChcId(salePlan);
	}
	@RequestMapping("/selectSalePlanByplanId")
	public SalePlan selectSalePlanByplanId(@RequestBody SalePlan salePlan) {
		// TODO Auto-generated method stub
		return salePlanService.selectSalePlanByplanId(salePlan);
	}

}
