package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPointFeeRate;

@Mapper
public interface MPointFeeRateMapper {

	//포인트 수수료율 내역 조회
	public List<MPointFeeRate> mPointFeeRateList();

	
}
