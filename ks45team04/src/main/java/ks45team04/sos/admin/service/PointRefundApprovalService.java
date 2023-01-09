package ks45team04.sos.admin.service;


import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointRefundApproval;
import ks45team04.sos.admin.mapper.PointRefundApprovalMapper;



@Service
public class PointRefundApprovalService {

	private final PointRefundApprovalMapper pointRefundApprovalMapper;
	
	
	public PointRefundApprovalService(PointRefundApprovalMapper pointRefundApprovalMapper) {
		this.pointRefundApprovalMapper = pointRefundApprovalMapper;
	}

	//특정 포인트 환급 승인 내역 수정
	public int modifyPointRefundApproval(PointRefundApproval pointRefundApproval) {
		
		return pointRefundApprovalMapper.modifyPointRefundApproval(pointRefundApproval);
	}
	
	//특정 포인트 환급 승인 내역 조회
	public PointRefundApproval getPointRefundApprovalInfoByCode(String pointRefundCode) {
		
		return pointRefundApprovalMapper.getPointRefundApprovalByCode(pointRefundCode);
	}
	//포인트 환급 승인 내역 조회
	public List<PointRefundApproval> PointRefundApprovalList(){
		
		List<PointRefundApproval> pointRefundApprovalList = pointRefundApprovalMapper.pointRefundApprovalList();
		
		return pointRefundApprovalList;
	}

}
