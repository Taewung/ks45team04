package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPay;
import ks45team04.sos.member.dto.MRefund;

@Mapper
public interface MRefundMapper {
	
	//환불 신청 내역 코드 자동생성
	public String getMRefundCode(String pointRefund, String pointRefundCode);
	
	//환불 신청 등록
	public int refundRequest(MRefund mRefund);
	
	//특정 결제 내역 조회
	public MPay getMPayByCode(String payCompleteCode);
	
	//환불 내역 조회
	public List<MRefund> mRefundList();
}
