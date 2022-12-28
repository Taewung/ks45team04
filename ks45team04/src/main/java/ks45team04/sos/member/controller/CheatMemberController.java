package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cheatMember")
public class CheatMemberController {
	@GetMapping("/cheatMemberRequest")
	public String cheatMemberRequest(Model model) {
		model.addAttribute("title", "부정 회원 심사 화면");
		return "member/cheatMember/cheat_member/request";
	}
}