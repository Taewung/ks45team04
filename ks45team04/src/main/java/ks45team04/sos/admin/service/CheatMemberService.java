package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team04.sos.admin.dto.CheatMember;
import ks45team04.sos.admin.mapper.AdminCheatMemberMapper;

@Service("adminChaetMemberService")
@Transactional

public class CheatMemberService {

private final AdminCheatMemberMapper cheatMemberMapper;

public CheatMemberService(AdminCheatMemberMapper cheatMemberMapper) {
	this.cheatMemberMapper = cheatMemberMapper;
}



/**
 * 부정 회원 목록 조회
 * @return list<CheatMemberList>
 */

public List<CheatMember> CheatMemberList() {
	
	List<CheatMember> cheatMemberList = cheatMemberMapper.CheatMemberList();

	return cheatMemberList;
}

}