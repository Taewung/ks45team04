package ks45team04.sos.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Answer;
import ks45team04.sos.admin.dto.Explanation;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.mapper.QuestionSettingMapper;

@Service
public class QuestionSettingService {

	private final QuestionSettingMapper questionSettingMapper;
	
	public QuestionSettingService(QuestionSettingMapper questionSettingMapper) {
		this.questionSettingMapper = questionSettingMapper;
	}
	/* ******************전체****************** */	
	/**
	 * 특정 문제코드 조회
	 * @param questionCode
	 * @return questionCode
	 */
	public Question getQuestionCodeForQSet(String questionCode) {
		Question questionCodeForQSet = questionSettingMapper.getQuestionCodeForQSet(questionCode);		
		return questionCodeForQSet;
	}
	/* ******************답안****************** */	
	/**
	 * 문제코드별 답안목록조회
	 * @param questionCode
	 * @return List<Answer>
	 */
	public List<Answer> getAnswerList(String questionCode){
		List<Answer> answerList = questionSettingMapper.getAnswerList(questionCode);
		return answerList;
	}
	/**
	 * 답안 등록
	 * @param answer
	 */
	public void addAnswer(Answer answer) {
		questionSettingMapper.addAnswer(answer);
	}
	/**
	 * 답안코드 자동생성
	 * @param answer
	 * @param answerCode
	 * @return newAnswerCode
	 */
	public String getNewAnswerCode(String answer, String answerCode) {
		String newAnswerCode = questionSettingMapper.getNewAnswerCode(answer, answerCode);
		return newAnswerCode;
	}
	/**
	 * 특정 답안정보 수정
	 * @param answer
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyAnswer(Answer answer) {
		int modifyResult = questionSettingMapper.modifyAnswer(answer);
		return modifyResult;
	}
	/**
	 * 특정 답안정보 조회
	 * @param answerCode
	 * @return answerByCode
	 */
	public Answer getAnswerByCode(String answerCode) {
		Answer answerByCode = questionSettingMapper.getAnswerByCode(answerCode);
		return answerByCode;
	}
	/* ******************해설****************** */	
	/**
	 * 문제코드별 해설목록조회
	 * @param questionCode
	 * @return List<Explanation>
	 */
	public List<Explanation> getExplanationList(String questionCode){
		List<Explanation> explanationList = questionSettingMapper.getExplanationList(questionCode);
		return explanationList;
	}
	/**
	 * 해설 등록
	 * @param explanation
	 */
	public void addExplanation(Explanation explanation) {
		questionSettingMapper.addExplanation(explanation);
	}
	/**
	 * explanation코드 자동생성
	 * @param explanation
	 * @param explainCode
	 * @return newExplainCode
	 */
	public String getNewExplainCode(String explanation, String explainCode) {
		String newExplainCode = questionSettingMapper.getNewExplainCode(explanation, explainCode);
		return newExplainCode;
	}
	/**
	 * 특정 해설정보 수정
	 * @param explanation
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyExpalantion(Explanation explanation) {
		int modifyResult = questionSettingMapper.modifyExpalantion(explanation);				
		return modifyResult;
	}
	/**
	 * 특정 해설정보 조회
	 * @param explainCode
	 * @return explanationrByCode
	 */
	public Explanation getExplanationByCode(String explainCode) {
		Explanation explanationByCode = questionSettingMapper.getExplanationByCode(explainCode);
		return explanationByCode;
	}
	
