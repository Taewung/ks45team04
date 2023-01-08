package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MRefund;

@Mapper
public interface MRefundMapper {

	//환불 내역 조회
	public List<MRefund> mRefundList();
}
