package ks45team04.sos.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.LoginHistory;
import ks45team04.sos.member.dto.MMember;
import ks45team04.sos.member.mapper.MemberMapper;

@Service
public class MMemberService {
	
	
	private static final Logger log = LoggerFactory.getLogger(MMemberService.class);

	public final MemberMapper memberMapper;
	
	public  MMemberService(MemberMapper MemberMapper) {
		this.memberMapper = MemberMapper;
	}
	
	
//public List<MMember> MemberList() {
//	List<MMember> memberList = memberMapper.MemberList();
//	
//	return memberList;
//}

public Map<String, Object> getLoginHistory(int currentPage){
	// 보여질 행의 갯수
	int rowPerPage = 10;
	
	//  로그인이력 테이블의 보여질 행의 시작점
	int startRowNum = (currentPage - 1) * rowPerPage;
	
	// 마지막페이지 
	// 1. 로그인이력 테이블의 전체 행의 갯수
	double rowCnt = memberMapper.getLoginHistoryCnt();
	// 2. 마지막페이지
	int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
	
	// 보여질 페이지 번호 구현
	// 보여질 페이지 번호 초기화
	int startPageNum = 1;
	int endPageNum = 10;
	
	// 동적 페이지 번호 구현
	// 페이지 번호 (동적) 10페이지 미만일 경우 처리
    if(currentPage > 6 && lastPage > 9){
    	startPageNum = currentPage - 5;
    	endPageNum = currentPage + 4;
        if(endPageNum >= lastPage){
        	startPageNum = lastPage - 9;
        	endPageNum = lastPage;
        }
    }
	
	// 로그인이력 조회 시 Limit 인수 파라미터 셋팅
	Map<String, Object> paramMap = new HashMap<String, Object>();
	paramMap.put("startRowNum", startRowNum);
	paramMap.put("rowPerPage", rowPerPage);
	
	// 로그인 이력 data
	List<LoginHistory> loginHistory = memberMapper.getLoginHistory(paramMap);
	
	// controller에 전달하기 위한 파라미터 셋팅
	paramMap.clear();
	paramMap.put("loginHistory", loginHistory);
	paramMap.put("lastPage", lastPage);
	paramMap.put("startPageNum", startPageNum);
	paramMap.put("endPageNum", endPageNum);
			
	return paramMap;
}

/**
 * 회원정보(비밀번호) 확인
 * @param memberId, memberPw
 * @return
 */
public Map<String, Object> checkPwByMemId(String memId, String memPw) {
	
	Map<String, Object> resultMap = new HashMap<String, Object>();
	
	boolean result = false;
	
	MMember mmember = memberMapper.MemberList(memId);
	if(mmember != null) {
		String checkPw = mmember.getMemPw();
		log.info("mmember = {}", mmember);
		if(memPw.equals(checkPw)) {
			result = true;
		}
	}
	
	resultMap.put("result", result);
	resultMap.put("memInfo", mmember);
	
	return resultMap;
}

/**
 * 개인 회원 정보 수정
 * @param mmember
 * @return
 */
public int modifyMemberInfo(MMember mmember) {
	
	return memberMapper.modifyMemberInfo(mmember);
}


/**
 * 개인 회원 정보 조회
 * @param memId
 * @return
 */
public MMember MemberList(String memId) {
	
	return  memberMapper.MemberList(memId);
}



/**
 * 	
 * @param mmember
 * 
 */
	//회원가입 처리
	public void addMember(MMember mmember){
		log.info("addMember : {}", mmember);
	    memberMapper.addMember(mmember);
	
	}
	
    // 중복 회원 아이디 체크
	public int checkId(String memId){
		log.info("memId1111111111 :{}", memId);
	    int result = memberMapper.checkId(memId);
	    log.info("result :{}", result);
	    return result;
	}
	
	
	/* 로그인코드 자동생성 */
	public String getloginLogoutCode(String login_logout, String loginLogoutCode) {
	     String newLoginLogoutCode = memberMapper.getloginLogoutCode(login_logout, loginLogoutCode);
	     return newLoginLogoutCode;	
	}
	
}
