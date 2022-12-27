package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/examType")
public class ExamTypeController {

	@GetMapping("/addExamType")
	public String addExamType(Model model) {
		model.addAttribute("title", "시험유형등록");
		return "admin/examType/add_exam_type";
	}	
	@GetMapping("/checkExamType")
	public String checkExamType(Model model) {
		model.addAttribute("title", "시험유형상세정보");
		return "admin/examType/check_exam_type";
	}	
	@GetMapping("/examTypeList")
	public String examTypeList(Model model) {
		model.addAttribute("title", "시험유형목록");
		return "admin/examType/exam_type_list";
	}	
	@GetMapping("/modifyExamType")
	public String modifyExamType(Model model) {
		model.addAttribute("title", "시험유형수정");
		return "admin/examType/modify_exam_type";
	}	
}
