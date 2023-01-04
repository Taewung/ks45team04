package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Member;

@Mapper 
public interface AdminMemberMapper {

	//전체 회원 정보 조회
	public List<Member> TotalMemberList();
	
	//회원 탈퇴
	public int totalRemoveMemberById(String memId);
	
	
}
