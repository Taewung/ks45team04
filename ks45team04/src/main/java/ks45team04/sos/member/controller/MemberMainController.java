package ks45team04.sos.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginInfo;

@Controller
public class MemberMainController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberMainController.class);
	
	@GetMapping("/main")
	public String memberMain(Model model, HttpSession session) {
		model.addAttribute("title", "메인화면");
		LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
		log.info("login info : {} ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", loginInfo);
		return "member/main";
	}
	@GetMapping("/myPage")
	public String myPage(Model model) {
		model.addAttribute("title", "메인화면");
		return "member/myPage";
	}
	@GetMapping("/customerCenter")
	public String customerCenter(Model model) {
		model.addAttribute("title", "고객센터");
		return "member/customerCenter";
	}
}