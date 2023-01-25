package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.dto.PointSaveUse;
import ks45team04.sos.admin.mapper.PointSaveUseMapper;

@Service
public class PointSaveUseService {

	private final PointSaveUseMapper pointSaveUseMapper;

	public PointSaveUseService(PointSaveUseMapper pointSaveUseMapper) {
		this.pointSaveUseMapper = pointSaveUseMapper;
	}


	/**
	 * 포인트 적립/사용 등록
	 * @param pointSaveUse
	 * @return pointSaveUseAdd
	 */
	public int pointSaveUseadd(PointSaveUse pointSaveUse) {

		return pointSaveUseMapper.pointSaveUseAdd(pointSaveUse);
	}

	/**
	 * 포인트 적립 기준 내용 목록 조회
	 * 
	 * @return List<PointSaveStandard>
	 *//*
		 * public List<PointSaveStandard> getPointSaveStandardContent(){
		 * List<PointSaveStandard> pointSaveUseContent =
		 * pointSaveUseMapper.getPointSaveContent(); return pointSaveUseContent; }
		 */

	/**
	 * pointSaveUseCode 자동생성
	 * 
	 * @param pointSaveUse
	 * @param pointSaveUseCode
	 * @return newPointSaveUseCode
	 */
	public String getPointSaveUseCode(String pointSaveUse, String pointSaveUseCode) {
		String newPointSaveUseCode = pointSaveUseMapper.getPointSaveUseCode(pointSaveUse, pointSaveUseCode);
		return newPointSaveUseCode;
	}

	/**
	 * 포인트 적립/사용 내역 조회 및 검색/페이징
	 * @param searchKey
	 * @param searchValue
	 * @return paramMap
	 */
	public Map<String, Object> PointSaveUseList(int currentPage, String searchKey, String searchValue) {
		// 보여질 행의 갯수
		int rowPerPage = 5;
				
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = pointSaveUseMapper.getPointSaveUseCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
				
		if (searchKey != null) {
			switch (searchKey) {
			case "pointSaveUseId":
				searchKey = "point_save_use_id";
				break;
			}
		}
		// 조회 시 Limit 인수 파라미터 셋팅
				Map<String, Object> paramMap = new HashMap<String, Object>();
				paramMap.put("startRowNum", startRowNum);
				paramMap.put("rowPerPage", rowPerPage);
				paramMap.put("searchKey", searchKey);
				paramMap.put("searchValue", searchValue);

		List<PointSaveUse> pointSaveUseList = pointSaveUseMapper.pointSaveUseList(paramMap);

		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("pointSaveUseList", pointSaveUseList);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);

		return paramMap;
	}

}
