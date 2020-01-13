package com.yuzhou.service.sale.bxy;

import java.util.List;

import com.yuzhou.entity.SaleChance;

public interface SaleChanceService {

	public List<SaleChance> selectSaleChanceAll();

	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);

	public int insertSaleChance(SaleChance saleChance);

	public int selectSaleChanceCount(SaleChance saleChance);

	public int updateSaleChance(SaleChance saleChance);

	public int deleteSaleChance(SaleChance saleChance);
	
	public List<SaleChance> selectSaleChanceByChanceStatus(SaleChance saleChance);
}
