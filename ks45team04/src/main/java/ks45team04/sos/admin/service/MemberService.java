package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Member;
import ks45team04.sos.admin.mapper.adminMemberMapper;

@Service
public class MemberService {

private final adminMemberMapper memberMapper;

public MemberService(adminMemberMapper memberMapper ) {
	this.memberMapper = memberMapper;
}


/**
 * 전체 회원 목록 조회
 * @return List<Member>
 */
public List<Member> TotalMemberList() {
	
	List<Member> totalMemberList = memberMapper.TotalMemberList();
	
	return totalMemberList;
	
	}
}
