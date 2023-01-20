package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
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
	 * 자격증 과목 등록을 위한 자격증 정보 목록 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> licenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = licenSubjectMapper.licenseInfoList();
		
		return licenseInfoList;
	}
	
	/**
	 * 자격증 과목 등록을 위한 목록 조회
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> getLicenseSubjectList(){
		
		List<LicenseSubject> getLicenseSubjectList = licenSubjectMapper.getLicenseSubjectList();
		
		return getLicenseSubjectList;
	}
	
	
	
	/**
	 * 자격증 과목 목록 조회
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> LicenseSubjectList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "lsCode":
				searchKey = "ls_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "lsName":
				searchKey = "ls_name";
				break;
			case "lsRegDatetime":
				searchKey = "ls_reg_datetime";
				break;
			}
		}
		
		List<LicenseSubject> licenseSubjectList = licenSubjectMapper.LicenseSubjectList(searchKey, searchValue);
		
		return licenseSubjectList;

	}
	
}
