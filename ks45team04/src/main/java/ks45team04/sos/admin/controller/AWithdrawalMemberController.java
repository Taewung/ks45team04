package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/withdrawalMember") //큰폴더명
public class AWithdrawalMemberController {

	@GetMapping("/withdrawalMemberList")
	public String withdrawalMemberList(Model model) {
		model.addAttribute("title", "전체 회원 목록");
		return  "admin/withdrawalMember/withdrawal_member_list";
	}
	
	
}
