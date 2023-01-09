package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPointSaveUse;

@Mapper
public interface MPointSaveUseMapper {

	//포인트 적립/사용 내역 조회
	public List<MPointSaveUse> mPointSaveUseList();
}
