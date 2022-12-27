package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/addexamType")
public class ExamTypeController {

	@GetMapping("/addExamType")
	public String addEnamType(Model model) {
		model.addAttribute("title", "시험유형등록");
		return "member/examType/add_exam_type";
	}	
}
