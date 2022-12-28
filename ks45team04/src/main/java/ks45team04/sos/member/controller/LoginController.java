package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login") //큰폴더명
public class LoginController {


	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "로그인");
		return  "member/login/login";
	}
	
	@GetMapping("/loginHistory")
	public String loginHistory(Model model) {
		model.addAttribute("title", "개인 회원 로그인 /로그아웃 내역 조회");
		return  "member/login/login_history";
	}
}