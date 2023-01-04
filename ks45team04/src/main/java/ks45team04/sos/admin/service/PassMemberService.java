package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks45team04.sos.admin.dto.PassMember;
import ks45team04.sos.admin.mapper.AdminPassMemberMapper;

@Service("adminPassMemberService")
@Transactional
public class PassMemberService {

private final AdminPassMemberMapper adminPassMemberMapper;

public PassMemberService(AdminPassMemberMapper adminPassMemberMapper) {
	this.adminPassMemberMapper = adminPassMemberMapper;
}

/**
 * 합격 회원 조회
 * @return List<PassMember>
 */
public List<PassMember> PassMemberList() {
	
	List<PassMember> passMemberList = adminPassMemberMapper.PassMemberList();
	
	return passMemberList;
}

}
