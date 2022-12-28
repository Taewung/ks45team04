package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pay")
public class PayController {
	
	//결제(등록)
	@GetMapping("/payInsert")
	public String payInsert(Model model) {
		model.addAttribute("title", "결제(등록)");
		
		return "member/pay/pay_insert";
	}
	//결제 내역 조회
	@GetMapping("/payList")
	public String payList(Model model) {
		model.addAttribute("title", "결제 내역 조회");
		
		return "member/pay/pay_list";
	}

}
