package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LicenseDateController {
	
	// 자격증 일정 상세보기 화면
	@GetMapping("/licenseDateDetail")
	public String licenseDateDetail(Model model) {
		model.addAttribute("title", "자격증 일정 상세보기 화면");
						
		return "member/licenseDate/license_date_detail";
	}

}
