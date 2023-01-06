package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MRefund;
import ks45team04.sos.member.mapper.MRefundMapper;

@Service
public class MRefundService {
	
	private final MRefundMapper mRefundMapper;
	
	public MRefundService(MRefundMapper mRefundMapper) {
		this.mRefundMapper = mRefundMapper;
	}

	
	public List<MRefund> MRefundList(){
	
		List<MRefund> mRefundList = mRefundMapper.mRefundList();
		
		return mRefundList;
	}
}