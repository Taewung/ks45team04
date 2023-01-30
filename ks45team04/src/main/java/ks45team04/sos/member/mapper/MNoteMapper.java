package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.Note;

@Mapper
public interface MNoteMapper {
	
	
	// 공부노트 등록
	public int addNote(Note note);
	
	// 공부노트 등록을 위한 목록 조회
	public List<Note> noteList();
	
	// 공부노트 등록을 위한 자격증 정보 조회
	public List<LicenseInfo> licenseInfoList();
	
	// 공부노트 리뷰 목록 조회
	public List<Note> noteReviewList(String noteWriterId);
	
	// 공부노트 상세보기
	public Note getNoteById(String noteWriterId);
	
	// 공부노트 목록 조회
	public List<Note> getnoteList(String searchKey, String searchValue);
	
	// 공부노트 테이블 전체 행의 갯수
	public int getNoteCnt();
	
	
}
