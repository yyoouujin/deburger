package com.deburger.app.shop.StoreProSale.service;

import java.util.List;

public interface StoreProSaleService {

	//목록 표시
	public List<StoreProSaleVO> StoreProSaleList();
	
	//제품 조회
	public List<StoreProSaleVO> StoreProSaleoneList(String productNumber);
}
