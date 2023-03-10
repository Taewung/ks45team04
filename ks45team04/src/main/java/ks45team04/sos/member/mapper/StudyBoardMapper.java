package ks45team04.sos.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.StudyBoard;

@Mapper	
public interface StudyBoardMapper {
	
	// 스터디 모집 게시판 등록을 위한 자격증 코드별 자격증 이름
	public LicenseInfo getLiNameForExam(String liCode);
	
	//스터디 모집 게시판 등록을 위한 자격증정보 목록조회
		public List<LicenseInfo> getLiInfoForStudy();
	
	//스터디 모집 게시판 등록
		public int addStudyBoard(StudyBoard studyboard); 
	
	//스터디 모집 게시판 조회
		public List<StudyBoard> studyBoardList();

}
