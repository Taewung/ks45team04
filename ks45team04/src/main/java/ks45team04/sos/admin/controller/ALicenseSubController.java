package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.admin.dto.LicenseSub;

@Controller
public class ALicenseSubController {
	
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
			model.addAttribute("title", "자격증 중분류 조회");
			
			return "admin/licenseSub/license_sub_list";
			
	}
	

}
