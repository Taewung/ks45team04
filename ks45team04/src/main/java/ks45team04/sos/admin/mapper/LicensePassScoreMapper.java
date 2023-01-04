package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;

@Mapper
public interface LicensePassScoreMapper {


	// 자격증별 합격기준점수 등록
	public int addLicensePassScore(LicensePassScore licensePassScore);
	
	// 자격증 대분류별 중분류목록 조회
	public List<LicenseSub> getLicenseSubList(String lmcCode);
	
	// 자격증 대분류 목록조회
	public List<LicenseMain> getLicenseMainList();
		
	// 자격증별 합격기준점수목록 조회
	public List<LicensePassScore> getLicensePassScoreList();
	
}
