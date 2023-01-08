package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.member.dto.Note;

@Mapper
public interface MNoteMapper {

	// 구매노트 리뷰 목록 조회
	public List<Note> noteReviewList();
	
	// 구매노트 수정
	public int modifyNote(Note note);
	
	// 구매노트 상세보기
	public Note getNoteById(String noteWriterId);
	
	// 구매노트 등록
	public int addNote(Note note);
	
	// 구매노트 목록 조회
	public List<Note> noteList();
	
}
