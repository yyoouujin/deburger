package com.deburger.app.office.materialOrder.mapper;

import java.util.List;

import com.deburger.app.office.logistic.service.LogisticVO;
import com.deburger.app.office.materialOrder.service.MaterialOrderVO;
import com.deburger.app.office.supplier.service.SupplierVO;

public interface MaterialOrderMapper {
	
	/*
	// 물류 창고 폐기 처리
	public int containerOutInsert(ContainerVO containerVO);

	public int containerInupdate(ContainerVO containerVO);
	*/
	
	
	//물류창고 재료 발주
	public int insertLogisticOrder(MaterialOrderVO materialOrderVO);
	
	//물류창고 재료 발주 상세
	public int insertLogisticOrderDetail(MaterialOrderVO materialOrderVO);
	
	// 업체조회
	public List<SupplierVO> selectSupplierList();
	// 물류창고 조회
	public List<LogisticVO> selectLogisticsList();
	// 업체별 제료 목록
	public List<MaterialOrderVO> selectSupplierListOptions(MaterialOrderVO meteMaterialOrderVO);
	
	// 발주 조회
	public List<MaterialOrderVO> selectMaterialOrder();
	
	// 발주 상세 조회
	public List<MaterialOrderVO> selectMaterialOrderInfo(MaterialOrderVO meteMaterialOrderVO);
	
}

