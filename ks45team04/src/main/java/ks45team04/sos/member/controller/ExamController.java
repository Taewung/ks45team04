package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.member.service.ExamService;

@Controller
public class ExamController {
	
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
	// 시험지생성화면
	@GetMapping("/addExamPaper")
	public String addExamPaper(Model model) {
		List<LicenseMain> licenseMainList  = examService.getLicenseMainList();
		model.addAttribute("licenseMainList", licenseMainList);
		model.addAttribute("title", "시험지생성");
		return "member/exam/add_exam_paper";
	}	
	// 중분류별 자격증목록 조회
	@GetMapping("/getLicenseCategoryForExam")
	@ResponseBody
	public List<LicenseInfo> getLicenseCategory(@RequestParam(value="lscCode") String lscCode){
		List<LicenseInfo> licenseList =  examService.getLicenseList(lscCode);
		return licenseList;
	}	
	// 대분류별 중분류 조회
	@GetMapping("/getLicenseSubCategoryForExam")
	@ResponseBody
	public List<LicenseSub> getLicenseSubCategory(@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> licenseSubList = examService.getLicenseSubList(lmcCode);
		return licenseSubList;
	}
}