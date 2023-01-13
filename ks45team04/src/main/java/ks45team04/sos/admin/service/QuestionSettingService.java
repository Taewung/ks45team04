package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Answer;
import ks45team04.sos.admin.dto.Explanation;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
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

	/* 답안 */	
	/**
	 * 문제코드별 답안목록조회
	 * @param questionCode
	 * @return List<Answer>
	 */
	public List<Answer> getAnswerList(String questionCode){
		List<Answer> answerList = questionSettingMapper.getAnswerList(questionCode);
		return answerList;
	}	
	
	/* 해설 */
	/**
	 * 문제코드별 해설목록조회
	 * @param questionCode
	 * @return List<Explanation>
	 */
	public List<Explanation> getExplanationList(String questionCode){
		List<Explanation> explanationList = questionSettingMapper.getExplanationList(questionCode);
		return explanationList;
	}
	
	/* 문제 */
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
		Question questionByCode = questionSettingMapper.getQuestionbyCode(questionCode);
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
	 * 문제 정보 목록조회
	 * @return List<Question>
	 */
	public List<Question> getQuestionList(String searchKey, String searchValue){
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
		List<Question> questionList = questionSettingMapper.getQuestionList(searchKey, searchValue);
		return questionList;
	}
}
