package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Question;

@Mapper
public interface QuestionSettingMapper {
	
	// 전체 문제목록 조회
	public List<Question> getQuestionList();

}
