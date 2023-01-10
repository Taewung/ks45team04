package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Answer;
import ks45team04.sos.admin.dto.Explanation;
import ks45team04.sos.admin.dto.Question;

@Mapper
public interface QuestionSettingMapper {

	/* ------------------문제------------------ */
	// 전체 문제목록 조회
	public List<Question> getQuestionList();
	
	/* ------------------답안------------------ */
	// 문제코드별 답안목록조회
	public List<Answer> getAnswerList(String questionCode);
	
	/* ------------------해설------------------ */
	// 문제코드별 해설목록조회
	public List<Explanation> getExplanationList(String questionCode);

}
