package ks45team04.sos.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.LoginHistory;
import ks45team04.sos.member.dto.MMember;

@Mapper
public interface MemberMapper {

	
	//회원 정보 수정 처리
	public int modifyMemberInfo(MMember mmember);
	
	//특정 회원정보 조회
	public MMember MemberList(String memId);
	
	//로그인이력 테이블의 전체 행의 갯수
	public int getLoginHistoryCnt();
	
	//로그인 이력 조회
	public List<LoginHistory> getLoginHistory(Map<String, Object> paramMap);	
	
	//회원 중복체크
	public int checkId(String memId);
	
	//회원 가입
	public int addMember(MMember mmember);
	
}
