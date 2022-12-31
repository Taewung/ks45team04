package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PassMemberController {
	
	@GetMapping("/passMemberRequest")
	public String passMemberRequest(Model model) {
		model.addAttribute("title", "합격회원 인증 신청 화면");
		return  "member/passMember/pass_member_request";		
	}

	@GetMapping("/passMemberList")
	public String passMemberList(Model model) {
		model.addAttribute("title", "합격회원 승인 여부 조회 화면");
		return  "member/passMember/pass_member_list";		
	}	
	
	
}