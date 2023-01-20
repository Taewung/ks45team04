package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team04.sos.admin.dto.Member;
import ks45team04.sos.admin.mapper.AdminMemberMapper;

@Service("adminMemberService")
@Transactional
public class MemberService {

private final AdminMemberMapper adminMemberMapper;

public MemberService(AdminMemberMapper adminMemberMapper ) {
	this.adminMemberMapper = adminMemberMapper;
}




/**
 * 특정 회원 수정
 * @param member
 * @return
 */


public int modifyMemberInfo(Member member) {
	
	return adminMemberMapper.modifyMemberInfo(member);
}


/** 
 * 특정 회원 상세 조회
 * @param memId
 * @return Member
 */


public Member getTotalMemberInfo(String memId){

	return adminMemberMapper.getTotalMemberInfo(memId);
}



/**
 * 전체 회원 목록 조회
 * @return List<Member>
 */
public List<Member> TotalMemberList(String searchKey, String searchValue) {
	
	if(searchKey != null) {
		switch(searchKey) {
		case "memId":
			searchKey = "mem_id";
			break;
		}
		switch(searchKey) {
		case "memName":
			searchKey = "mem_name";
			break;
		}
		switch(searchKey) {
		case "memEmail":
			searchKey = "mem_email";
			break;
		}
	}	
	List<Member> totalMemberList = adminMemberMapper.TotalMemberList(searchKey, searchValue);
	
	return totalMemberList;
	
	}
}
