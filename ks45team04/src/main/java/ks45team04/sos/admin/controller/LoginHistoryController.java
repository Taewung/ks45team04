package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginHistoryController {

	@GetMapping("/totalLoginHistory")
	public String totalLoginHistory(Model model) {
		model.addAttribute("title", "전체 회원 로그인 /로그아웃 내역 조회");
		return  "admin/login/total_login_history";
	}
}