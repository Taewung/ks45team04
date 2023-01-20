package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.member.dto.AcceptanceReview;
import ks45team04.sos.member.dto.NotePurchaseReview;
import ks45team04.sos.member.service.AcceptanceReviewService;

@Controller
public class AcceptanceReviewController {
	
	private final AcceptanceReviewService acceptanceReviewService;
	
	public AcceptanceReviewController(AcceptanceReviewService acceptanceReviewService) {
		
		this.acceptanceReviewService = acceptanceReviewService;
	}
	
	
	
			// 합격자 리뷰 삭제 처리
			@PostMapping("/deleteAcceptance")
			public String deleteAcceptance(NotePurchaseReview NotePurchaseReview) {
								
				return "";
			}
							
			// 합격자 리뷰 삭제 화면
			@GetMapping("/deleteAcceptance")
			public String deleteAcceptance(Model model) {
				model.addAttribute("title", "노트 리뷰 수정");
									
				return "member/acceptacne/acceptance_review_delete";

			}
			
			// 합격자 리뷰 수정 처리
			@PostMapping("/modifyAcceptance")
			public String modifyAcceptance(NotePurchaseReview NotePurchaseReview) {
						
				return "";
			}
					
			// 합격자 리뷰 수정 화면
			@GetMapping("/modifyAcceptance")
			public String modifyAcceptance(Model model) {
				model.addAttribute("title", "노트 리뷰 수정");
							
				return "member/acceptacne/acceptance_review_modify";

			}

			
			// 합격자 리뷰 등록 처리
			@PostMapping("/addAcceptance")
			public String addAcceptance(NotePurchaseReview NotePurchaseReview) {
				
				return "";
			}
			
			// 합격자 리뷰 등록화면
				@GetMapping("/addAcceptance")
				public String addAcceptance(Model model) {
					model.addAttribute("title", "노트 리뷰 등록");
					
					return "member/acceptacne/acceptance_review_insert";

			}
				
				
			// 합격자 리뷰 상세조회
			@GetMapping("/AcceptanceDetail")
			public String AcceptanceDetail(Model model) {
				model.addAttribute("title", "노트 리뷰 상세보기");
				
				return "member/acceptacne/acceptance_review_detail";

			}
				
				
			// 합격자 리뷰 목록
			@GetMapping("/AcceptanceList")
			public String AcceptanceList(Model model
										,@RequestParam(value="searchKey", required = false) String searchKey
									    ,@RequestParam(value="searchValue", required = false) String searchValue) {
				
				List<AcceptanceReview> acceptanceReviewList = acceptanceReviewService.acceptanceReviewList(searchKey, searchValue);
				
				model.addAttribute("title", "판매노트 목록 조회");
				model.addAttribute("acceptanceReviewList", acceptanceReviewList);
				
				return "member/acceptacne/acceptance_review_list";

			}

}
