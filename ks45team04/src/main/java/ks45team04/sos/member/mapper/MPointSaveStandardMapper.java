package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPointSaveStandard;

@Mapper
public interface MPointSaveStandardMapper {

	//포인트 적립 기준 내역 조회
	public List<MPointSaveStandard> mPointSaveStandardList();

	
}
