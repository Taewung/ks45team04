package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ARefundController {

	//환불 승인(수정)
	@GetMapping("/refundApproval")
	public String refundApproval(Model model) {
		model.addAttribute("title", "환불 승인(수정)");
		
		return "admin/refund/refund_approval";
	}
}

