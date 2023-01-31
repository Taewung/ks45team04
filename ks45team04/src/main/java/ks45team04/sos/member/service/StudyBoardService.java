package ks45team04.sos.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.StudyBoard;
import ks45team04.sos.member.mapper.StudyBoardMapper;

@Service
public class StudyBoardService {

	private final StudyBoardMapper studyBoardMapper;
	
	public StudyBoardService(StudyBoardMapper studyBoardMapper) {
		this.studyBoardMapper = studyBoardMapper;
	}
	
	/**
	 * 스터디 등록을 위한 노트 코드별 노트이름 조회
	 * @param liCode
	 * @return
	 */
	public LicenseInfo getLiNameForStudy(String liCode) {
		LicenseInfo liNameForStudy = studyBoardMapper.getLiNameForExam(liCode);
		return liNameForStudy;
	}
	
	   /**
	    *  스터디 등록을 위한 자격증 정보 목록조회
	    * @return
	    */
		public List<LicenseInfo> getLiInfoForStudy() {
		
			List<LicenseInfo> liInfoForStudy = studyBoardMapper.getLiInfoForStudy();
		
		return liInfoForStudy;		
	}
	
	/**
	 * 스터데 게시판 등록
	 * @param studyBoard
	 * @return
	 */
	public int addStudyBoard(StudyBoard studyBoard) {
		
		return studyBoardMapper.addStudyBoard(studyBoard);
	}
	
	/**
	 * 스터디 게시판 리스트
	 * @return
	 */
	public List<StudyBoard> studyBoardList(){
		List<StudyBoard> studyBoardList = studyBoardMapper.studyBoardList();
		
		return studyBoardList;
	}
	
}
