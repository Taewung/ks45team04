package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QnaAnswerController {
	
	@GetMapping("/qnaAnswerInsert")
	public String qnaAnswerInsert(Model model) {
		model.addAttribute("title", "문의답변등록");
		return "admin/QnA/qna_answer_insert";
	}
	@GetMapping("/qnaAnswerModify")
	public String qnaAnswerModify(Model model) {
		model.addAttribute("title", "문의답변수정");
		return "admin/QnA/qna_answer_modify";
	}
}
