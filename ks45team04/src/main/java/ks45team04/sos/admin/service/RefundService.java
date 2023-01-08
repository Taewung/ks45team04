package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Refund;
import ks45team04.sos.admin.mapper.RefundMapper;

@Service
public class RefundService {

	private final RefundMapper refundMapper;
	
	public RefundService(RefundMapper refundMapper) {
		this.refundMapper = refundMapper;
	}

	//환불 승인 내역 수정
	public int modifyRefundApproval(Refund refund) {
		
		return refundMapper.modifyRefundApproval(refund);
	}
	
	//특정 환불 승인 내역 조회
	public Refund getRefundInfoByCode(String refundCode) {
		
		return refundMapper.getRefundByCode(refundCode);
	}
	
	//환불 승인 내역 조회
	public List<Refund> RefundList(){
		
		List<Refund> refundList = refundMapper.refundList();
		
		return refundList;
	}
}

