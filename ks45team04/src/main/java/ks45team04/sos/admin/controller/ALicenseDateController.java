package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseDate;
import ks45team04.sos.admin.mapper.LicenseDateMapper;
import ks45team04.sos.admin.service.LicenseDateService;

@Controller
public class ALicenseDateController {
	
private final LicenseDateService licenseDateService;
private final LicenseDateMapper licenseDateMapper;

	public ALicenseDateController(LicenseDateService licenseDateService
								 ,LicenseDateMapper licenseDateMapper) {
		
		this.licenseDateService = licenseDateService;
		this.licenseDateMapper = licenseDateMapper;
	}

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
			
			// 관리자 아이디 인증
			@GetMapping("/ldCheck")
			@ResponseBody
			public boolean ldCodeCheck(@RequestParam(value="inputId") String inputId) {
				
				boolean isChecked = licenseDateMapper.getIdCheck(inputId);
				
				return isChecked;
			}
	
	
			//자격증 일정 등록 처리
			@PostMapping("/addlicenseDate")
			public String addlicenseDate(LicenseDate licenseDate) {
				
				licenseDateService.addLicenseDate(licenseDate);
				
				return "redirect:/licenseDateList";
			}
			
			// 자격증 일정 등록 화면
			@GetMapping("/addlicenseDate")
			public String addlicenseDate(Model model) {
				
				List<LicenseDate> licenseDateList = licenseDateMapper.LicenseDateList();
				
				model.addAttribute("title", "자격증 일정 등록");
				model.addAttribute("licenseDateList", licenseDateList);
				
				return "admin/licenseDate/license_date_insert";
			}

	
			// 자격증 일정 조회
			@GetMapping("/licenseDateList")
			public String licenseDateList(Model model) {		
				List<LicenseDate> licenseDateList = licenseDateService.licenseDateList();
				
				model.addAttribute("title", "자격증 일정 조회");
				model.addAttribute("licenseDateList", licenseDateList);
					
				return "admin/licenseDate/license_date_list.html";
			}

}
