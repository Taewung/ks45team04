package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.member.dto.Note;
import ks45team04.sos.member.mapper.MNoteMapper;

@Service
public class MNoteService {
	private final MNoteMapper mNoteMapper;
	
	public MNoteService(MNoteMapper mNoteMapper) {
		this.mNoteMapper = mNoteMapper;
	}
	
	
	
	/**
	 * 노트 등록
	 * @param Note
	 */
	public int addNote(Note note) {
		
		return mNoteMapper.addNote(note);
	}
	
	
	/**
	 * 노트코드 자동완성
	 * 
	 */
	public String getNoteCode(String note_code, String noteCode) {
		
		String getNoteCode = mNoteMapper.getNoteCode(note_code, noteCode);
	
		return getNoteCode;
		
	}
	
	
	
	/**
	 * 공부노트 리뷰목록
	 * @return List<Note>
	 */
	public List<Note> noteReviewList(String noteWriterId){
		
		List<Note> noteReviewList = mNoteMapper.noteReviewList(noteWriterId);
		
		return noteReviewList;
	}
	
	
	
	/**
	 * 공부노트 상세보기 화면
	 * @param noteWriterId
	 * @return Note
	 */
	public Note getNoteById(String noteWriterId) {
		
		return mNoteMapper.getNoteById(noteWriterId);
	}
	
	
	/**
	 * 공부노트 목록 조회
	 * @return List<Note>
	 */
	public List<Note> noteList(){
		
		List<Note> noteList = mNoteMapper.noteList();
		
		return noteList;
	}
	
}
