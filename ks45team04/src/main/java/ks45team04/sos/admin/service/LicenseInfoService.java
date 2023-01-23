package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseInfoMapper;

@Service
public class LicenseInfoService {

private final LicenseInfoMapper licenseInfoMapper;

	public LicenseInfoService(LicenseInfoMapper licenseInfoMapper) {
		this.licenseInfoMapper = licenseInfoMapper;
	}
	
	/**
	 * 특정 자격증 정보 수정
	 * @param licenseInfo
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseInfo(LicenseInfo licenseInfo) {
		
		return licenseInfoMapper.modifyLicenseInfo(licenseInfo);
	}
	
	
	/**
	 * 특정 자격증 정보 조회
	 * @param liCode
	 * @return licenseInfo
	 */
	public LicenseInfo getLicenseInfoByCode(String liCode) {
		
		return licenseInfoMapper.getLicenseInfoByCode(liCode);
	}
	
	
	/**
	 * 자격증 대분류 등록
	 * @param LicenseInfo
	 * @return int
	 */
	public int addLicenseInfo(LicenseInfo licenseInfo) {
		
		return licenseInfoMapper.addLicenseInfo(licenseInfo);
	}
	
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> licenseSubList(String lmcCode){
		
		List<LicenseSub> licenseSubsList = licenseInfoMapper.licenseSubList(lmcCode);
		
		return licenseSubsList;
	}
	
	
	/**
	 * 자격증 정보 등록을 위한 대분류 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> licenseMainList(){
		
		List<LicenseMain> licenseMainList = licenseInfoMapper.licenseMainList();
		
		return licenseMainList;
	}
	
	
	
	/**
	 * 자격증 정보 목록 조회
	 * @return List<LicenseInfo>
	 */
	public Map<String, Object> licenseInfoList(int currentPage, String searchKey, String searchValue){
		// 보여질 행의 갯수
		int rowPerPage = 5;
		
		//  보여질 행의 시작점s
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = licenseInfoMapper.getLicenseInfoCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
		
		if(searchKey != null) {
			switch (searchKey) {
			case "liCode":
				searchKey = "li_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "lmcName":
				searchKey = "lmc_name";
				break;
			case "lscName":
				searchKey = "lsc_name";
				break;
			case "liRegDatetime":
				searchKey = "li_reg_date";
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
		List<LicenseInfo> licenseInfoList = licenseInfoMapper.LicenseInfoList(paramMap);
		
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("licenseInfoList", licenseInfoList);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
				
		return paramMap;
	}
	
	
	
	
	
}
