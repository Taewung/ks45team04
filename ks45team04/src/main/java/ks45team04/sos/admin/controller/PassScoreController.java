package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.service.LicensePassScoreService;

@Controller
public class PassScoreController {

	@GetMapping("/addLicensePassScore")
	public String addLicensePassScore(Model model) {
		model.addAttribute("title", "자격증합격점수등록");
		return "admin/passScore/add_license_pass_score";
	}	
	@GetMapping("/checkLicensePassScore")
	public String checkLicensePassScore(Model model) {
		model.addAttribute("title", "자격증합격점수상세조회");
		return "admin/passScore/check_license_pass_score";
	}		
	@GetMapping("/modifyLicensePassScore")
	public String modifyLicensePassScore(Model model) {
		model.addAttribute("title", "자격증합격점수수정");
		return "admin/passScore/modify_license_pass_score";
	}	

	@GetMapping("/licensePassScoreList")
	public String licensePassScoreList(Model model) {

		
		
		return "admin/passScore/license_pass_score_list";
	}
	
	
}
