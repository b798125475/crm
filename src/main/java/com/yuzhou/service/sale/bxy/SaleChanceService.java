package com.yuzhou.service.sale.bxy;

import java.util.List;

import com.yuzhou.entity.SaleChance;
import com.yuzhou.entity.Sysuser;

public interface SaleChanceService {

	public List<SaleChance> selectSaleChanceAll();

	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);

	public int insertSaleChance(SaleChance saleChance);

	public int selectSaleChanceCount(SaleChance saleChance);

	public int updateSaleChance(SaleChance saleChance);

	public int deleteSaleChance(SaleChance saleChance);

	public List<SaleChance> selectSaleChanceByChanceStatus(SaleChance saleChance);

	public SaleChance selectSaleChanceBychanceId(SaleChance saleChance);

	public Sysuser selectSysUserByuserId(Sysuser sysUser);
	
	public Sysuser selectSysUserByuserName(Sysuser sysUser);
	
	public List<Sysuser> selectSysUserByuserRoleId(Sysuser sysUser);
}
