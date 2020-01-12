package com.yuzhou.controller.server.bxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuzhou.entity.SaleChance;
import com.yuzhou.service.server.bxy.SaleChanceService;

@RestController
public class SaleChanceController {

	@Autowired
	private SaleChanceService saleChanceService;

	@RequestMapping("/selectSaleChanceAll")
	public List<SaleChance> selectSaleChanceAll() {
		return saleChanceService.selectSaleChanceAll();
	}

	@RequestMapping("/selectSaleChancePaging")
	public List<SaleChance> selectSaleChancePaging(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChancePaging(saleChance);
	}

	@RequestMapping("/insertSaleChance")
	public int insertSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.insertSaleChance(saleChance);
	}

	@RequestMapping("/selectSaleChanceCount")
	public int selectSaleChanceCount(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceCount(saleChance);
	}

	@RequestMapping("/updateSaleChance")
	public int updateSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.updateSaleChance(saleChance);
	}

	@RequestMapping("/deleteSaleChance")
	public int deleteSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.deleteSaleChance(saleChance);
	}
}
