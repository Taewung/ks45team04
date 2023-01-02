package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.service.LicenseSubService;

@Controller
public class ALicenseSubController {
	
private final LicenseSubService licenseSubService;

	public ALicenseSubController(LicenseSubService licenseSubService) {
		this.licenseSubService = licenseSubService;
	}
	
	
		// 자격증 중분류 정보 삭제 처리
		@PostMapping("/deletelicenseSub")
		public String deletelicenseSub(LicenseSub LicenseSub) {
				
		return "";
		}
			
			
		// 자격증 중분류 정보 삭제 화면
		@GetMapping("/deletelicenseSub")
		public String deletelicenseSub(Model model) {
					model.addAttribute("title", "자격증 중분류 등록");
					
		return "admin/licenseSub/license_sub_delete";
		}
	
	
	
		// 자격증 중분류 정부 수정 처리
		@PostMapping("/modifylicenseSub")
		public String modifylicenseSub(LicenseSub LicenseSub) {
				
				return "";
			}
		
		
		// 자격증 중분류 정보 수정 화면
		@GetMapping("/modifylicenseSub")
		public String modifylicenseSub(Model model) {
				model.addAttribute("title", "자격증 중분류 등록");
				
			return "admin/licenseSub/license_sub_modify";
			}
		
	
		// 자격증 중분류 정부 등록 처리
		@PostMapping("/addlicenseSub")
		public String addlicenseSub(LicenseSub LicenseSub) {
			
			return "";
		}
	
	
		// 자격증 중분류 정보 등록 화면
		@GetMapping("/addlicenseSub")
		public String addlicenseSub(Model model) {
			model.addAttribute("title", "자격증 중분류 등록");
			
			return "admin/licenseSub/license_sub_insert";
			
		}
	
	
		// 자격증 중분류 목록 조회
		@GetMapping("/licenseSubList")
		public String licenseSubList(Model model) {
			
			List<LicenseSub> licenseSubList = licenseSubService.LicenseSubList();
			
			model.addAttribute("title", "자격증 중분류 조회");
			model.addAttribute("licenseSubList", licenseSubList);
			
			return "admin/licenseSub/license_sub_list";
			
	}
	

}
