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
 * 특정 멤버십 회원 수정
 * @param membershipMember
 * @return
 */
public int modifyMembershipMemberInfo(MembershipMember membershipMember) {
	return adminMembershipMemberMapper.modifyMembershipMemberInfo(membershipMember);
}

/**멤버십 회원 상세 조회
 * 
 * @param mmCode
 * @return MembershipMember
 */
public MembershipMember getTotalMembershipInfo(String mmId) {
	return adminMembershipMemberMapper.getTotalMembershipMemberInfo(mmId);
}



/**
 * 멤버십 회원 조회
 * @return List<MembershipMember>
 */
public List<MembershipMember> TotalMembershipMemberList(String searchKey, String searchValue) {
	
	if(searchKey != null) {
		switch(searchKey) {
		case "mmCode":
			searchKey = "mm_code";
			break;
		}
		switch(searchKey) {
		case "mmPeriod":
			searchKey = "mm_period";
			break;
		}
		switch(searchKey) {
		case "mmState":
			searchKey = "mm_state";
			break;
		}		
		
	}	
	
	List<MembershipMember> totalMemberhipMemberList = adminMembershipMemberMapper.TotalMembershipMemberList(searchKey, searchValue);
	
	return totalMemberhipMemberList;
}

}
