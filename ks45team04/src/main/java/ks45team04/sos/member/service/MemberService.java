package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.Member;
import ks45team04.sos.member.mapper.MemberMapper;

@Service
public class MemberService {

	public final MemberMapper memberMapper;
	
	public  MemberService(MemberMapper MemberMapper) {
		this.memberMapper = MemberMapper;
	}
	
	
public List<Member> MemberList() {
	List<Member> memberList = memberMapper.MemberList();
	
	return memberList;
}
	
	
	
	/**
	 * 회원 가입
	 * @param member
	 */
public void addMember(Member member) {
	memberMapper.addMember(member);
}

}
