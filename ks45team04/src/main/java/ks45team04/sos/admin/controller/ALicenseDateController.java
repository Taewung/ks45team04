package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks45team04.sos.admin.dto.LicenseDate;

@Controller
public class ALicenseDateController {

			// 자격증 일정 삭제 처리
			@PostMapping("/deletelicenseDate")
			public String deletelicenseDate(LicenseDate LicenseDate) {
					
				return "";
			}
			
			// 자격증 일정 삭제 화면
			@GetMapping("/deletelicenseDate")
			public String deletelicenseDate(Model model) {
				model.addAttribute("title", "자격증 일정 삭제");
				
				return "admin/licenseDate/license_date_delete";
			}
	
	
			//자격증 일정 수정 처리
			@PostMapping("/modifylicenseDate")
			public String modifylicenseDate(LicenseDate LicenseDate) {
					
				return "";
			}
				
			// 자격증 일정 수정 화면
			@GetMapping("/modifylicenseDate")
			public String modifylicenseDate(Model model) {
				model.addAttribute("title", "자격증 일정 수정");
					
				return "admin/licenseDate/license_date_modify";
			}
			
	
	
			//자격증 일정 등록 처리
			@PostMapping("/addlicenseDate")
			public String addlicenseDate(LicenseDate licenseDate) {
				
				return "";
			}
			
			// 자격증 일정 등록 화면
			@GetMapping("/addlicenseDate")
			public String addlicenseDate(Model model) {
				model.addAttribute("title", "자격증 일정 등록");
				
				return "admin/licenseDate/license_date_insert";
			}

	
			// 자격증 일정 조회
			@GetMapping("/licenseDateList")
			public String licenseDateList(Model model) {
				model.addAttribute("title", "자격증 일정 조회");
						
				return "admin/licenseDate/license_date_list.html";
			}

}