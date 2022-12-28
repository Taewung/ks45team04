package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QnaQuestionController {

	@GetMapping("/qnaAnswerDetail")
	public String qnaAnswerDetail(Model model) {
		model.addAttribute("title", "문의답변상세");
		return "member/QnA/qna_answer_detail";
	}
	@GetMapping("/qnaAnswerList")
	public String addExamAnswer(Model model) {
		model.addAttribute("title", "문의답변목록");
		return "member/QnA/qna_answer_list";
	}
	@GetMapping("/qnaQuestionInsert")
	public String qnaQuestionInsert(Model model) {
		model.addAttribute("title", "문의등록");
		return "member/QnA/qna_question_insert";
	}
	@GetMapping("/qnaQuestionModify")
	public String qnaQuestionModify(Model model) {
		model.addAttribute("title", "문의수정");
		return "member/QnA/qna_question_modify";
	}
}
