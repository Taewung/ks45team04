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

/** 회원 상세 조회
 * 
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
public List<Member> TotalMemberList() {
	
	List<Member> totalMemberList = adminMemberMapper.TotalMemberList();
	
	return totalMemberList;
	
	}
}
