package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembershipController {
	
	@GetMapping("/membershipRequest")
	public String addMember(Model model) {
		model.addAttribute("title", "멤버십 신청");
		return  "member/member/membership_request";		
	}	

}