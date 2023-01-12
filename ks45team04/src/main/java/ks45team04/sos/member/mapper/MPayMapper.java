package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPay;

@Mapper
public interface MPayMapper {
	
	//회원 결제 내역 상세보기
	public MPay getMPayByCode(String payCompleteCode);
	
	//회원 결제 내역 조회
	public List<MPay> mPayList();
	
}
