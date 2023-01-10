package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Answer;
import ks45team04.sos.admin.dto.Explanation;
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
	 * 문제 정보 목록조회
	 * @return List<Question>
	 */
	public List<Question> getQuestionList(){
		List<Question> questionList = questionSettingMapper.getQuestionList();
		return questionList;
	}
}
