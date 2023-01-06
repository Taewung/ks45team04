package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.WrongAnswer;

@Mapper
public interface WrongAnswerMapper {

	// 오답 목록 조회
	public List<WrongAnswer> getWrongAnswerList();
}
