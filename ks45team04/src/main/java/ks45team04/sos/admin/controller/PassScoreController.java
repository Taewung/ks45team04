package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicensePassScore;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.service.LicensePassScoreService;

@Controller
public class PassScoreController {
	
	private final LicensePassScoreService licensePassScoreService;
	
	public PassScoreController(LicensePassScoreService licensePassScoreService) {
		this.licensePassScoreService = licensePassScoreService;
	}
	// 자격증별 합격기준점수 상세정보 조회
	@GetMapping("/checkLicensePassScore")
	public String checkLicensePassScore(Model model) {
		model.addAttribute("title", "자격증합격점수상세조회");
		return "admin/passScore/check_license_pass_score";
	}	
	// 자격증별 합격기준점수 수정
	@GetMapping("/modifyLicensePassScore")
	public String modifyLicensePassScore(Model model) {
		model.addAttribute("title", "자격증합격점수수정");
		return "admin/passScore/modify_license_pass_score";
	}
	// 자격증별 합격기준점수 등록
	@PostMapping("/addLicensePassScore")
	public String addLicensePassScore(LicensePassScore licensePassScore) {
		licensePassScoreService.addLicensePassScore(licensePassScore);
		return "redirect:/licensePassScoreList";		
	}
	// 자격증별 합격기준점수 등록
	@GetMapping("/addLicensePassScore")
	public String addLicensePassScore(Model model) {
		List<LicensePassScore> licensePassScoreList = licensePassScoreService.getLicensePassScoreList();
		List<LicenseMain> licenseMainList = licensePassScoreService.getLicenseMainList();
		model.addAttribute("licensePassScoreList", licensePassScoreList);
		model.addAttribute("licenseMainList", licenseMainList);
		model.addAttribute("title", "자격증합격점수등록");
		return "admin/passScore/add_license_pass_score";
	}
	// 중분류 조회
	@GetMapping("/getLicenseSubCategory")
	@ResponseBody
	public List<LicenseSub> getLicenseSubCategory (@RequestParam(value="lmcCode") String lmcCode){
		List<LicenseSub> licenseSubList = licensePassScoreService.getLicenseSubList(lmcCode);
		return licenseSubList;
	}	
	// 자격증 합격기준점수목록 조회
	@GetMapping("/licensePassScoreList")
	public String licensePassScoreList(Model model) {
		List<LicensePassScore> licensePassScoreList = licensePassScoreService.getLicensePassScoreList();		
		model.addAttribute("licensePassScoreList", licensePassScoreList);
		model.addAttribute("title", "자격증별 합격기준점수 목록");	
		return "admin/passScore/license_pass_score_list";
	}
}