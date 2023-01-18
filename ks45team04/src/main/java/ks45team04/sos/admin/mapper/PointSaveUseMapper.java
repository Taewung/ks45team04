package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.dto.PointSaveUse;

@Mapper
public interface PointSaveUseMapper {
	
	// 문제코드 자동생성
	public String getPointSaveUseCode(String pointSaveUse, String pointSaveUseCode);
	
	//포인트 적립 기준 내용 조회
	public List<PointSaveStandard> getPointSaveContent();
	
	//포인트 적립/사용 등록
	public int pointSaveUseAdd(PointSaveUse pointSaveUse);
	
	//포인트 적립/사용 내역 조회
	public List<PointSaveUse> pointSaveUseList(String searchKey, String searchValue);
	
	//포인트 적립 기준 조회
	public List<PointSaveStandard> pointSaveStandardList();
	
}
