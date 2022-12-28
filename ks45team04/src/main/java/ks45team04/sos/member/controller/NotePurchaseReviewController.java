package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.member.dto.NotePurchaseReview;



@Controller
public class NotePurchaseReviewController {
	
		
		// 노트 리뷰 삭제 처리
		@PostMapping("/deletenotePurchaseReview")
		public String deletenotePurchaseReview(NotePurchaseReview NotePurchaseReview) {
							
			return "";
		}
						
		// 노트 리뷰 삭제 화면
		@GetMapping("/deletenotePurchaseReview")
		public String deletenotePurchaseReview(Model model) {
			model.addAttribute("title", "노트 리뷰 수정");
								
			return "member/noteDownloadPurchaseReview/note_purchase_review_delete";

		}
		
		// 노트 리뷰 수정 처리
		@PostMapping("/modifynotePurchaseReview")
		public String modifynotePurchaseReview(NotePurchaseReview NotePurchaseReview) {
					
			return "";
		}
				
		// 노트 리뷰 수정 화면
		@GetMapping("/modifynotePurchaseReview")
		public String modifynotePurchaseReview(Model model) {
			model.addAttribute("title", "노트 리뷰 수정");
						
			return "member/noteDownloadPurchaseReview/note_purchase_review_modify";

		}

		
		// 노트 리뷰 등록 처리
		@PostMapping("/addnotePurchaseReview")
		public String addnotePurchaseReview(NotePurchaseReview NotePurchaseReview) {
			
			return "";
		}
		
		// 노트 리뷰 등록 화면
			@GetMapping("/addnotePurchaseReview")
			public String addnotePurchaseReview(Model model) {
				model.addAttribute("title", "노트 리뷰 등록");
				
				return "member/noteDownloadPurchaseReview/note_purchase_review_insert";

		}
			
			
		// 노트 리뷰 상세보기 조회
		@GetMapping("/purchaseReviewDetail")
		public String purchaseReviewDetail(Model model) {
			model.addAttribute("title", "노트 리뷰 상세보기");
			
			return "member/noteDownloadPurchaseReview/note_purchase_review_detail";

		}
			
			
		// 노트 리뷰 목록 조회
		@GetMapping("/purchaseReviewList")
		public String purchaseReviewList(Model model) {
			model.addAttribute("title", "판매노트 목록 조회");
			
			return "member/noteDownloadPurchaseReview/note_purchase_review_list";

		}
	
	

}
