package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseSubjectController {

	@GetMapping("/licenseSubjectDelete")
	public String licenseSubjectDelete(Model model) {
		model.addAttribute("title", "자격증과목삭제");
		return "admin/licenseSubject/license_subject_delete";
	}
	@GetMapping("/licenseSubjectDetail")
	public String licenseSubjectDetail(Model model) {
		model.addAttribute("title", "자격증과목상세");
		return "admin/licenseSubject/license_subject_detail";
	}
	@GetMapping("/licenseSubjectInsert")
	public String licenseSubjectInsert(Model model) {
		model.addAttribute("title", "자격증과목등록");
		return "admin/licenseSubject/license_subject_insert";
	}
	@GetMapping("/licenseSubjectList")
	public String licenseSubjectList(Model model) {
		model.addAttribute("title", "자격증과목목록");
		return "admin/licenseSubject/license_subject_list";
	}
	@GetMapping("/licenseSubjectModify")
	public String licenseSubjectModify(Model model) {
		model.addAttribute("title", "자격증과목수정");
		return "admin/licenseSubject/license_subject_modify";
	}
}
