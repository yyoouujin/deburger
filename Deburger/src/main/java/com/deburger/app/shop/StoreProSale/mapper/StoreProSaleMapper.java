package com.deburger.app.shop.StoreProSale.mapper;

import java.util.List;

import com.deburger.app.shop.StoreProSale.service.StoreProSaleVO;

public interface StoreProSaleMapper {

	//목록 표시
	public List<StoreProSaleVO> StoreProSaleList(StoreProSaleVO storeProSaleVO);
	
	//제품 조회
	public List<StoreProSaleVO> StoreProSaleoneList(StoreProSaleVO storeProSaleVO);
}
