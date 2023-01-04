package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicensePassScoreMapper;



@Service
public class LicensePassScoreService {

private final LicensePassScoreMapper licensePassScoreMapper;
	public LicensePassScoreService(LicensePassScoreMapper licensePassScoreMapper) {
		this.licensePassScoreMapper = licensePassScoreMapper;
	}
	
	/**
	 * 자격증별 합격기준점수 등록
	 * @param licensePassScore
	 */
	public void addLicensePassScore(LicensePassScore licensePassScore) {
		licensePassScoreMapper.addLicensePassScore(licensePassScore);
	}
	
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getLicenseSubList(String lmcCode){
		List<LicenseSub> licenseSubList = licensePassScoreMapper.getLicenseSubList(lmcCode);
		return licenseSubList;
	}	
	/**
	 * 자격증 대분류목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getLicenseMainList(){
		List<LicenseMain> licenseMainList = licensePassScoreMapper.getLicenseMainList();
		return licenseMainList;
	}
	
	/**
	 * 자격증별 합격기준점수 조회
	 * @return List<LicensePassScore>
	 */
	public List<LicensePassScore> getLicensePassScoreList(){	
		List<LicensePassScore> licensePassScoreList = licensePassScoreMapper.getLicensePassScoreList();	
		return licensePassScoreList;
	}

}
