package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.member.dto.MRefund;
import ks45team04.sos.member.service.MRefundService;

@Controller
public class RefundController {
	
	private final MRefundService mRefundService;
	
	public RefundController(MRefundService mRefundService) {
		
		this.mRefundService = mRefundService;
	}
	
	//환불 신청(등록)
	@GetMapping("/refundRequest")
	public String refundRequest(Model model) {
		model.addAttribute("title", "환불 신청(등록)");
		
		return "member/refund/refund_request";
	}
	
	//환불 신청 내역 조회
	@GetMapping("/refundList")
	public String refundList(Model model) {
		
		List<MRefund> mRefundList = mRefundService.MRefundList();
		
		model.addAttribute("title", "환불 신청 내역 조회");
		model.addAttribute("mRefundList",mRefundList);
		
		return "member/refund/refund_list";
	}
}			