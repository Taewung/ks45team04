package ks45team04.sos.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.Member;

@Mapper
public interface MemberMapper {

	
	//회원 관리
	public int addMember(Member member);
}
