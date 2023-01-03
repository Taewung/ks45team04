package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LicenseMainPageController {
	
	//자격증 메인페이지 
	@GetMapping("/licenseMain")
	public String licenseMain(Model model) {
		model.addAttribute("title", "장바구니 조회");
		
		return "member/licenseMainPage/license_main_page";
	}
}
