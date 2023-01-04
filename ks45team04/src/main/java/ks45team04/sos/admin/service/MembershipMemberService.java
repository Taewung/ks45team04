package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.MembershipMember;
import ks45team04.sos.admin.mapper.AdminMembershipMemberMapper;

@Service("adminMembershipMemberService")
public class MembershipMemberService {

private final AdminMembershipMemberMapper adminMembershipMemberMapper;

public MembershipMemberService(AdminMembershipMemberMapper adminMembershipMember) {
	this.adminMembershipMemberMapper = adminMembershipMember;
}

/**
 * 멤버십 회원 조회
 * @return List<MembershipMember>
 */
public List<MembershipMember> TotalMembershipMemberList() {
	
	List<MembershipMember> totalMemberhipMemberList = adminMembershipMemberMapper.TotalMembershipMemberList();
	
	return totalMemberhipMemberList;
}

}
