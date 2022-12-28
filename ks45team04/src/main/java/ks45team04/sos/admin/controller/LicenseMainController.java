package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseMainController {

	@GetMapping("/licenseMainDelete")
	public String licenseMainDelete(Model model) {
		model.addAttribute("title", "자격증대분류삭제");
		return "admin/licenseMain/license_main_delete";
	}
	@GetMapping("/licenseMainInsert")
	public String licenseMainInsert(Model model) {
		model.addAttribute("title", "자격증대분류등록");
		return "admin/licenseMain/license_main_insert";
	}
	@GetMapping("/licenseMainList")
	public String licenseMainList(Model model) {
		model.addAttribute("title", "자격증대분류목록");
		return "admin/licenseMain/license_main_list";
	}
	@GetMapping("/licenseMainModify")
	public String licenseMainModify(Model model) {
		model.addAttribute("title", "자격증대분류수정");
		return "admin/licenseMain/license_main_modify";
	}
}
