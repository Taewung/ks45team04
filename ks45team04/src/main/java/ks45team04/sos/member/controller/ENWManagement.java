package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/enwManagement")
public class ENWManagement {

	@GetMapping("/examMain")
	public String examMain(Model model) {
		model.addAttribute("title", "시험관리메인화면");
		return "member/enwManagement/exam_main";
	}
	@GetMapping("/wrongAnswerMain")
	public String wrongAnswerMain(Model model) {
		model.addAttribute("title", "오답관리메인화면");
		return "member/enwManagement/wrong_answer_main";
	}
}
