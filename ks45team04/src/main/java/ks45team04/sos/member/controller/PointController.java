package ks45team04.sos.member.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.member.dto.MPointRefund;
import ks45team04.sos.member.dto.MPointSaveStandard;
import ks45team04.sos.member.dto.MPointSaveUse;
import ks45team04.sos.member.service.MPointRefundService;
import ks45team04.sos.member.service.MPointSaveStandardService;
import ks45team04.sos.member.service.MPointSaveUseService;



@Controller
public class PointController {

	private final MPointSaveUseService mPointSaveUseService;
	private final MPointSaveStandardService mPointSaveStandardService;
	private final MPointRefundService mPointRefundService;
	
	public PointController(MPointSaveUseService mPointSaveUseService,
							MPointSaveStandardService mpointSaveStandardService,
							MPointRefundService mPointRefundService) {
		
		this.mPointSaveUseService = mPointSaveUseService;
		this.mPointSaveStandardService = mpointSaveStandardService;
		this.mPointRefundService = mPointRefundService;
	}
	

	
	//포인트 적립 기준 조회
	@GetMapping("/mpointSaveStandardList")
	public String mpointSaveStandardList(Model model) {
		
		List<MPointSaveStandard> mPointSaveStandardList = mPointSaveStandardService.MPointSaveStandardList();
		
		model.addAttribute("title", "포인트 적립 기준 조회");
		model.addAttribute("mPointSaveStandardList", mPointSaveStandardList);
		
		return "member/point/mpoint_save_standard_list";
	}
	
	//포인트 수수료율 조회
	@GetMapping("/mpointFeeRateList")
	public String mpointFeeRateList(Model model) {
		model.addAttribute("title", "포인트 환급 수수료율 조회");
		
		return "member/point/mpoint_fee_rate_list";
	}
	
	//포인트 적립/사용 내역 조회
	@GetMapping("/saveUsePointList")
	public String saveUsePointList(Model model) {
		
		List<MPointSaveUse> mPointSaveUseList = mPointSaveUseService.MPointSaveUseList();
		
		model.addAttribute("title", "포인트 적립/사용 내역 조회");
		model.addAttribute("mPointSaveUseList", mPointSaveUseList);
		
		return "member/point/point_save_use_list";
	}
	
	//포인트 환급 신청 등록 처리
	@PostMapping("/pointRefundRequest")
	public String pointRefundRequest(MPointRefund mPointRefund) {
		mPointRefundService.addPointRefund(mPointRefund);
		
		return "redirect:/pointRefundList";
	}
	
	//포인트 환급 신청 등록 화면
	@GetMapping("/pointRefundRequest")
	public String pointRefundRequest(Model model) {
		
		model.addAttribute("title", "포인트 환급 신청(등록)");
		
		return "member/point/point_refund_request";
	}
	
	//포인트 환급 신청 내역 조회
	@GetMapping("/pointRefundList")
	public String pointRefundList(Model model) {
		
		List<MPointRefund> mPointRefundList = mPointRefundService.MPointRefundList();
				
		model.addAttribute("title", "포인트 환급 조회");
		model.addAttribute("mPointRefundList", mPointRefundList);
		
		
		return "member/point/point_refund_list";
	}
}
