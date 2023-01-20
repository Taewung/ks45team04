package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.PassMember;

@Mapper
public interface AdminPassMemberMapper {

	//합격 회원 정보 수정 처리
	public int modifyPassMemberInfo(PassMember passMember);
	
	//합격 회원 상세 정보 조회
	public PassMember getTotalPassMemberInfo(String pmId);
	
	//합격 회원 정보 조회
	public List<PassMember> PassMemberList(String searchKey, String searchValue);
}
