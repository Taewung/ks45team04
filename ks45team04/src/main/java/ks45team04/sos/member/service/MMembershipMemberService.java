package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MMembershipMember;
import ks45team04.sos.member.mapper.MMembershipMemberMapper;

@Service("MembershipMemberService")
public class MMembershipMemberService {

	private final MMembershipMemberMapper mmembershipMemberMapper;

	public MMembershipMemberService(MMembershipMemberMapper MMembershipMember) {
		this.mmembershipMemberMapper = MMembershipMember;
	}	
	
	
	/**
	 * 멤버십 회원 조회
	 * @return List<MMembershipMember>
	 */
	public List<MMembershipMember> MembershipMemberList() {

		List<MMembershipMember> mmembershipMemberList = mmembershipMemberMapper.MembershipMemberList();
		
		return mmembershipMemberList;
	}
	
	
}
