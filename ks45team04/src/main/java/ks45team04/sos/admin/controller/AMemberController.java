package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AMemberController {
	
	@GetMapping("/memberList")
	public String memberList(Model model) {
		model.addAttribute("title", "회원 전체 정보 조회");
		return  "admin/adminMember/member_list";		
	}

	@GetMapping("/memberSavePoint")
	public String memberSavePoint(Model model) {
		model.addAttribute("title", "회원가입 포인트 지급");
		return  "admin/adminMember/member_save_point";		
	}	
	
	@GetMapping("/removeMember")
	public String removeMember(Model model) {
		model.addAttribute("title", "회원 삭제");
		return  "admin/adminMember/remove_member";		
	}		
	
}