package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseSubController {

	@GetMapping("/licenseSubDelete")
	public String licenseSubDelete(Model model) {
		model.addAttribute("title", "자격증중분류삭제");
		return "admin/licenseSub/license_sub_delete";
	}
	@GetMapping("/licenseSubInsert")
	public String licenseSubInsert(Model model) {
		model.addAttribute("title", "자격증중분류등록");
		return "admin/licenseSub/license_sub_insert";
	}
	@GetMapping("/licenseSubList")
	public String licenseSubList(Model model) {
		model.addAttribute("title", "자격증중분류목록");
		return "admin/licenseSub/license_sub_list";
	}
	@GetMapping("/licenseSubModify")
	public String licenseSubModify(Model model) {
		model.addAttribute("title", "자격증중분류수정");
		return "admin/licenseSub/license_sub_modify";
	}
}
