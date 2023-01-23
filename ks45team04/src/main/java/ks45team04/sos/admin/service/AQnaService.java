package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.Qna;
import ks45team04.sos.admin.mapper.AQnaMapper;

@Service
public class AQnaService {

	private final AQnaMapper aqnaMapper;
	
	public AQnaService(AQnaMapper aqnaMapper) {
		this.aqnaMapper = aqnaMapper;
	}
	

	
	/**
	 * 특정 1:1문의 수정
	 * @param qna
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyQna(Qna qna) {
		
		return aqnaMapper.modifyQna(qna);
	}
	
	
	
	/**
	 * 특정 1:1 문의 조회
	 * @param qnaCode
	 * @return qna
	 */
	public Qna getQnaByCode(String qnaCode) {
		
		return aqnaMapper.getQnaByCode(qnaCode);
	}
	

	
	/**
	 * 1:1 문의 등록
	 * @param Qna
	 * @return int
	 */
	public int addQnaQuestion(Qna qna) {
		
		return aqnaMapper.addQnaQuestion(qna);
	}
	
	/**
	 * 1:1 문의 등록을 위한 조회
	 * @return List<Qna>
	 */
	 public List<Qna> getQnaList(){
		 
		 List<Qna> getQnaList = aqnaMapper.getQnaList();
		 
		 return getQnaList;
	 }
	

	/**
	 * 1:1 문의 조회
	 * @return List<Qna>
	 */
	public Map<String, Object> QnaList(int currentPage, String searchKey, String searchValue){
		
		// 보여질 행의 갯수
		int rowPerPage = 7;
		
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = aqnaMapper.getQnaCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
		
		
		if(searchKey != null) {
			switch (searchKey) {
			case "questionId":
				searchKey = "question_id";
				break;
			case "qnaType":
				searchKey = "qna_type";
				break;
			case "questionTitle":
				searchKey = "question_title";
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
		List<Qna> qnaList = aqnaMapper.QnaList(paramMap);
		
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("qnaList", qnaList);	
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
				
		return paramMap;
	}
}





