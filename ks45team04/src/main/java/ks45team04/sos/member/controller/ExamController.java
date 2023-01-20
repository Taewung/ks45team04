package ks45team04.sos.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.controller.QuestionSettingController;
import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.member.service.ExamService;

@Controller
public class ExamController {
	private static final Logger log = LoggerFactory.getLogger(QuestionSettingController.class);
	private final ExamService examService;
	
	public ExamController(ExamService examService) {
		this.examService = examService;
	}
	
	@GetMapping("/addExamAnswer")
	public String addExamAnswer(Model model) {
		model.addAttribute("title", "시험풀이");
		return "member/exam/add_exam_answer";
	}
	@GetMapping("/checkExamResult")
	public String checkExamResultList(Model model) {
		model.addAttribute("title", "응시결과상세조회");
		return "member/exam/check_exam_result";
	}
	@GetMapping("/examResultList")
	public String examResultList(Model model) {
		model.addAttribute("title", "응시결과목록");
		return "member/exam/exam_result_list";
	}
	// 중분류별 자격증목록 조회
	@GetMapping("/getLiListForExam")
	@ResponseBody
	public List<LicenseInfo> getLiListForExam (@RequestParam(value="lscCode") String lscCode){
		List<LicenseInfo> liListForExam = examService.getLiListForExam(lscCode);
		log.info("중분류별 자격증목록 조회 : {}", liListForExam);
		return liListForExam;
	}	
	// 대분류별 중분류 조회
	@GetMapping("/getSubListForExam")
	@ResponseBody
	public List<LicenseSub> getSubListForExam (@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> subListForExam = examService.getSubListForExam(lmcCode);
		log.info("대분류별 중분류목록 조회 : {}", subListForExam);
		return subListForExam;
	}
	// 시험지생성화면
	@GetMapping("/addExamPaper")
	public String addExamPaper(Model model) {
		List<LicenseMain> mainListForExam  = examService.getMainLisForExam();
		model.addAttribute("mainListForExam", mainListForExam);
		model.addAttribute("title", "시험지생성");
		log.info("대분류 목록조회 : {}", mainListForExam);
		return "member/exam/add_exam_paper";
	}	

}