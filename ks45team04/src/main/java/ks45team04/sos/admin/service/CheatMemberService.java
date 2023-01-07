package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team04.sos.admin.dto.CheatMember;
import ks45team04.sos.admin.mapper.AdminCheatMemberMapper;

@Service("adminChaetMemberService")
@Transactional
public class CheatMemberService {

private final AdminCheatMemberMapper adminCheatMemberMapper;

public CheatMemberService(AdminCheatMemberMapper adminCheatMemberMapper) {
	this.adminCheatMemberMapper = adminCheatMemberMapper;
}



/**
 * 특정 부정 회원 수정
 * @param cheatMember
 * @return 
 */
public int modifyCheatMemberInfo(CheatMember cheatMember) {
	
	return adminCheatMemberMapper.modifyCheatMemberInfo(cheatMember);
	
}



/**
 * 특정 부정 회원 상세 조회
 * @param cmId
 * @return CheatMember
 */
public CheatMember getTotalCheatMemberInfo(String cmId) {
	return adminCheatMemberMapper.getTotalCheatMemberInfo(cmId);
}



/**
 * 부정 회원 등록
 * @param cheatMember
 * @return int
 */
public int addCheatMember(CheatMember cheatMember) {

	return adminCheatMemberMapper.addCheatMember(cheatMember);
}



/** 부정회원 신고 조회
 * 
 * @param cmReporCode
 * @return CheatMember
 */

public CheatMember getCheatMemberInfoByCode(String cmReportCode) {

	return adminCheatMemberMapper.getCheatMemberJudge(cmReportCode);
}


/**
 * 부정 회원 목록 조회
 * @return List<CheatMemberList>
 */

public List<CheatMember> CheatMemberList() {
	
	List<CheatMember> cheatMemberList = adminCheatMemberMapper.CheatMemberList();

	return cheatMemberList;
}

}