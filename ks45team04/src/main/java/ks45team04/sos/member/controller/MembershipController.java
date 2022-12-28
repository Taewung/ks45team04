package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/membership") //큰폴더명
public class MembershipController {
	
	@GetMapping("/membershipRequest")
	public String membershipRequest(Model model) {
		model.addAttribute("title", "멤버십 신청 화면");
		return  "member/membership/membership_request";		
	}

	@GetMapping("/membershipPeriod")
	public String membershipPeriod(Model model) {
		model.addAttribute("title", "멤버십 남은 기간 확인 화면");
		return  "member/membership/membership_period";		
	}	
}