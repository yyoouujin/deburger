package com.deburger.app.office.material.mapper;

import java.util.List;

import com.deburger.app.office.material.service.MaterialVO;

public interface MaterialMapper {

	// 전체 조회
	public List<MaterialVO> selectAllList();

	// 단건 조회
	public MaterialVO selectMaterial(MaterialVO materialVO);

	// 등록
	public int insertMaterialInfo();

	// 수정
	public int updateMaterialInfo();

	// 삭제
	public int deleteMaterialInfo(int materialNumber);
}
