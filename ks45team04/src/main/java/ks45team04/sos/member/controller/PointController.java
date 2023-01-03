package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PointController {

	//포인트 적립 기준 조회
	@GetMapping("/mpointSaveStandardList")
	public String mpointSaveStandardList(Model model) {
		model.addAttribute("title", "포인트 적립 기준 조회");
		
		return "member/point/mpoint_save_standard_list";
	}
	
	//포인트 환급 수수료율 조회
	@GetMapping("/mpointFeeRateList")
	public String mpointFeeRateList(Model model) {
		model.addAttribute("title", "포인트 환급 수수료율 조회");
		
		return "member/point/mpoint_fee_rate_list";
	}
	
	//포인트 적립/사용 내역 조회
	@GetMapping("/saveUsePointList")
	public String saveUsePointList(Model model) {
		model.addAttribute("title", "포인트 적립/사용 내역 조회");
		
		return "member/point/point_save_use_list";
	}
	
	//포인트 환급 신청(등록)
	@GetMapping("/pointRefundRequest")
	public String pointRefundRequest(Model model) {
		model.addAttribute("title", "포인트 환급 신청(등록)");
		
		return "member/point/point_refund_request";
	}
	//포인트 환급 조회
	@GetMapping("/pointRefundList")
	public String pointRefundList(Model model) {
		model.addAttribute("title", "포인트 환급 조회");
		
		return "member/point/point_refund_list";
	}
}
