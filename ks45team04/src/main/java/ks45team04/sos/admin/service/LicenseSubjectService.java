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

	/**
	 * 자격증 대분류 등록
	 * @param LicenseSubject
	 * @return int
	 */
	public int addLicenseSubject(LicenseSubject licenseSubject) {
		
		return licenSubjectMapper.addLicenseSubject(licenseSubject);
	}
	
	
	/**
	 * 자격증 대분류 목록 조회
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> LicenseSubjectList(){
		
		List<LicenseSubject> licenseSubjectList = licenSubjectMapper.LicenseSubjectList();
		
		return licenseSubjectList;

	}
	
}
