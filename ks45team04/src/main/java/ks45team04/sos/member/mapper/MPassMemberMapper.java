package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.MPassMember;

@Mapper
public interface MPassMemberMapper {

	//합격 인증 여부 조회
	public List<MPassMember> PassMemberList(String memId);
	
}
