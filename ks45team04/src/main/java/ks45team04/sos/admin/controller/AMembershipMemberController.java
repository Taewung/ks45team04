package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/membershipMember") //큰폴더명
public class AMembershipMemberController {

	@GetMapping("/totalMembershipPeriod")
	public String membershipPeriod(Model model) {
		model.addAttribute("title", "전체 회원 멤버십 남은 기간 조회");
		return  "admin/membershipMember/total_membership_period";
	}
	
	
}
