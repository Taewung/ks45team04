package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayController {
	
	//결제창(등록)
	@GetMapping("/payInsert")
	public String payInsert(Model model) {
		model.addAttribute("title", "결제(등록)");
		
		return "member/pay/pay_insert";
	}
	//결제 내역 조회
	@GetMapping("/mpayList")
	public String mpayList(Model model) {
		model.addAttribute("title", "결제 내역 조회");
		
		return "member/pay/mpay_list";
	}
	
	//결제 내역 상세 조회
	@GetMapping("/payDetail")
	public String payDetail(Model model) {
		model.addAttribute("title", "결제 내역 상세 조회");
		
		return "member/pay/pay_detail";
	}

}
