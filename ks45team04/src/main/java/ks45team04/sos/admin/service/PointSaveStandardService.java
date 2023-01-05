package ks45team04.sos.admin.service;


import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.mapper.PointSaveStandardMapper;


@Service
public class PointSaveStandardService {

	private final PointSaveStandardMapper pointSaveStandardMapper;
	
	public PointSaveStandardService(PointSaveStandardMapper pointSaveStandardMapper) {
		this.pointSaveStandardMapper = pointSaveStandardMapper;
	}
	

	// 포인트 적립 기준 수정
	public int modifyPointSaveStandard(PointSaveStandard pointSaveStandard) {
		return pointSaveStandardMapper.modifyPointSaveStandard(pointSaveStandard);
	}
	
	//특정 포인트 적립 기준 조회
	public PointSaveStandard getPointSaveStandardInfoByCode(String pointSaveStandardCode) {
		
		return pointSaveStandardMapper.getPointSaveStandardByCode(pointSaveStandardCode);
	}
	
	// 포인트 적립 기준 등록
	public int addPointSaveStandard(PointSaveStandard pointSaveStandard) {
		
		return pointSaveStandardMapper.addPointSaveStandard(pointSaveStandard);
	}

	//포인트 적립 기준 내역 조회
	public List<PointSaveStandard> PointSaveStandardList(){
		
		List<PointSaveStandard> pointSaveStandardList = pointSaveStandardMapper.pointSaveStandardList();
		
		return pointSaveStandardList;
	}

	
}
