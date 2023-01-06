package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.MembershipMember;

@Mapper
public interface AdminMembershipMemberMapper {

	
	
	//멤버십 회원 상세 정보 조회
	public MembershipMember getTotalMembershipMemberInfo(String mmId);
	
	//멤버십 회원 조회
	public List<MembershipMember> TotalMembershipMemberList();
}
