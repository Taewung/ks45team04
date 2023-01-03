package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.mapper.LicensePassScoreMapper;



@Service
public class LicensePassScoreService {

private final LicensePassScoreMapper licensePassScoreMapper;

	public LicensePassScoreService(LicensePassScoreMapper licensePassScoreMapper) {
		this.licensePassScoreMapper = licensePassScoreMapper;
	}
	
	// 자격증별 합격기준점수 목록 조회
	public List<LicensePassScore> getLicensePassScoreList(){
		
		List<LicensePassScore> licensePassScoreList = licensePassScoreMapper.getLicensePassScoreList();
		
		return licensePassScoreList;
	}

}
