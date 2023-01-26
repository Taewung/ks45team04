package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.member.dto.ChallengeGoal;
import ks45team04.sos.member.dto.ChallengeState;
import ks45team04.sos.member.mapper.ChallengeMapper;

@Service
public class ChallengeService {

	private final ChallengeMapper challengeMapper;

	public ChallengeService(ChallengeMapper challengeMapper) {
		this.challengeMapper = challengeMapper;
	}


/**
 * 챌린지 내역 조회	
 * @param memId
 * @return
 */
	public ChallengeState getChallengeState(String memId) {
	
		return challengeMapper.getChallengeState(memId);
}
	
	/**
	* 챌린지 등록
	* 
	* @param challenge
	*/
	public void challengeGoal(ChallengeGoal challengeGoal
			){challengeMapper.challengeGoal(challengeGoal);
	  }
	  
	  
	  
	 /**
		 * 챌린지코드 자동생성
		 * 
		 * @param challenge
		 * @param cgCode
		 * @return
		 */
		public String getNewCgCode(String challenge, String cgCode) {String newCgCode = challengeMapper.getNewCgCode(challenge, cgCode);
	  	return newCgCode;
	  	} 
	  
	  
	  
	 /**
		 * 특정 과목정보 조회
		 * 
		 * @param lsCode
		 * @return LicenseSubject
		 */
	  public LicenseSubject getSubjectInfoForChallenge(String lsCode){
		  LicenseSubject subjectInfoForChallenge = challengeMapper.getSubjectInfoForChallenge(lsCode);
		  return subjectInfoForChallenge;
	  } 
	  
	  
	 /**
		 * 자격증별 과목목록 조회
		 * 
		 * @param liCode
		 * @return List<LicenseSubject>
		 */
	  public List<LicenseSubject> getSubjectListForChallenge(String liCode){
	  List<LicenseSubject> subjectListForChallenge =
	  challengeMapper.getSubjectListForChallenge(liCode);
	  return subjectListForChallenge;
	  } 
	  
	  
	  
	  
	  
	 
	/**
		 * 자격증 중분류별 자격증목록 조회
		 * 
		 * @param lscCode
		 * @return List<LicenseInfo>
		 */
	  public List<LicenseInfo> getLiListForChallenge(String lscCode){
	  List<LicenseInfo> liListForChallenge =
	  challengeMapper.getLiListForChallenge(lscCode);
	  return liListForChallenge; }
	 
	  
	  
	  
	 
	 /**
		 * 자격증 대분류별 중분류목록 조회
		 * 
		 * @param lmcCode
		 * @return List<LicenseSub>
		 */
		 public List<LicenseSub> getSubListForChallenge(String lmcCode){
		  List<LicenseSub> subListForChallenge =
		  challengeMapper.getSubListForChallenge(lmcCode);
		  return subListForChallenge;
		  }
			 
			 

	/**
	 * 자격증 대분류 목록조회
	 * 
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getMainListForChallenge() {
		List<LicenseMain> mainListForChallenge = challengeMapper.getMainListForChallenge();
		return mainListForChallenge;

	}
}
