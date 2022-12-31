package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RefundController {
	
	//환불 신청(등록)
	@GetMapping("/refundRequest")
	public String refundRequest(Model model) {
		model.addAttribute("title", "환불 신청(등록)");
		
		return "member/refund/refund_request";
	}
	
	//환불 조회
	@GetMapping("/refundList")
	public String refundList(Model model) {
		model.addAttribute("title", "환불 조회");
		
		return "member/refund/refund_list";
	}
}			