package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointSaveStandard;


@Mapper
public interface PointSaveStandardMapper {
	
	//포인트 적립 기준 내역 조회
	public List<PointSaveStandard> pointSaveStandardList();
	
	//포인트 적립 기준 등록
	public int addPointSaveStandard(PointSaveStandard pointSaveStandard);
}
