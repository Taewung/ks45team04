package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks45team04.sos.member.dto.MPay;
import ks45team04.sos.member.dto.MRefund;
import ks45team04.sos.member.service.MPayService;
import ks45team04.sos.member.service.MRefundService;

@Controller
public class RefundController {
	
	private final MRefundService mRefundService;
	private final MPayService mPayService;
	
	public RefundController(MRefundService mRefundService,
							MPayService mPayService) {
		
		this.mRefundService = mRefundService;
		this.mPayService = mPayService;
	}
	
	//환불 신청 등록 처리
	@PostMapping("/refundRequest")
	public String refundRequest(MRefund mRefund) {
		
		//환불 신청 등록 코드 자동생성
		String newRefundCode = mRefundService.getMRefundCode("refundInfo", "refundCode");
		
		mRefund.setRefundCode(newRefundCode);
		mRefundService.refundRequest(mRefund);
		
		return "redirect:/refundList";
	}
	
	//환불 신청 등록 화면
	@GetMapping("/refundRequest")
	public String refundRequest(@RequestParam(value="payCompleteCode") String payCompleteCode,
								Model model) {
		
		MPay mPay = mPayService.getMPayByCode(payCompleteCode);
				
		model.addAttribute("title", "환불 신청(등록)");
		model.addAttribute("mPayInfo",mPay);
		
		return "member/refund/refund_request";
	}
	
	//환불 신청 내역 조회
	@GetMapping("/refundList")
	public String refundList(Model model) {
		
		List<MRefund> mRefundList = mRefundService.MRefundList();
		
		model.addAttribute("title", "환불 신청 내역 조회");
		model.addAttribute("mRefundList",mRefundList);
		
		return "member/refund/refund_list";
	}
}			