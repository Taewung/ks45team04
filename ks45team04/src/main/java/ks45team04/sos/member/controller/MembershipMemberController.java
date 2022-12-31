package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembershipMemberController {

	@GetMapping("/totalMembershipRequest")
	public String totalMembershipRequest(Model model) {
		model.addAttribute("title", "멤버십 신청");
		return  "member/membershipMember/total_membership_request";
	}
	
	@GetMapping("/membershipPeriod")
	public String membershipPeriod(Model model) {
		model.addAttribute("title", "개인 멤버십 남은 기간 조회");
		return  "member/membershipMember/membership_period";
	}
		
	
}
