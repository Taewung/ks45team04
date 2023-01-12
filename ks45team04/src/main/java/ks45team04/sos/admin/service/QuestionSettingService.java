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
	public List<Question> getQuestionList(){
		List<Question> questionList = questionSettingMapper.getQuestionList();
		return questionList;
	}
}
