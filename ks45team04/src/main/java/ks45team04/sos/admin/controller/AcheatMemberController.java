package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AcheatMemberController {

	
	@GetMapping("/cheatMemberList")
	public String cheatMemberList(Model model) {
		model.addAttribute("title", "부정 회원 조회");
		return  "admin/cheatMember/cheat_member_list";
	}	
	
	@GetMapping("/cheatMemberJudge")
	public String cheatMemberJudge(Model model) {
		model.addAttribute("title", "부정 회원 심사");
		return  "admin/cheatMember/cheat_member_judge";		
	}
}