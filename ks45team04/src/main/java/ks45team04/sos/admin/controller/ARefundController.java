package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.admin.dto.Refund;
import ks45team04.sos.admin.mapper.RefundMapper;
import ks45team04.sos.admin.service.RefundService;

@Controller
public class ARefundController {

	private final RefundService refundService;
	public ARefundController(RefundService refundService,
							RefundMapper refundMapper) {
		
		this.refundService = refundService;
	}

	//환불 승인 수정 처리
	@PostMapping("/modifyRefundApproval")
	public String modifyRefundApproval(Refund refund) {
		
		refundService.modifyRefundApproval(refund);
		
		return "redirect:/refundApproval";
	}
	
	//환불 승인 수정 화면
	@GetMapping("/modifyRefundApproval")
	public String modifyRefundApproval(@RequestParam(value="refundCode", required = false) String refundCode,
									   Model model) {
		Refund refund = refundService.getRefundInfoByCode(refundCode);
		
		model.addAttribute("title", "환불 승인 수정");
		model.addAttribute("refundInfo",refund);
		
		return "admin/refund/refund_approval_modify";
	}
	
	//환불 신청 내역 조회
	@GetMapping("/refundApproval")
	public String refundApproval(Model model) {
		
		List<Refund> refundList = refundService.RefundList();
		
		model.addAttribute("title", "환불 신청 내역 조회");
		model.addAttribute("refundList", refundList);
		
		return "admin/refund/refund_approval";
	}
}

