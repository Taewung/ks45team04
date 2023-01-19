package ks45team04.sos.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.Qna;

@Mapper
public interface AQnaMapper {

	
	// 특정 1:1문의 정보 수정
	public int modifyQna(Qna qna);
	
	// 특정 1:1문의 정보 조회
	public Qna getQnaByCode(String qnaCode);
	
	//1:1 문의 등록
	public int addQnaQuestion(Qna qna);
	
	//1:1 문의 질문 및 답변 목록 조회
	public List<Qna> QnaList();
}
