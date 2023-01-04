package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.LicenseSubject;
import ks45team04.sos.admin.mapper.LicenseSubjectMapper;
import ks45team04.sos.admin.service.LicenseSubService;
import ks45team04.sos.admin.service.LicenseSubjectService;

@Controller
public class ALicenseSubjectController {
	
	private final LicenseSubjectService licenseSubjectService;
	private final LicenseSubjectMapper licenseSubjectMapper;

	public ALicenseSubjectController(LicenseSubjectService licenseSubjectService
									,LicenseSubjectMapper licenseSubjectMapper) {
		
		
		this.licenseSubjectService = licenseSubjectService;
		this.licenseSubjectMapper = licenseSubjectMapper;
	}

	// 자격증 과목 삭제 처리
	@PostMapping("/deletelicenseSubject")
	public String deletelicenseSubject(LicenseSubject LicenseSubject) {
		
		return "";
	}
	
	// 자격증 과목 삭제 화면
	@GetMapping("/deletelicenseSubject")
	public String deletelicenseSubject(Model model) {
		model.addAttribute("title", "자격증 과목 삭제");
			
		return "admin/licenseSubject/license_subject_delete";
	}


	// 자격증 과목 수정 처리
	@PostMapping("/modifylicenseSubject")
	public String modifylicenseSubject(LicenseSubject LicenseSubject) {
		
		return "";
	}
	
	// 자격증 과목 수정 화면
	@GetMapping("/modifylicenseSubject")
	public String modifylicenseSubject(Model model) {
		model.addAttribute("title", "자격증 과목 수정");
			
		return "admin/licenseSubject/license_subject_modify";
	}
	
	//관리자 아이디 인증
	@GetMapping("/lsIdCheck")
	@ResponseBody
	public boolean idCheck(@RequestParam(value="inputId") String inputId) {
		
		boolean isChecked = licenseSubjectMapper.getIdCheck(inputId);
		
		return isChecked;
	}


	// 자격증 과목 등록 처리
	@PostMapping("/addlicenseSubject")
	public String addlicenseSubject(LicenseSubject LicenseSubject) {
		
		licenseSubjectService.addLicenseSubject(LicenseSubject);
		return "redirect:/licenseSubjectList";
	}

	
	// 자격증 과목 등록 화면
	@GetMapping("/addlicenseSubject")
	public String addlicenseSubject(Model model) {
		
		List<LicenseSubject> licenseSubject = licenseSubjectMapper.LicenseSubjectList();
		
		model.addAttribute("title", "자격증 과목 등록");
		model.addAttribute("licenseSubject", licenseSubject);
		
		return "admin/licenseSubject/license_subject_insert";
	}

	// 자격증 과목 조회
	@GetMapping("/licenseSubjectList")
	public String licenseSubjectList(Model model) {
		
		List<LicenseSubject> licenseSubjectList = licenseSubjectService.LicenseSubjectList();
		
		model.addAttribute("title", "자격증 과목 조회");
		model.addAttribute("licenseSubjectList", licenseSubjectList);
		
		return "admin/licenseSubject/license_subject_list";
		
	}
	
}
