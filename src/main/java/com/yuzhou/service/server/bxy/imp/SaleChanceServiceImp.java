package com.yuzhou.service.server.bxy.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.SaleChance;
import com.yuzhou.mapper.server.bxy.SaleChanceMapper;
import com.yuzhou.service.server.bxy.SaleChanceService;

@Service
public class SaleChanceServiceImp implements SaleChanceService {

	@Autowired
	private SaleChanceMapper saleChanceMapper;

	@Override
	public List<SaleChance> selectSaleChanceAll() {
		return saleChanceMapper.selectSaleChanceAll();
	}

	@Override
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChancePaging(saleChance);
	}

	@Override
	public int insertSaleChance(SaleChance saleChance) {
		return saleChanceMapper.insertSaleChance(saleChance);
	}

	@Override
	public int selectSaleChanceCount(SaleChance saleChance) {
		// TODO Auto-generated method stub
		return saleChanceMapper.selectSaleChanceCount(saleChance);
	}

	@Override
	public int updateSaleChance(SaleChance saleChance) {
		// TODO Auto-generated method stub
		return saleChanceMapper.updateSaleChance(saleChance);
	}

	@Override
	public int deleteSaleChance(SaleChance saleChance) {
		// TODO Auto-generated method stub
		return saleChanceMapper.deleteSaleChance(saleChance);
	}

	@Override
	public List<SaleChance> selectSaleChanceByChanceStatus(SaleChance saleChance) {
		// TODO Auto-generated method stub
		return saleChanceMapper.selectSaleChanceByChanceStatus(saleChance);
	}

}
