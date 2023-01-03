package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.mapper.LicenseInfoMapper;

@Service
public class LicenseInfoService {

private final LicenseInfoMapper licenseInfoMapper;

	public LicenseInfoService(LicenseInfoMapper licenseInfoMapper) {
		this.licenseInfoMapper = licenseInfoMapper;
	}
	
	// 자격증 정보 목록 조회
	public List<LicenseInfo> LicenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = licenseInfoMapper.LicenseInfoList();
		
		return licenseInfoList;
	}
	
	
	
	
	
}