	/* ******************문제****************** */	
	/**
	 * 특정 문제정보 수정
	 * @param question
	 * @return int (update 쿼리 실행 결과)
	 */
	public int modifyQuestion(Question question) {
		int modifyResult = questionSettingMapper.modifyQuestion(question);
		return modifyResult;
	}
	/**
	 * 특정 문제정보 조회
	 * @param questionCode
	 * @return questionByCode
	 */
	public Question getQuestionbyCode(String questionCode) {
		Question questionByCode = questionSettingMapper.getQuestionByCode(questionCode);
		return questionByCode;
	}
	/**
	 * 문제 등록
	 * @param question
	 */
	public void addQuestion(Question question) {										
		questionSettingMapper.addQuestion(question);
	}
	/**
	 * 문제코드 자동생성
	 * @param question
	 * @param questionCode
	 * @return newQuestionCode
	 */
	public String getNewQuestionCode(String question, String questionCode) {
		String newQuestionCode = questionSettingMapper.getNewQuestionCode(question, questionCode);
		return newQuestionCode; 
	}		
	/**
	 * 특정 과목정보 조회
	 * @param lsCode
	 * @return LicenseSubject
	 */
	public LicenseSubject getSubjectInfoForQuestion(String lsCode){
		LicenseSubject subjectInfoForQuestion = questionSettingMapper.getSubjectInfoForQuestion(lsCode);
		return subjectInfoForQuestion;
	}	
	/**
	 * 자격증별 과목목록 조회
	 * @param liCode
	 * @return List<LicenseSubject>
	 */
	public List<LicenseSubject> getSubjectListForQuestion(String liCode){
		List<LicenseSubject> subjectListForQuestion = questionSettingMapper.getSubjectListForQuestion(liCode);
		return subjectListForQuestion;
	}
	/**
	 * 자격증 중분류별 자격증목록 조회
	 * @param lscName
	 * @return List<licenseList>
	 */
	public List<LicenseInfo> getLiListForQuestion(String lscCode){
		List<LicenseInfo> liListForQuestion = questionSettingMapper.getLiListForQuestion(lscCode);
		return liListForQuestion;
	}
	/**
	 * 자격증 대분류별 중분류목록 조회
	 * @param lmcCode
	 * @return List<LicenseSub>
	 */
	public List<LicenseSub> getSubListForQuestion(String lmcCode){
		List<LicenseSub> subListForQuestion = questionSettingMapper.getSubListForQuestion(lmcCode);
		return subListForQuestion;
	}	
	/**
	 * 자격증 대분류 목록조회
	 * @return List<LicenseMain>
	 */
	public List<LicenseMain> getMainLisForQuestion(){
		List<LicenseMain> mainListForQuestion = questionSettingMapper.getMainLisForQuestion();
		return mainListForQuestion;
	}

	/**
	 * 전체 문제 목록조회 및 검색/페이징 처리
	 * @param currentPage
	 * @param searchKey
	 * @param searchValue
	 * @return
	 */
	public Map<String, Object> getQuestionList(int currentPage, String searchKey, String searchValue){ 
		// 보여질 행의 갯수
		int rowPerPage = 7;
		
		//  보여질 행의 시작점
		int startRowNum = (currentPage - 1) * rowPerPage;
		
		// 마지막페이지 
		// 1. 테이블의 전체 행의 갯수
		double rowCnt = questionSettingMapper.getQuestionCnt();
		// 2. 마지막페이지
		int lastPage = (int) Math.ceil(rowCnt/rowPerPage);
		
		// 보여질 페이지 번호 구현
		// 보여질 페이지 번호 초기화
		int startPageNum = 1;
		int endPageNum = (int) Math.ceil(rowCnt/rowPerPage);
        
        if(searchKey != null) {
			switch (searchKey) {
			case "questionCode":
				searchKey = "question_code";
				break;
			case "liName":
				searchKey = "li_name";
				break;
			case "lsName":
				searchKey = "ls_name";
				break;
			case "questionRegId":
				searchKey = "question_reg_id";
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
		List<Question> questionList = questionSettingMapper.getQuestionList(paramMap);
		
		// controller에 전달하기 위한 파라미터 셋팅
		paramMap.clear();
		paramMap.put("questionList", questionList);
		paramMap.put("lastPage", lastPage);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
				
		return paramMap;
	}
}



