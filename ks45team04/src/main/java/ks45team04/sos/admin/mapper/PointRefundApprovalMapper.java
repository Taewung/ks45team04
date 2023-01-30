package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PointRefundApproval;


@Mapper
public interface PointRefundApprovalMapper {
	
	//포인트 환급 신청 내역 삭제
	public int deletePointRefundApprovalByCode(String pointRefundCode);
	
	//특정 포인트 환급 신청 내역 수정
	public int modifyPointRefundApproval(PointRefundApproval pointRefundApproval);
	
	//특정 포인트 환급 신청 내역 조회
	public PointRefundApproval getPointRefundApprovalByCode(String pointRefundCode);
	
	//포인트 환급 신청 내역 조회(검색)
	public List<PointRefundApproval> pointRefundApprovalList(String searchKey, String searchValue);
	
	
}
