package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseSubMapper;

@Service
public class LicenseSubService {
	
private final LicenseSubMapper licenseSubMapper;
	
	public LicenseSubService(LicenseSubMapper licenseSubMapper) {
		this.licenseSubMapper = licenseSubMapper;
	}
	
	
	// 자격증 중분류 목록 조회
	public List<LicenseSub> LicenseSubList(){
		
		List<LicenseSub> licenseSubList = licenseSubMapper.LicenseSubList();
		
		return licenseSubList;
		
	}
}
