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


	/**
	 * 포인트 환급 승인 수정 
	 * @param pointRefundApproval
	 * @return modifyPointRefundApproval
	 */
	public int modifyPointRefundApproval(PointRefundApproval pointRefundApproval) {
		
		return pointRefundApprovalMapper.modifyPointRefundApproval(pointRefundApproval);
	}
	
	/**
	 * 특정 포인트 환급 승인 내역 조회
	 * @param pointRefundCode
	 * @return getPointRefundApprovalByCode
	 */
	public PointRefundApproval getPointRefundApprovalInfoByCode(String pointRefundCode) {
		
		return pointRefundApprovalMapper.getPointRefundApprovalByCode(pointRefundCode);
	}

	/**
	 * 포인트 환급 승인 내역 조회(검색)
	 * @param searchKey
	 * @param searchValue
	 * @return pointRefundApprovalList
	 */
	public List<PointRefundApproval> PointRefundApprovalList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "pointRefundId":
				searchKey = "point_refund_id";
				break;
			}
		}
		
		List<PointRefundApproval> pointRefundApprovalList = pointRefundApprovalMapper.pointRefundApprovalList(searchKey, searchValue);
		
		return pointRefundApprovalList;
	}

}
