package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.CheatMember;

@Mapper
public interface AdminCheatMemberMapper {
	
	
	//부정 회원 정보 수정 처리
	public int modifyCheatMemberInfo(CheatMember cheatMember);

	//부정 회원 상세 정보 조회
	public CheatMember getTotalCheatMemberInfo(String cmReportCode);
	
	//부정 회원 추가
	public int addCheatMember(CheatMember cheatMember);
	
	//부정 회원 신고 목록 조회
	public CheatMember getCheatMemberJudge(String cmReportCode);
	
	//부정 회원 목록 조회
	public List<CheatMember> CheatMemberList(String searchKey, String searchValue);
}
