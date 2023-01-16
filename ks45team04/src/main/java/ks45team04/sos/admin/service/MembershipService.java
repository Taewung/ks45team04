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
 * 특정 멤버십 수정
 * @param membership
 * @return
 */
public int modifyMembershipInfo(Membership membership) {
	
	return adminMembershipMapper.modifyMembershipInfo(membership);
}

/**
 * 멤버십 상세 조회
 * @param membershipCode
 * @return Membership
 */
public Membership getTotalMembershipInfo(String membershipCode) {
	return adminMembershipMapper.getTotalMembershipInfo(membershipCode);
}

/**
 * 멤버십 조회
 * @return List<Membership>
 */

public List<Membership> MembershipList(String searchKey, String searchValue) {
	
	if(searchKey != null) {
		switch(searchKey) {
		case "membershipCode":
			searchKey = "membership_code";
			break;
		}
		switch(searchKey) {
		case "membershipPeriod":
			searchKey = "membership_period";
			break;
		}
	}	
		
	
	
	List<Membership> membershipList = adminMembershipMapper.MembershipList(searchKey, searchValue);

			return membershipList;
}




}
