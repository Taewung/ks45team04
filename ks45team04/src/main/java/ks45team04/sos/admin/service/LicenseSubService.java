package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseSubMapper;

@Service
public class LicenseSubService {
	
private final LicenseSubMapper licenseSubMapper;
	
	public LicenseSubService(LicenseSubMapper licenseSubMapper) {
		this.licenseSubMapper = licenseSubMapper;
	}
	
	/**
	 * 특정 자격증 중분류 수정
	 * @param licenseSub
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyLicenseSub(LicenseSub licenseSub) {
		
		return licenseSubMapper.modifyLicenseSub(licenseSub);
	}
	
	/**
	 * 특정 자격증 중분류 조회
	 * @param lscCode
	 * @return licenseSub
	 */
	public LicenseSub getLicenseSubInfoByCode(String lscCode) {
		
		return licenseSubMapper.getLicenseSubByCode(lscCode);
	}
	

	
	/**
	 * 자격증 중분류 등록
	 * @param LicenseSub
	 * @return int
	 */
	public int addLicenseSub(LicenseSub licenseSub) {
		
		return licenseSubMapper.addLicenseSub(licenseSub);
	}
	
	/**
	 * 자격증 중분류 선택을 위한 대분류 목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> licenseMainList(){
		
		List<LicenseMain> licenseMainList = licenseSubMapper.licenseMainList();
		
		return licenseMainList;
	}
	
	/**
	 * 자격증 중분류 등록을 위한 목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getLicenseSubList(){
		
		List<LicenseSub> getLicenseSubList = licenseSubMapper.getLicenseSubList();
		
		return getLicenseSubList;
	}
	
	
	/**
	 * 자격증 중분류 목록 조회, 검색 및 페이징 처리
	 * @return List<LicenseSub>
	 */
	public Map<String, Object> LicenseSubList(int currentPage, String searchKey, String searchValue){
		// 보여질 행의 갯수
		int rowPerPage = 10;
		
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = licenseSubMapper.getLicenseSubCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
	
		
		if(searchKey != null) {
			switch (searchKey) {
			case "lscCode":
				searchKey = "lsc.lsc_code";
				break;
			case "lmcName":
				searchKey = "lsc.lmc_name";
				break;
			case "lscName":
				searchKey = "lsc.lsc_name";
				break;
			case "lscRegDatetime":
				searchKey = "lsc.lmc_reg_datetime";
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
				List<LicenseSub> licenseSubList = licenseSubMapper.LicenseSubList(paramMap);
				
				// controller에 전달하기 위한 파라미터 셋팅
				paramMap.clear();
				paramMap.put("licenseSubList", licenseSubList);
				paramMap.put("lastPage", lastPage);
				paramMap.put("startPageNum", startPageNum);
				paramMap.put("endPageNum", endPageNum);
						
				return paramMap;
		
	}
	
	
	
	
	
	
	
}
