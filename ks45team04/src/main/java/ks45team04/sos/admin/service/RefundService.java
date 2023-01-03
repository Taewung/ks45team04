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

	//환불 내역 조회
	public List<Refund> RefundList(){
		
		List<Refund> refundList = refundMapper.refundList();
		return refundList;
	}
}

