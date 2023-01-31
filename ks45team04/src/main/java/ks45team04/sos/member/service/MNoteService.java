package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.Note;
import ks45team04.sos.member.mapper.MNoteMapper;

@Service
public class MNoteService {
	private final MNoteMapper mNoteMapper;
	
	public MNoteService(MNoteMapper mNoteMapper) {
		this.mNoteMapper = mNoteMapper;
	}
	
	
	
	/**
	 * 노트 등록을 위한 자격증 정보 조회
	 * @param Note
	 */
	public List<LicenseInfo> licenseInfoList(){
		
		List<LicenseInfo> licenseInfoList = mNoteMapper.licenseInfoList();
		
		return licenseInfoList;
	}
	
	
	
	/**
	 * 노트 등록
	 * @param Note
	 */
	public int addNote(Note note) {
		
		return mNoteMapper.addNote(note);
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
	public List<Note> getnoteList(String searchKey, String searchValue){
		
		if(searchKey != null) {
			switch (searchKey) {
			case "liName":
				searchKey = "li_name";
				break;
			case "noteName":
				searchKey = "note_name";
				break;
			case "noteWriterId":
				searchKey = "note_writer_id";
				break;
			}
		}
		
		List<Note> getnoteList = mNoteMapper.getnoteList(searchValue, searchValue);
		
		return getnoteList;
	}
	
}
