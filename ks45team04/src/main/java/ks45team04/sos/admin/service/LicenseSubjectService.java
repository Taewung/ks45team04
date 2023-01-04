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
	 * 특정 자격증 과목 등록
	 * @param licenseSubject
	 * @return int(update 쿼리 실행 결과)
	 */
	public int modifyLicenseSubject(LicenseSubject licenseSubjecti) {
		
		return licenSubjectMapper.modifyLicenseSubject(licenseSubjecti);
	}
	
	
	/**
	 * 특정 자격증 과목 조회
	 * @param lsCode
	 * @return licenseSubject
	 */
	
	public LicenseSubject getLicenseSubjectInfoByCode(String lsCode) {
		
		return licenSubjectMapper.getLicenseSubjectByCode(lsCode);
	}
	
	/**
	 * 자격증 과목 등록
	 * @param LicenseSubject
	 * @return int
	 */
	public int addLicenseSubject(LicenseSubject licenseSubject) {
		
		return licenSubjectMapper.addLicenseSubject(licenseSubject);
	}
	
	
	/**
	 * 자격증 과목 목록 조회
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> LicenseSubjectList(){
		
		List<LicenseSubject> licenseSubjectList = licenSubjectMapper.LicenseSubjectList();
		
		return licenseSubjectList;

	}
	
}
