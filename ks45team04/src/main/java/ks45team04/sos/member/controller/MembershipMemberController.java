package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MembershipMemberController {

	@GetMapping("/totalMembershipRequest")
	public String totalMembershipRequest(Model model) {
		model.addAttribute("title", "멤버십 신청");

		return  "membershipMember/membership_request";


	}
	
	@GetMapping("/membershipPeriod")
	public String membershipPeriod(Model model) {
		model.addAttribute("title", "개인 멤버십 남은 기간 조회");
		return  "membershipMember/membership_period";
	}
		
	
}
