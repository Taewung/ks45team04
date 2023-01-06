package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.MMember;
import ks45team04.sos.member.mapper.MMemberMapper;

@Service
public class MMemberService {

	public final MMemberMapper memberMapper;
	
	public  MMemberService(MMemberMapper MemberMapper) {
		this.memberMapper = MemberMapper;
	}
	
	
public List<MMember> MemberList() {
	List<MMember> memberList = memberMapper.MemberList();
	
	return memberList;
}
	
	
	
	/**
	 * 회원 가입
	 * @param member
	 */
	public void addMember(MMember member) {
	memberMapper.addMember(member);
}

}
