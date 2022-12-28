package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminPassMember")
public class APassMemberController {

	@GetMapping("/passMemberList")
	public String passMemberList(Model model) {
		model.addAttribute("title", "전체 합격 인증 멤버 조회");
				return "admin/passMember/pass_member";
	}
}
