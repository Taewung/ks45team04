package ks45team04.sos.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.Question;
import ks45team04.sos.admin.mapper.QuestionSettingMapper;

@Service
public class QuestionSettingService {

	private final QuestionSettingMapper questionSettingMapper;
	
	public QuestionSettingService(QuestionSettingMapper questionSettingMapper) {
		this.questionSettingMapper = questionSettingMapper;
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
