package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.member.dto.ChallengeGoal;

@Mapper
public interface ChallengeMapper {

	
	
	  	//챌린지 등록
		public int challengeGoal(ChallengeGoal challengeGoal);
		//챌린지코드 자동생성
		public String getNewCgCode(String challenge, String cgCode);
	 
	  	// 자격증 대분류 목록조회
	  	public List<LicenseMain> getMainListForChallenge();	
	  	// 자격증 대분류별 중분류목록조회
		public List<LicenseSub> getSubListForChallenge(String lmcCode);
		// 자격증 중분류별 자격증목록조회
		public List<LicenseInfo> getLiListForChallenge(String lscCode);
		// 자격증 자격증별 과목목록조회
		public List<LicenseSubject> getSubjectListForChallenge(String liCode);
		// 자격증 과목별 과목정보조회
		public LicenseSubject getSubjectInfoForChallenge(String lsCode);
	 	
	
}
