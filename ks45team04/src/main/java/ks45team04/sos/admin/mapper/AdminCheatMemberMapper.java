package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.CheatMember;

@Mapper
public interface AdminCheatMemberMapper {

	//부정 회원 목록 조회
	public List<CheatMember> CheatMemberList();
}
