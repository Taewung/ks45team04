package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class LoginHistoryController {

	@GetMapping("/loginHistory")
	public String loginHistory(Model model) {
		model.addAttribute("title", "전체 회원 로그인 /로그아웃 내역 조회");
		return  "admin/login/login_history";
	}
}