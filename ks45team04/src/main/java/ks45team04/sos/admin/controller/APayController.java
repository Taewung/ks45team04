package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.admin.dto.Pay;
import ks45team04.sos.admin.mapper.PayMapper;
import ks45team04.sos.admin.service.PayService;

@Controller
public class APayController {
	
	private final PayService payService;
	
	public APayController(PayService payService,
						  PayMapper payMapper) {
		
		this.payService = payService;
	}
	
	//결제 취소(삭제)
	@GetMapping("/payDelete")
	public String payDelete(Model model) {
		model.addAttribute("title", "결제 취소(삭제)");
		
		return "admin/pay/pay_delete";
	}
	
	//결제 내역 조회(검색)
	@GetMapping("/payList")
	public String payList(Model model
						 ,@RequestParam(value="searchKey", required = false) String searchKey
						 ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue){
		
		List<Pay> payList = payService.PayList(searchKey, searchValue);
		
		model.addAttribute("title", "결제 내역 조횐");
		model.addAttribute("payList",payList);
		
		return "admin/pay/pay_list";
	}
}
