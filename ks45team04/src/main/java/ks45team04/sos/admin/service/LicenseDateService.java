package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseDate;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseDateMapper;

@Service
public class LicenseDateService {

	private final LicenseDateMapper licenseDateMapper;
	
	public LicenseDateService (LicenseDateMapper licenseDateMapper) {
		this.licenseDateMapper = licenseDateMapper;
	}
	
	/**
	 * 특정 자격증 일정 수정 
	 * @param licenseDate
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseInfoDate(LicenseDate licenseDate) {
		
		return licenseDateMapper.modifyLicenseDate(licenseDate);

	}
	
	
	/**
	 * 특정 자격증 일정 조회 
	 * @param ldCode
	 * @return licenseDate
	 */
	public LicenseDate getLicenseDateInfoByCode(String ldCode) {
		
		return licenseDateMapper.getLicenseDateInfoByCode(ldCode);
	}
	
	/**
	 * 자격증 일정 등록
	 * @param LicenseDate
	 * @return int
	 */
	public int addLicenseDate(LicenseDate licenseDate) {
		
		return licenseDateMapper.addLicenseDate(licenseDate);
	}
	
	/**
	 * 자격증 일정 등록을 위한 자격증 정보 조회
	 * @return List<LicenseInfo>
	 */
	public List<LicenseInfo> licenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = licenseDateMapper.licenseInfoList();
		
		return licenseInfoList;
		
	}
	
	/**
	 * 자격증 일정 등록을 목록 조회
	 * @return List<LicenseDate>
	 */
	public List<LicenseDate> getLicenseDateList(){
		
		List<LicenseDate> getLicenseDateList = licenseDateMapper.getLicenseDateList();
		
		return getLicenseDateList;
	}
	
	
	/**
	 * 자격증 일정 목록 조회, 검색 및 페이징 처리
	 * @return List<LicenseDate>
	 */
	public Map<String, Object> licenseDateList(int currentPage, String searchKey, String searchValue){
		
		// 보여질 행의 갯수
		int rowPerPage = 7;
		
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = licenseDateMapper.getLicenseDateCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
		
		
		if(searchKey != null) {
			switch (searchKey) {
			case "ldCode":
				searchKey = "ld_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "ldRegDatetime":
				searchKey = "ld_reg_datetime";
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
		List<LicenseDate> licenseDateList = licenseDateMapper.LicenseDateList(paramMap);
		
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("licenseDateList", licenseDateList);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
				
		return paramMap;
	}
}





