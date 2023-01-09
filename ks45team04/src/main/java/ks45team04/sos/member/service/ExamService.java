package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.member.mapper.ExamMapper;

@Service
public class ExamService {
	private final ExamMapper examMapper;
	public ExamService(ExamMapper examMapper) {
		this.examMapper = examMapper;
	}
	/**
	 * 자격증 중분류별 자격증목록 조회
	 * @return List<licenseList>
	 */
	public List<LicenseInfo> getLicenseList(String lscCode){
		List<LicenseInfo> licenseList = examMapper.getLicenseList(lscCode);
		return licenseList;
	}	
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getLicenseSubList(String lmcCode){
		List<LicenseSub> licenseSubList = examMapper.getLicenseSubList(lmcCode);
		return licenseSubList;
	}	
	/**
	 * 자격증 대분류목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getLicenseMainList(){
		List<LicenseMain> licenseMainList = examMapper.getLicenseMainList();
		return licenseMainList;
	}	
}
