package ks45team04.sos.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseSubjectController {
	
	// 자격증 과목 상세보기 화면
		@GetMapping("/licenseSubjectDetail")
		public String licenseSubjectDetail(Model model) {
			model.addAttribute("title", "자격증 과목 상세보기 화면");
					
			return "member/licenseSubject/license_subject_detail.html";
		}
	
	

}
