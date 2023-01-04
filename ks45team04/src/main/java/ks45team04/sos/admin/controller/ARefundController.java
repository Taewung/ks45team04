package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

	
	
	//환불 승인(수정)
	@GetMapping("/refundApproval")
	public String refundApproval(Model model) {
		
		List<Refund> refundList = refundService.RefundList();
		
		model.addAttribute("title", "환불 승인(수정)");
		model.addAttribute("refundList", refundList);
		
		return "admin/refund/refund_approval";
	}
}

