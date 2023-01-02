package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.mapper.LicenseSubjectMapper;



@Service
public class LicenseSubjectService {
	
private final LicenseSubjectMapper licenSubjectMapper;
	
	public LicenseSubjectService(LicenseSubjectMapper licenSubjectMapper) {
		this.licenSubjectMapper = licenSubjectMapper;
	}

	// 자격증 과목 목록 조회
	public List<LicenseSubject> LicenseSubjectList(){
		
		List<LicenseSubject> licenseSubjectList = licenSubjectMapper.LicenseSubjectList();
		
		return licenseSubjectList;

	}
	
}
