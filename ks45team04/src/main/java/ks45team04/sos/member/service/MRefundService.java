package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPay;
import ks45team04.sos.member.dto.MRefund;
import ks45team04.sos.member.mapper.MPayMapper;
import ks45team04.sos.member.mapper.MRefundMapper;

@Service
public class MRefundService {
	
	private final MRefundMapper mRefundMapper;
	private final MPayMapper mPayMapper;
	
	public MRefundService(MRefundMapper mRefundMapper,
						  MPayMapper mPayMapper) {
		
		this.mRefundMapper = mRefundMapper;
		this.mPayMapper = mPayMapper;
	}
	/**
	 * 환불 신청 코드 자동 생성
	 * 
	 * @param refundInfo
	 * @param refundCode
	 * @return newRefundCode
	 */
	public String getMRefundCode(String refundInfo, String refundCode) {
		String newRefundCode = mRefundMapper.getMRefundCode(refundInfo, refundCode);
		return newRefundCode;
	}
	
	/**
	 * 회원 환불 신청 등록
	 * @param mRefund
	 * @return refundRequest
	 */
	public int refundRequest(MRefund mRefund) {
		
		return mRefundMapper.refundRequest(mRefund);
	}

	/**
	 * 특정 결제 내역 조회 
	 * @param payCompleteCode
	 * @return getMPayByCode
	 */
	public MPay getMPayInfoByCode(String payCompleteCode) {
		
		return mPayMapper.getMPayByCode(payCompleteCode);
	}
	
	/**
	 * 회원 환불 승인 내역 조회 
	 * @return mRefundList
	 */
	public List<MRefund> MRefundList(){
	
		List<MRefund> mRefundList = mRefundMapper.mRefundList();
		
		return mRefundList;
	}
}
