package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.dto.LicenseSub;
import ks45team04.sos.admin.mapper.LicenseSubMapper;
import ks45team04.sos.admin.service.LicenseSubService;

@Controller
public class ALicenseSubController {
	
private final LicenseSubService licenseSubService;
private final LicenseSubMapper licenseSubMapper;


	public ALicenseSubController(LicenseSubService licenseSubService
								,LicenseSubMapper licenseSubMapper) {
		
		this.licenseSubService = licenseSubService;
		this.licenseSubMapper = licenseSubMapper;
	}
	
	
		// 자격증 중분류 정보 삭제 처리
		@PostMapping("/deletelicenseSub")
		public String deletelicenseSub(LicenseSub LicenseSub) {
				
		return "redirect:/";
		}
			
			
		// 자격증 중분류 정보 삭제 화면
		@GetMapping("/deletelicenseSub")
		public String deletelicenseSub(Model model) {
					model.addAttribute("title", "자격증 중분류 등록");
					
		return "admin/licenseSub/license_sub_delete";
		}
	
	
	
		// 자격증 중분류 정부 수정 처리
		@PostMapping("/modifylicenseSub")
		public String modifylicenseSub(LicenseSub licenseSub) {
			System.out.println(licenseSub);
			
			licenseSubService.modifyLicenseSub(licenseSub);
				
				return "redirect:/licenseSubList";
			}
		
		
		// 자격증 중분류 정보 수정 화면
		@GetMapping("/modifylicenseSub")
		public String modifylicenseSub(@RequestParam(value="lscCode") String lscCode
									  ,Model model) {
			
			LicenseSub licenseSub = licenseSubService.getLicenseSubInfoByCode(lscCode);
			
			model.addAttribute("title", "자격증 중분류 등록");
			model.addAttribute("licenseSubInfo", licenseSub);
				
			return "admin/licenseSub/license_sub_modify";
			}
		
		//관리자 아이디 인증
		@GetMapping("/lscIdCheck")
		@ResponseBody
		public boolean idCheck(@RequestParam(value="inputId") String inputId) {
			
			boolean isChecked = licenseSubMapper.getIdCheck(inputId);
			
			return isChecked;
		}
		
		
		// 자격증 중분류 정부 등록 처리
		@PostMapping("/addlicenseSub")
		public String addlicenseSub(LicenseSub LicenseSub) {
			
			licenseSubService.addLicenseSub(LicenseSub);
			
			return "redirect:/licenseSubList";
		}
	
	
		// 자격증 중분류 정보 등록 화면
		@GetMapping("/addlicenseSub")
		public String addlicenseSub(Model model) {
			
			List<LicenseSub> licenseSubList = licenseSubMapper.LicenseSubList();
			List<LicenseMain> licenseMainList = licenseSubService.licenseMainList();
			System.out.println(licenseMainList);
			
			model.addAttribute("title", "자격증 중분류 등록");
			model.addAttribute("licenseSubList", licenseSubList);
			model.addAttribute("licenseMainList", licenseMainList);
			
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
