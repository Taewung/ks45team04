package ks45team04.sos.admin.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

import ks45team04.sos.admin.dto.LicenseMain;
import ks45team04.sos.admin.mapper.LicenseMainMapper;
import ks45team04.sos.admin.service.LicenseMainService;

@Controller
public class ALicenseMainController {
	
private final LicenseMainService licenseMainService;
private final LicenseMainMapper licenseMainMapper;
	
	public ALicenseMainController(LicenseMainService licenseMainService
								 ,LicenseMainMapper licenseMainMapper) {
		
		this.licenseMainService = licenseMainService;
		this.licenseMainMapper = licenseMainMapper;
		
	}
	
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
		
		licenseMainService.modifyLicenseMain(LicenseMain);
		
		return "redirect:/licenseMainList";
	}


	// 자격증 대분류 수정 화면
	@GetMapping("/modifylicenseMain")
	public String modifylicenseMain(@RequestParam(value="lmcCode") String lmcCode
									,Model model) {
		
		LicenseMain licenseMain = licenseMainService.getLicenseMainInfoByCode(lmcCode);
		
		model.addAttribute("title", "자격증 대분류 정보 수정");
		model.addAttribute("licenseMainInfo", licenseMain);
		
		return "admin/licenseMain/license_main_modify";
	}
	
	
	// 관리자 아이디 인증
	@GetMapping("/idCheck")
	@ResponseBody
	public boolean idCheck(@RequestParam(value="inputId") String inputId) {
		
		boolean isChecked = licenseMainMapper.getIdCheck(inputId);
		
		return isChecked;
	}
	
	
	//자격증 대분류 등록 처리
	@PostMapping("/addlicenseMain")
	public String addlicenseMain(LicenseMain LicenseMain) {
		System.out.println(LicenseMain);
		
		licenseMainService.addLicenseMain(LicenseMain);
		
		
		return "redirect:/licenseMainList";
	}
	
	
	// 자격증 대분류 등록 화면
	@GetMapping("/addlicenseMain")
	public String addlicenseMain(Model model) {
		
		List<LicenseMain> licenseMainList = licenseMainMapper.LicenseMainList();
		
		model.addAttribute("title", "자격증 대분류 정보 등록");
		model.addAttribute("licenseMainList", licenseMainList);
		
		return "admin/licenseMain/license_main_insert";
	}
	
	
	// 자격증 대분류 정보 조회
	@GetMapping("/licenseMainList")
	public String licenseMainList(Model model) {
		
		List<LicenseMain> licenseMainList = licenseMainService.LicenseMainList();
		
		model.addAttribute("title", "자격증 대분류 조회");
		model.addAttribute("licenseMainList", licenseMainList);
		
		
		
		return "admin/licenseMain/license_main_list";
		
	}
	
	

}
