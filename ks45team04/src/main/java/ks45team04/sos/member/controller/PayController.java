package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginInfo;
import ks45team04.sos.member.dto.MPay;
import ks45team04.sos.member.dto.Note;
import ks45team04.sos.member.mapper.MNoteMapper;
import ks45team04.sos.member.mapper.MPayMapper;
import ks45team04.sos.member.service.MNoteService;
import ks45team04.sos.member.service.MPayService;

@Controller
public class PayController {
	
	private final MPayService mPayService;
	private final MPayMapper mpayMapper;
	
	private final MNoteService mNoteService;
	private final MNoteMapper mNoteMapper;
	
	
	public PayController(MPayService mPayService, MPayMapper mpayMapper,
						MNoteService mNoteService, MNoteMapper mNoteMapper) {
		
		this.mNoteMapper = mNoteMapper;
		this.mNoteService = mNoteService;
		this.mpayMapper = mpayMapper;
		this.mPayService = mPayService;
		
	}
	
	//결제창 처리
	@PostMapping("/payInsert")
	public String payInsert(MPay mPay, HttpSession session) {
		System.out.println(mPay + "mPay~~~~~~~~~~~~~~~~~~~");
		
		String loginId = (String) session.getAttribute("SID");
		
		mPay.setPayId(loginId);
		
		mPayService.notePayInsert(mPay);
		
		return "redirect:/noteList";
		
	}
	
	//결제창 화면
	@GetMapping("/payInsert")
	public String payInsert(@RequestParam(value="noteWriterId") String noteWriterId
							,Model model) {
		Note note = mNoteService.getNoteById(noteWriterId);
		
		String totalPrice = note.getNotePrice().substring(0,  note.getNotePrice().length() - 1);
		note.setNotePrice(totalPrice);
		
		model.addAttribute("noteInfo", note);
		
		return "member/pay/pay_insert";
			
	}
	

	//결제 내역 상세 조회
	@GetMapping("/payDetailList")
	public String payDetailList(@RequestParam(value="payCompleteCode")String payCompleteCode
								,Model model) {
		
		MPay mPay = mPayService.getMPayByCode(payCompleteCode);
		
		model.addAttribute("title", "결제 내역 상세 조회");
		model.addAttribute("mPayInfo",mPay);
		
		return "member/pay/pay_detail";
	}
	
	//결제 내역 조회
	@GetMapping("/mPayList")
	public String mPayList(Model model) {
		
		List<MPay> mPayList = mPayService.MPayList();
		
		model.addAttribute("title", "결제 내역 조회");
		model.addAttribute("mPayList",mPayList);
		
		return "member/pay/mpay_list";
	}

}
