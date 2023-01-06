package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Member;

@Mapper 
public interface AdminMemberMapper {


	// 회원 정보 수정 처리
	public int modifyMemberInfo(Member member);
	
	//회원 상세 정보 조회
	public Member getTotalMemberInfo(String memId);
	
	
	//전체 회원 정보 조회
	public List<Member> TotalMemberList();

	
}
