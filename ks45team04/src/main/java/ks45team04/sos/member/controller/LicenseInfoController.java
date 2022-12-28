package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseInfoController {

	// 자격증 정보 상세보기 화면
	@GetMapping("/licenseInfoDetail")
	public String licenseInfoDetail(Model model) {
		model.addAttribute("title", "자격증 상세보기 화면 조회");
				
		return "member/licenseInfo/license_info_detail";
	}
}
