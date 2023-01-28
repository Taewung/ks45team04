package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MMembershipMember;

@Mapper
public interface MMembershipMemberMapper {

	// 멤버십 회원 개인 정보 조회
	public List<MMembershipMember> MembershipMemberList(String memId);
}
