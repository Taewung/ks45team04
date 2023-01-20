package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.WithdrawalMember;

@Mapper
public interface WithdrawalMemberMapper {

	//탈퇴회원 조회
	public List<WithdrawalMember> WithdrawalMemberList(String searchKey, String searchValue);


	//특정 탈퇴회원 조회
	public WithdrawalMember getWithdrawalInfoByCode(String wdmId);
	
}