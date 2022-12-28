package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/refund")
public class ARefundController {

	//환불 승인(수정)
	@GetMapping("/refundArroval")
	public String refundArroval(Model model) {
		model.addAttribute("title", "환불 승인(수정)");
		
		return "admin/refund/refund_approval";
	}
}

