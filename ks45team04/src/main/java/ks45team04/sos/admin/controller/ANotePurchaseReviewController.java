package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ANotePurchaseReviewController {
	
	@GetMapping("/notePurchaseReviewDelete")
	public String notePurchaseReviewDelete(Model model) {
		model.addAttribute("title", "노트구매리뷰삭제");
		return "admin/noteDownloadPurchaseReview/note_purchase_review_delete";
	}
	@GetMapping("/notePurchaseReviewDetail")
	public String notePurchaseReviewDetail(Model model) {
		model.addAttribute("title", "노트구매리뷰상세");
		return "admin/noteDownloadPurchaseReview/note_purchase_review_detail";
	}
	@GetMapping("/notePurchaseReviewInsert")
	public String notePurchaseReviewInsert(Model model) {
		model.addAttribute("title", "노트구매리뷰등록");
		return "admin/noteDownloadPurchaseReview/note_purchase_review_insert";
	}
	@GetMapping("/notePurchaseReviewList")
	public String notePurchaseReviewList(Model model) {
		model.addAttribute("title", "노트구매리뷰목록");
		return "admin/noteDownloadPurchaseReview/note_purchase_review_list";
	}
	@GetMapping("/notePurchaseReviewModify")
	public String notePurchaseReviewModify(Model model) {
		model.addAttribute("title", "노트구매리뷰수정");
		return "admin/noteDownloadPurchaseReview/note_purchase_review_modify";
	}
}
