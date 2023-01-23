package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseSub;
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
	public Map<String, Object> LicenseSubjectList(int currentPage, String searchKey, String searchValue){
		
		// 보여질 행의 갯수
		int rowPerPage = 10;
		
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = licenSubjectMapper.getLicenseSubjectCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
		
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
		
		// 조회 시 Limit 인수 파라미터 셋팅
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRowNum", startRowNum);
		paramMap.put("rowPerPage", rowPerPage);
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		// data => 전체 문제 목록 조회 get
		List<LicenseSubject> licenseSubjectList = licenSubjectMapper.LicenseSubjectList(paramMap);
		
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("licenseSubjectList", licenseSubjectList);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
				
		return paramMap;

	}
	
}
