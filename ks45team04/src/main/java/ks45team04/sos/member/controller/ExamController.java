package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamController {

	@GetMapping("/addExamAnswer")
	public String addExamAnswer(Model model) {
		model.addAttribute("title", "시험풀이");
		return "member/exam/add_exam_answer";
	}
	@GetMapping("/addExamPaper")
	public String addExamPaper(Model model) {
		model.addAttribute("title", "시험지생성");
		return "member/exam/add_exam_paper";
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
}
