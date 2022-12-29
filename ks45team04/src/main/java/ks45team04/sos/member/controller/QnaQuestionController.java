package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.member.dto.Qnaquestion;




@Controller
public class QnaQuestionController {

	
			// qna 질문 삭제 처리
			@PostMapping("/deleteQnaQuestion")
			public String deleteQnaQuestion(Qnaquestion Qnaquestion) {
				
				return "";
			}
			
			// qna 질문 삭제 화면
			@GetMapping("/deleteQnaQuestion")
			public String deleteQnaQuestion(Model model) {
				model.addAttribute("title", "qna 질문 삭제");
					
				return "member/QnA/qna_question_delete";
			}
		
		
		
			// qna 질문 수정 처리
			@PostMapping("/modifyQnaQuestion")
			public String modifyQnaQuestion(Qnaquestion Qnaquestion) {
				
				return "";
			}
			
			// qna 질문 수정 화면
			@GetMapping("/modifyQnaQuestion")
			public String modifyQnaQuestion(Model model) {
				model.addAttribute("title", "qna 질문 수정");
					
				return "member/QnA/qna_question_modify";
			}

		
			// qna 질문 등록 처리
			@PostMapping("/addQnaQuestionAnswer")
			public String addQnaQuestionAnswer(Qnaquestion Qnaquestion) {
				
				return "";
			}

			// qna 질문 등록 화면
			@GetMapping("/addQnaQuestionAnswer")
			public String addQnaQuestionAnswer(Model model) {
				model.addAttribute("title", "qna 질문 등록");
				
				return "member/QnA/qna_question_insert";
			}
		
			
			// qna 질문 상세보기 화면
			@GetMapping("/qnaQuestionDetail")
			public String qnaQuestionDetail(Model model) {
				model.addAttribute("title", "qna 질문 상세보기");
					
				return "member/QnA/qna_question_detail";
					
				}
			
			// qna 질문 목록 조회
			@GetMapping("/qnaQuestionList")
			public String qnaQuestionList(Model model) {
				model.addAttribute("title", "qna 질문 목록 조회");
				
				return "member/QnA/qna_question_list";
		
			}
}
