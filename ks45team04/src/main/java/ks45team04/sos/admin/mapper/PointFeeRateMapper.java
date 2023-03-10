package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointFeeRate;

@Mapper
public interface PointFeeRateMapper {
	
	// 포인트 수수료율 등록 코드 자동생성
	public String getPointFeeRateCode(String pointFeeRate, String pointFeeRateCode);
	
	// 포인트 수수료율 삭제
	public int deletePointFeeRateByCode(String pointFeeRateCode);
	
	// 포인트 수수료율 수정
	public int modifyPointFeeRate(PointFeeRate pointFeeRate);
	
	// 특정 포인트 수수료율 조회
	public PointFeeRate getPointFeeRateByCode(String pointFeeRateCode);
	
	// 관리자 아이디 인증
	public boolean getPointFeeRateIdCheck(String inputId);
	
	// 포인트 수수료율 등록
	public int addPointFeeRate(PointFeeRate pointFeeRate);
	
	// 포인트 수수료율 내역 조회(검색)
	public List<PointFeeRate> pointFeeRateList(String searchKey, String searchValue);
	
}
