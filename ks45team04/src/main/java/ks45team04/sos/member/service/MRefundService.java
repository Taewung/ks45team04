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
	
	//회원 환불 신청 등록(수정)
	public int refundRequest(MRefund mRefund) {
		
		return mRefundMapper.refundRequest(mRefund);
	}
	
	//특정 결제내역 조회
	public MPay getMPayInfoByCode(String payCompleteCode) {
		
		return mPayMapper.getMPayByCode(payCompleteCode);
	}
	
	//회원 환불 승인 내역 조회
	public List<MRefund> MRefundList(){
	
		List<MRefund> mRefundList = mRefundMapper.mRefundList();
		
		return mRefundList;
	}
}
