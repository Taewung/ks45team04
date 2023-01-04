package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.service.LicensePassScoreService;

@Controller
public class PassScoreController {
	
	private final LicensePassScoreService licensePassScoreService;
	
	public PassScoreController(LicensePassScoreService licensePassScoreService) {
		this.licensePassScoreService = licensePassScoreService;
	}

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

	// 자격증별 합격기준점수 목록
	@GetMapping("/licensePassScoreList")
	public String licensePassScoreList(Model model) {
		List<LicensePassScore> licensePassScoreList = licensePassScoreService.getLicensePassScoreList();		
		model.addAttribute("licensePassScoreList", licensePassScoreList);
		model.addAttribute("title", "자격증별 합격기준점수 목록");	
		return "admin/passScore/license_pass_score_list";
	}
}
