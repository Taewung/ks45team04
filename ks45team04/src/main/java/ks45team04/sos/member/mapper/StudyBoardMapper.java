package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.StudyBoard;

@Mapper	
public interface StudyBoardMapper {
	
	
	
	//스터디 모집 게시판 등록
		public int addStudyBoard(StudyBoard studyboard); 
	
	//스터디 모집 게시판 조회
		public List<StudyBoard> studyBoardList();

}
