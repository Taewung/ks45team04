package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team04.sos.admin.dto.PassMember;
import ks45team04.sos.admin.mapper.AdminPassMemberMapper;

@Service("adminPassMemberService")
@Transactional
public class PassMemberService {

private final AdminPassMemberMapper adminPassMemberMapper;

public PassMemberService(AdminPassMemberMapper adminPassMemberMapper) {
	this.adminPassMemberMapper = adminPassMemberMapper;
}


/**
 * 특정 합격 회원 수정
 * @param passMember
 * @return
 */
public int modifyPassMemberInfo(PassMember passMember) {
	
	return adminPassMemberMapper.modifyPassMemberInfo(passMember);
}

/**
 *  특정 회원 상세 조회
 * @param pmId
 * @return
 */
public PassMember getTotalPassMemberInfo(String pmId) {
	
	return adminPassMemberMapper.getTotalPassMemberInfo(pmId);
}



/**
 * 합격 회원 조회
 * @return List<PassMember>
 */
public List<PassMember> PassMemberList(String searchKey, String searchValue) {
	
	if(searchKey != null) {
		switch(searchKey) {
		case "pmId":
			searchKey = "pm_id";
			break;
		}
		switch(searchKey) {
		case "pmState":
			searchKey = "pm_state";
			break;
		}
		switch(searchKey) {
		case "pmReportManager":
			searchKey = "pm_report_manager";
			break;
		}
		switch(searchKey) {
		case "pmLiCode":
			searchKey = "pm_li_code";
			break;
		}		
	}	
	
	List<PassMember> passMemberList = adminPassMemberMapper.PassMemberList(searchKey, searchValue);
	
	return passMemberList;
}

}
