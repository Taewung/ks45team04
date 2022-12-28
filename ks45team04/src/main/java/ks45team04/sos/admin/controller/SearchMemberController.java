package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/searchMember") //큰폴더명
public class SearchMemberController {
	
	@GetMapping("/searchMember")
	public String searchMember(Model model) {
		model.addAttribute("title", "회원 정보 검색");
		return  "admin/search/search_member";		
	}
	
}