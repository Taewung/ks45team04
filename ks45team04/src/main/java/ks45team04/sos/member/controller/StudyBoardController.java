package ks45team04.sos.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.controller.QuestionSettingController;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.member.dto.StudyBoard;
import ks45team04.sos.member.mapper.StudyBoardMapper;
import ks45team04.sos.member.service.StudyBoardService;

@Controller
public class StudyBoardController {
	private static final Logger log = LoggerFactory.getLogger(QuestionSettingController.class);
	private final StudyBoardService studyBoardService;
	private final StudyBoardMapper studyBoardMapper;
	
	public StudyBoardController(StudyBoardService studyBoardService
										,StudyBoardMapper studyBoardMapper) {
		
		this.studyBoardService = studyBoardService;
		this.studyBoardMapper = studyBoardMapper;
	}

	// 디데이 등록 코드별 이름
	@GetMapping("/getliNameForStudy")
	    @ResponseBody
	    public LicenseInfo getLiNameForStudy(@RequestParam(value="liCode") String liCode) {
		LicenseInfo liNameForStudy = studyBoardService.getLiNameForStudy(liCode);
	       
		log.info("디데이 등록 코드별 이름 : {}", liNameForStudy);
		
	        return liNameForStudy;
	    }

	//스터디 게시판 등록 처리
	@PostMapping("/addStudyBoard") 
	public String addStudyBoard(StudyBoard studyBoard) {
			
		studyBoardService.addStudyBoard(studyBoard);
		 
		log.info("스터디 게시판 등록 처리 : {}", studyBoard);
		return "redirect:/listStudyBoard";
	}
	
	//스터디 게시판 등록 화면
	@GetMapping("/addStudyBoard")
	public String addStudyBoard(Model model) {
	 List<LicenseInfo> liInfoForStudy = studyBoardService.getLiInfoForStudy();
	 model.addAttribute("liInfoForStudy", liInfoForStudy);
     model.addAttribute("title", "스터디게시판 등록");
     log.info("자격증 정보 목록 : {}", liInfoForStudy);	
	
		return "member/studyBoard/study_board_insert";
	}
	
	//스터디 게시판 리스트
	@GetMapping("/listStudyBoard")
		public String listStudyBoard(Model model) {
			List<StudyBoard> studyBoardList = studyBoardService.studyBoardList();
		
			model.addAttribute("title", "스터디게시판 조회");
			model.addAttribute("studyBoardList",studyBoardList);
			return "member/studyBoard/study_board_list";
		
	}
	
}
