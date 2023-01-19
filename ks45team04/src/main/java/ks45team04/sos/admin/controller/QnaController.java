package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.admin.dto.Qna;
import ks45team04.sos.admin.mapper.AQnaMapper;
import ks45team04.sos.admin.service.AQnaService;

@Controller
public class QnaController {
	
	private final AQnaService aqnaService;
	private final AQnaMapper aqnaMapper;
	
	public QnaController(AQnaService aqnaService
						 ,AQnaMapper aqnaMapper) {
		
		this.aqnaService = aqnaService;
		this.aqnaMapper = aqnaMapper;
	}
	
	
		// qna 답변 삭제 처리
		@PostMapping("/deleteQnaAnswer")
		public String deleteQnaAnswer(Qna qna) {
			
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
		public String modifyQnaAnswer(Qna qna) {
			
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
		public String addQnaAnswer(Qna qna) {
			
			return "";
		}

		// qna 답변 등록 화면
		@GetMapping("/addQnaAnswer")
		public String addQnaAnswer(Model model) {
			
			model.addAttribute("title", "qna 질문 등록");
			
			return "admin/QnA/qna_answer_insert";
		}
		
		
		
		// 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문 질문
		
		
		
		// qna 질문 삭제 처리
		@PostMapping("/deleteQnaQuestion")
		public String deleteQnaQuestion(Qna qna) {
			
			return "";
		}
		
		// qna 질문 삭제 화면
		@GetMapping("/deleteQnaQuestion")
		public String deleteQnaQuestion(Model model) {
			model.addAttribute("title", "qna 질문 삭제");
				
			return "admin/QnA/qna_question_delete";
		}
	
	
	
		// qna 질문 수정  처리	
		@PostMapping("/modifyQnaQuestion")
		public String modifyQnaQuestion(Qna qna) {
			
			aqnaService.modifyQna(qna);
			
			System.out.println(qna);
			
			return "redirect:/QnaQuestionList";
		}
		
		
		// qna 질문 수정 화면
		@GetMapping("/modifyQnaQuestion")
		public String modifyQnaQuestion(@RequestParam(value="qnaCode") String qnaCode
										,Model model) {
			
			Qna qna = aqnaMapper.getQnaByCode(qnaCode);
			System.out.println(qna);
							
			model.addAttribute("title", "qna 질문 수정");
			model.addAttribute("qna",qna);
			
			return "admin/QnA/qna_question_modify";
		}
		

	
		// qna 질문 등록 처리
		@PostMapping("/addQnaQuestion")
		public String addQnaQuestion(Qna qna) {
			
			aqnaService.addQnaQuestion(qna);
			
			return "redirect:/main";
		}

		// qna 질문 등록 화면
		@GetMapping("/addQnaQuestion")
		public String addQnaQuestion(Model model) {
			
			List<Qna> QnaList = aqnaMapper.QnaList();
			
			model.addAttribute("title", "qna 질문 등록");
			model.addAttribute("QnaList", QnaList);
			
			return "admin/QnA/qna_question_insert";
		}
	
		// qna 질문 상세보기 화면
		@GetMapping("/qnaQuestionDetail")
		public String qnaQuestionDetail(Model model) {
			model.addAttribute("title", "qna 질문 상세보기");
			
			return "admin/QnA/qna_question_detail";
			
		}
		

		// qna 질문 및 답변 목록 조회
				@GetMapping("/QnaQuestionList")
				public String QnaList(Model model) {
					
				List<Qna> QnaList = aqnaService.QnaList();
				
				
					model.addAttribute("title", "qna 질문 조회");
					model.addAttribute("QnaList", QnaList);
					
					return "admin/QnA/qna_question.list";
				}

}