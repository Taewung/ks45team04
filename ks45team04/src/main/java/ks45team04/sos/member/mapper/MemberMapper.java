package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.Member;

@Mapper
public interface MemberMapper {

	
	//회원 가입
	public int addMember(Member member);
	
	//회원 목록
	public List<Member> MemberList();	
}
