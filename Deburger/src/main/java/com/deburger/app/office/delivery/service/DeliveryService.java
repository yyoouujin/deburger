package com.deburger.app.office.delivery.service;

import java.util.List;
import java.util.Map;

public interface DeliveryService {
	
	//가맹점 발주 전체조회
	public List<DeliveryVO> deliveryList();
	
	//가맹점 발주 상세조회
	public List<DeliveryVO> deliveryInfo(DeliveryVO deliveryVO);
	
	//주문번호의 담당 물류창고 전체재고
	public int logisticAllStock(DeliveryVO deliveryVO);
	
	//발주 전체수량
	public int orderAllStock(DeliveryVO deliveryVO);
	
	//창고선택
	public List<DeliveryVO> logisticsStockInfo(DeliveryVO deliveryVO);
	
	//발주상태 수정
	public Map<String, Object> updateOderapp(DeliveryVO deliveryVO);
	
}
