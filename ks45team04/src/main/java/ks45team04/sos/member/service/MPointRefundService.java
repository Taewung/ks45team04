package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MPointRefund;
import ks45team04.sos.member.mapper.MPointRefundMapper;

@Service
public class MPointRefundService {

	private final MPointRefundMapper mPointRefundMapper;
	
	public MPointRefundService(MPointRefundMapper mPointRefundMapper) {
		this.mPointRefundMapper = mPointRefundMapper;
	}
	
	/**
	 * 포인트 환급 신청 등록
	 * @param mPointRefund
	 * @return mPointRefund
	 */
	public int addPointRefund(MPointRefund mPointRefund) {
		
		return mPointRefundMapper.addPointRefund(mPointRefund);
	}
	/**
	 * 포인트 환급 내역 조회
	 * @return mPointRefundList
	 */
	public List<MPointRefund> MPointRefundList(){
		
		List<MPointRefund> mPointRefundList = mPointRefundMapper.mPointRefundList();
		
		return mPointRefundList;
	}
}
