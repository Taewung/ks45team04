package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.LicenseMain;

@Controller
@RequestMapping("/admin")
public class ALicenseMainController {
	
	// 자격증 대분류 삭제 처리
		@PostMapping("/deletelicenseMain")
		public String deletelicenseMain(LicenseMain LicenseMain) {
			
			return "";
		}
	
	// 자격증 대분류 삭제 화면
	@GetMapping("/deletelicenseMain")
	public String deletelicenseMain(Model model) {
		model.addAttribute("title", "자격증 대분류 정보 수정");
		
		return "admin/licenseMain/license_main_delete";
	}
	
	
	// 자격증 대분류 수정 처리
	@PostMapping("/modifylicenseMain")
	public String modifylicenseMain(LicenseMain LicenseMain) {
		
		return "";
	}


	// 자격증 대분류 수정 화면
	@GetMapping("/modifylicenseMain")
	public String modifylicenseMain(Model model) {
		model.addAttribute("title", "자격증 대분류 정보 수정");
		
		return "admin/licenseMain/license_main_modify";
	}
	

	//자격증 대분류 등록 처리
	@PostMapping("/addlicenseMain")
	public String addlicenseMain(LicenseMain LicenseMain) {
		
		return "";
	}
	
	// 자격증 대분류 등록 화면
	@GetMapping("/addlicenseMain")
	public String addlicenseMain(Model model) {
		model.addAttribute("title", "자격증 대분류 정보 등록");
		
		return "admin/licenseMain/license_main_insert";
	}
	
	
	// 자격증 대분류 정보 조회
	@GetMapping("/licenseMainList")
	public String licenseMainList(Model model) {
		model.addAttribute("title", "자격증 대분류 조회");
		
		return "admin/licenseMain/license_main_list";
		
	}
	
	

}
