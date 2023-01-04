package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseInfo;
import ks45team04.sos.admin.mapper.LicenseInfoMapper;
import ks45team04.sos.admin.service.LicenseInfoService;


@Controller
public class ALicenseInfoController {
	
private final LicenseInfoService licenseInfoService;
private final LicenseInfoMapper licenseInfoMapper;
	
	public ALicenseInfoController(LicenseInfoService licenseInfoService
								 ,LicenseInfoMapper licenseInfoMapper) {
		
		this.licenseInfoService = licenseInfoService;
		this.licenseInfoMapper = licenseInfoMapper;
	}	
		
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
		
		// 관리자 아이디 인증
		@GetMapping("/liCodeCheck")
		@ResponseBody
		public boolean idCheck(@RequestParam(value="inputId") String inputId) {
			
			boolean isChecked = licenseInfoMapper.getIdCheck(inputId);
			
			return isChecked;
		}
		
		//자격증 정보 등록 처리
		@PostMapping("/addlicenseInfo")
		
		public String addlicenseInfo(LicenseInfo LicenseInfo) {
			
			licenseInfoService.addLicenseInfo(LicenseInfo);
			
			return "redirect:/licenseInofoList";
		}
		
		// 자격증 정보 등록 화면
		@GetMapping("/addlicenseInfo")
		public String addlicenseInfo(Model model) {
			
			List<LicenseInfo> licenseInfoList = licenseInfoMapper.LicenseInfoList();
			
			model.addAttribute("title", "자격증 정보 등록");
			model.addAttribute("licenseInfoList", licenseInfoList);
			
			return "admin/licenseInfo/license_info_insert";
		}
		
		// 자격증 정보 조회
		@GetMapping("/licenseInofoList")
		public String licenseInofoList(Model model) {
			
			List<LicenseInfo> licenseInfoList = licenseInfoService.LicenseInfoList();
			
			model.addAttribute("title", "자격증 정보 조회");
			model.addAttribute("licenseInfoList", licenseInfoList);
			
					
			
			return "admin/licenseInfo/license_info_list";
		}

}
