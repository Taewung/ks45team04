package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class APassMemberController {

	@GetMapping("/totalPassMemberList")
	public String totalPassMemberList(Model model) {
		model.addAttribute("title", "전체 합격 인증 멤버 조회");
				return "admin/passMember/total_pass_member_list";
	}
	
	@GetMapping("/passMemberJudge")
	public String passMemberJudge(Model model) {
		model.addAttribute("title", "합격 인증 신청 회원 심사");
				return "admin/passMember/pass_member_judge";
	}
}
