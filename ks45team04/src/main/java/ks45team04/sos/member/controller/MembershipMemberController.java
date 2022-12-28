package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/membershipMember") //큰폴더명
public class MembershipMemberController {

	@GetMapping("/membershipRequest")
	public String membershipRequest(Model model) {
		model.addAttribute("title", "멤버십 신청");
		return  "member/membershipMember/membership_request";
	}
	
	@GetMapping("/membershipPeriod")
	public String membershipPeriod(Model model) {
		model.addAttribute("title", "개인 멤버십 남은 기간 조회");
		return  "member/membershipMember/membership_period";
	}
		
}
