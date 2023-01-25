package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Refund;

@Mapper
public interface RefundMapper {

	//특정 환불 신청 내역 수정
	public int modifyRefundApproval(Refund refund);
	
	//특정 환불 신청 내역 조회
	public Refund getRefundByCode(String refundCode);
	
	//환불 신청 내역 조회(검색)
	public List<Refund> refundList(String searchKey, String searchValue);
}
