package ks45team04.sos.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;


@Mapper
public interface LicensePassScoreMapper {	
	// 특정합격기준점수 수정
	public int modifyLicensePassScore(LicensePassScore licensePassScore);
	
	// 특정합격기준점수 정보 조회
	public LicensePassScore getLicensePassScoreByCode(String liPScoreCode);
	
	// 자격증별 합격기준점수 등록
	public int addLicensePassScore(LicensePassScore licensePassScore);
	
	// 자격증별 합격기준점수코드 자동생성
	public String getNewLiPassScoreCode(String li_pass_score, String liPScoreCode);
	
	// 자격증 중분류별 자격증목록 조회
	public List<LicenseInfo> getLicenseList(String lscCode);
	
	// 자격증 대분류별 중분류목록 조회
	public List<LicenseSub> getLicenseSubList(String lmcCode);
	
	// 자격증 대분류 목록조회
	public List<LicenseMain> getLicenseMainList();
		
	// 자격증별 합격기준점수목록 조회
	public List<LicensePassScore> getLicensePassScoreList(Map<String,Object> paramMap);
	
	// 자격증합격기준점수 테이블 전체 행의 갯수
	public int getLiPScoreCnt();
}
