package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.mapper.LicensePassScoreMapper;



@Service
public class LicensePassScoreService {

	private static final Logger log = LoggerFactory.getLogger(LicensePassScoreService.class);
	private final LicensePassScoreMapper licensePassScoreMapper;
	public LicensePassScoreService(LicensePassScoreMapper licensePassScoreMapper) {
		this.licensePassScoreMapper = licensePassScoreMapper;
	}
	/**
	 * 특정 자격증합격기준점수 수정
	 * @param licensePassScore
	 * @return  int (update 쿼리 실행 결과)
	 */
	public int modifyLicensePassScore(LicensePassScore licensePassScore) {	
		int modifyResult = licensePassScoreMapper.modifyLicensePassScore(licensePassScore);
		return modifyResult;
	}
	/**
	 * 특정 자격증합격기준점수 조회
	 * @param liPScoreCode
	 * @return LicensePassScore
	 */
	public LicensePassScore getLicensePassScoreByCode(String liPScoreCode) {
		LicensePassScore licensePassScoreByCode = licensePassScoreMapper.getLicensePassScoreByCode(liPScoreCode);
		return licensePassScoreByCode;
	}
	
	/**
	 * 자격증별 합격기준점수 등록
	 * @param licensePassScore
	 */
	public void addLicensePassScore(LicensePassScore licensePassScore) {
		licensePassScoreMapper.addLicensePassScore(licensePassScore);
	}
	
	/**
	 * 자격증 합격기준점수코드 자동생성
	 * @param li_pass_score
	 * @param liPScoreCode
	 * @return newLiPScoreCode
	 */
	public String getNewLiPassScoreCode(String li_pass_score, String liPScoreCode) {
		String newLiPScoreCode = licensePassScoreMapper.getNewLiPassScoreCode(li_pass_score, liPScoreCode);
		return newLiPScoreCode; 
	}
	
	/**
	 * 자격증 중분류별 자격증목록 조회
	 * @return List<licenseList>
	 */
	public List<LicenseInfo> getLicenseList(String lscCode){
		List<LicenseInfo> licenseList = licensePassScoreMapper.getLicenseList(lscCode);
		return licenseList;
	}
	
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getLicenseSubList(String lmcCode){
		List<LicenseSub> licenseSubList = licensePassScoreMapper.getLicenseSubList(lmcCode);
		return licenseSubList;
	}	
	/**
	 * 자격증 대분류목록 조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getLicenseMainList(){
		List<LicenseMain> licenseMainList = licensePassScoreMapper.getLicenseMainList();
		return licenseMainList;
	}
	
	/**
	 * 자격증별 합격기준점수 목록조회 및 검색/페이징 처리
	 * @param currentPage
	 * @param searchKey
	 * @param searchValue
	 * @return paramMap
	 */
	public Map<String, Object> getLicensePassScoreList(int currentPage, String searchKey, String searchValue){		
		// 보여질 행의 갯수
		int rowPerPage = 10;
		
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = licensePassScoreMapper.getLiPScoreCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
		
		if(searchKey != null) {
			switch (searchKey) {
			case "liPScoreCode":
				searchKey = "li_p_score_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "liPScoreRegId":
				searchKey = "li_p_score_reg_id";
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
		List<LicensePassScore> licensePassScoreList = licensePassScoreMapper.getLicensePassScoreList(paramMap);
		
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("licensePassScoreList", licensePassScoreList);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
				
		return paramMap;
	}

}
