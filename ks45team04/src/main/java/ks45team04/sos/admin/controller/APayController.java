package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class APayController {
	
	//결제 취소(삭제)
	@GetMapping("/payDelete")
	public String payDelete(Model model) {
		model.addAttribute("title", "결제 취소(삭제)");
		
		return "admin/pay/pay_delete";
	}
	
	//결제 내역
	@GetMapping("/payList")
	public String payList(Model model) {
		model.addAttribute("title", "결제 내역");
		
		return "admin/pay/pay_list";
	}
}
