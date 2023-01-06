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
