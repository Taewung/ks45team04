package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.admin.dto.QnaAnswer;
import ks45team04.sos.admin.service.QnaAnswerService;

@Controller
public class AQnaAnswerController {
	
	private final QnaAnswerService qnaAnswerService;
	
	public AQnaAnswerController(QnaAnswerService qnaAnswerService) {
		this.qnaAnswerService = qnaAnswerService;
	}
	
		
	
		// qna 답변 삭제 처리
		@PostMapping("/deleteQnaAnswer")
		public String deleteQnaAnswer(QnaAnswer QnaAnswer) {
			
			return "";
		}
		
		// qna 답변 삭제 화면
		@GetMapping("/deleteQnaAnswer")
		public String deleteQnaAnswer(Model model) {
			model.addAttribute("title", "qna 답변 삭제");
				
			return "admin/QnA/qna_answer_delete";
		}
	
	
	
		// qna 답변 수정 처리
		@PostMapping("/modifyQnaAnswer")
		public String modifyQnaAnswer(QnaAnswer QnaAnswer) {
			
			return "";
		}
		
		// qna 답변 수정 화면
		@GetMapping("/modifyQnaAnswer")
		public String modifyQnaAnswer(Model model) {
			model.addAttribute("title", "qna 답변 수정");
				
			return "admin/QnA/qna_answer_modify";
		}

	
		// qna 답변 등록 처리
		@PostMapping("/addQnaAnswer")
		public String addQnaAnswer(QnaAnswer QnaAnswer) {
			
			return "";
		}

		// qna 답변 등록 화면
		@GetMapping("/addQnaAnswer")
		public String addQnaAnswer(Model model) {
			model.addAttribute("title", "qna 답변 등록");
			
			return "admin/QnA/qna_answer_insert";
		}
		
		// qna 질문 목록 조회
				@GetMapping("/QnaQuestionList")
				public String QnaQuestionList(Model model) {
					
				List<QnaAnswer> qnaAnswerList = qnaAnswerService.QnaAnswerList();
				
					model.addAttribute("title", "qna 질문 조회");
					model.addAttribute("qnaAnswerList", qnaAnswerList);
					
					return "admin/QnA/qna_question.list";
				}

}