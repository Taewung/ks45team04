package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberMainController {

	@GetMapping("/main")
	public String memberMain(Model model) {
		model.addAttribute("title", "메인화면");
		return "member/main";
	}
	@GetMapping("/myPage")
	public String myPage(Model model) {
		model.addAttribute("title", "메인화면");
		return "member/myPage";
	}
}