package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointSaveStandard;


@Mapper
public interface PointSaveStandardMapper {
	
	
	//포인트 적립 기준 코드 중복 조회
	public boolean checkPointSaveStandardCode(String pointSaveStandardCode);
	
	//포인트 적립 기준 등록
	public int addPointSaveStandard(PointSaveStandard pointSaveStandard);
		
	//포인트 적립 기준 내역 조회
	public List<PointSaveStandard> pointSaveStandardList();
	
	
}
