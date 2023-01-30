package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPointRefund;

@Mapper
public interface MPointRefundMapper {

	//포인트 환급 신청 등록
	public int addPointRefund(MPointRefund mPointRefund);
	
	//포인트 환급 내역 조회
	public List<MPointRefund> mPointRefundList();

}
