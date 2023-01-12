package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.dto.PointSaveUse;

@Mapper
public interface PointSaveUseMapper {
	
	//포인트 적립/사용 등록
	public int pointSaveUseAdd(PointSaveUse pointSaveUse);
	
	//포인트 적립/사용 내역 조회
	public List<PointSaveUse> pointSaveUseList(String searchKey, String searchValue);
	
	//포인트 적립 기준 조회
	public List<PointSaveStandard> pointSaveStandardList();
	
}
