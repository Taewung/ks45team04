package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Membership;
import ks45team04.sos.admin.mapper.AdminMembershipMapper;

@Service("adminMembershipService")
public class MembershipService {

private final AdminMembershipMapper adminMembershipMapper;

public MembershipService(AdminMembershipMapper adminMembershipMapper) {
	this.adminMembershipMapper = adminMembershipMapper;
	
	}

/**
 * 멤버십 조회
 * @return List<Membership>
 */

public List<Membership> MembershipList() {
	List<Membership> membershipList = adminMembershipMapper.MembershipList();

			return membershipList;
}




}
