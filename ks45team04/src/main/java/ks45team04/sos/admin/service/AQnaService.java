package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
	public List<Qna> QnaList(String searchKey, String searchValue){
		
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
		

		List<Qna> QnaList = aqnaMapper.QnaList(searchKey, searchValue);
		
		return QnaList;
	}
}





