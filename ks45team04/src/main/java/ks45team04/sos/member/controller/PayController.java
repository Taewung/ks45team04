package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ks45team04.sos.member.dto.MPay;
import ks45team04.sos.member.mapper.MPayMapper;
import ks45team04.sos.member.service.MPayService;

@Controller
public class PayController {
	
	private final MPayService mPayService;
	
	public PayController(MPayService mPayService,
						MPayMapper mPayMapper) {
		
		this.mPayService = mPayService;
	}
	
	//결제창(등록)
	@GetMapping("/payInsert")
	public String payInsert(Model model) {
		model.addAttribute("title", "결제(등록)");
		
		return "member/pay/pay_insert";
	}
	
	//결제 내역 조회
	@GetMapping("/mPayList")
	public String mPayList(Model model) {
		
		List<MPay> mPayList = mPayService.MPayList();
		
		model.addAttribute("title", "결제 내역 조회");
		model.addAttribute("mPayList",mPayList);
		
		return "member/pay/mpay_list";
	}
	
	//결제 내역 상세 조회
	@GetMapping("/payDetailList")
	public String payDetailList(Model model) {
		
		List<MPay> mPayList = mPayService.MPayList();
		
		model.addAttribute("title", "결제 내역 상세 조회");
		model.addAttribute("mPayList",mPayList);
		
		return "member/pay/pay_detail";
	}

}
