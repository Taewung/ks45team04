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

	/**
	 * 환불 신청 내역 삭제
	 * @param refundCode
	 * @return refundCode
	 */
	public void deleteRefundByCode(String refundCode) {
		
		refundMapper.deleteRefundByCode(refundCode);
	}
	
	/**
	 * 승인 내역 수정
	 * @param refund
	 * @return modifyRefundApproval
	 */
	public int modifyRefundApproval(Refund refund) {
		
		return refundMapper.modifyRefundApproval(refund);
	}
	
	/**
	 * 특정 환불 승인 내역 조회
	 * @param refundCode
	 * @return getRefundByCode
	 */
	public Refund getRefundInfoByCode(String refundCode) {
		
		return refundMapper.getRefundByCode(refundCode);
	}
	
	/**
	 * 환불 승인 내역 조회(검색)
	 * @param searchKey
	 * @param searchValue
	 * @return refundList
	 */
	public List<Refund> RefundList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "payId":
				searchKey = "pay_id";
				break;
			}
		}
		
		List<Refund> refundList = refundMapper.refundList(searchKey, searchValue);
		
		return refundList;
	}
}

