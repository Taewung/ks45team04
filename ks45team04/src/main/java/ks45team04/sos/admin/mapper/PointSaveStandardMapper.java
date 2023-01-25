package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointSaveStandard;


@Mapper
public interface PointSaveStandardMapper {

	// 포인트 적립 기준 등록 코드 자동생성
	public String getPointSaveStandardCode(String pointSaveStandard, String pointSaveStandardCode);
	
	//포인트 적립 기준 삭제
	public int deletePointSaveSatandardByCode(String pointSaveStandardCode);
	
	//포인트 적립 기준 수정
	public int modifyPointSaveStandard(PointSaveStandard pointSaveStandard);
	
	//특정 포인트 적립 기준 조회
	public PointSaveStandard getPointSaveStandardByCode(String pointSaveStandardCode);
	
	//관리자 아이디 인증
	public boolean getPointSaveStandardIdCheck(String inputId);
	
	//포인트 적립 기준 등록
	public int addPointSaveStandard(PointSaveStandard pointSaveStandard);
		
	//포인트 적립 기준 내역 조회(검색)
	public List<PointSaveStandard> pointSaveStandardList(String searchKey, String searchValue);
	
	//포인트 적립 기준 내용 조회
	public List<PointSaveStandard> getPointSaveStandardContent();
	
}
