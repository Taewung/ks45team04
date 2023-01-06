package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.WrongAnswerNote;

@Mapper
public interface WrongAnswerNoteMapper {
	
	// 오답노트 목록 조회
	public List<WrongAnswerNote> getWrongAnswerNoteList();
}
 