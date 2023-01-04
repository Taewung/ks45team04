package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Refund;

@Mapper
public interface RefundMapper {

	//환불 내역 조회
	public List<Refund> refundList();
}
