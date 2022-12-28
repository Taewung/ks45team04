package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.admin.dto.LicenseInfo;

@Controller
public class ALicenseInfoController {
		
		// 자격증 정보 삭제 처리
			@PostMapping("/deletelicenseInfo")
			public String deletelicenseInfo(LicenseInfo LicenseInfo) {
				
				return "";
			}
		
		// 자격증 정보 삭제 화면
		@GetMapping("/deletelicenseInfo")
		public String deletelicenseInfo(Model model) {
			model.addAttribute("title", "자격증 대분류 정보 수정");
			
			return "admin/licenseInfo/license_info_delete";
		}
	
	
		//자격증 정보 수정 처리
		@PostMapping("/modifylicenseInfo")
		public String modifylicenseInfo(LicenseInfo LicenseInfo) {
				
			return "";
		}
			
		// 자격증 정보 수정 화면
		@GetMapping("/modifylicenseInfo")
		public String modifylicenseInfo(Model model) {
			model.addAttribute("title", "자격증 정보 수정");
				
			return "admin/licenseInfo/license_info_modify";
		}
		
		//자격증 정보 등록 처리
		@PostMapping("/addlicenseInfo")
		public String addlicenseInfo(LicenseInfo LicenseInfo) {
			
			return "";
		}
		
		// 자격증 정보 등록 화면
		@GetMapping("/addlicenseInfo")
		public String addlicenseInfo(Model model) {
			model.addAttribute("title", "자격증 정보 등록");
			
			return "admin/licenseInfo/license_info_insert";
		}
		
		// 자격증 정보 조회
		@GetMapping("/licenseInofoList")
		public String licenseInofoList(Model model) {
			model.addAttribute("title", "자격증 정보 조회");
					
			return "admin/licenseInfo/license_info_list";
		}

}