package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.WithdrawalMember;
import ks45team04.sos.admin.mapper.WithdrawalMemberMapper;

@Service
public class WithdrawalMemberService {

	private final WithdrawalMemberMapper withdrawalMemberMapper;

	public WithdrawalMemberService(WithdrawalMemberMapper withdrawalMemberMapper) {
			this.withdrawalMemberMapper = withdrawalMemberMapper;
	}

	/** 특정 탈퇴 회원 정보 조회
	 * 
	 * @param wdmId
	 * @return WithdrawalMember
	 */
	public WithdrawalMember getWithdrawalInfoByCode(String wdmId) {

		return withdrawalMemberMapper.getWithdrawalInfoByCode(wdmId);
	}
	
	/**
	 * 탈퇴 회원 정보 조회
	 * @return List<WithdrawalMember>
	 */
	public List<WithdrawalMember> WithdrawalMemberList() {
			List<WithdrawalMember> withdrawalMemberList = withdrawalMemberMapper.WithdrawalMemberList();
			
			return withdrawalMemberList;
	}
}