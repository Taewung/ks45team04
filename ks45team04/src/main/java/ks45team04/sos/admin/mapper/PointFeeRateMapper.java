package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointFeeRate;

@Mapper
public interface PointFeeRateMapper {
	
	//포인트 수수료율 내역 조회
	public List<PointFeeRate> pointFeeRateList();
	
	

}
