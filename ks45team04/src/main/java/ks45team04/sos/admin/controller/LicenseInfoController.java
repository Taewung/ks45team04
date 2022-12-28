package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseInfoController {

	@GetMapping("/licenseInfoDelete")
	public String licenseInfoDelete(Model model) {
		model.addAttribute("title", "자격증정보삭제");
		return "admin/licenseInfo/license_info_delete";
	}
	@GetMapping("/licenseInfoDetail")
	public String licenseInfoDetail(Model model) {
		model.addAttribute("title", "자격증정보상세");
		return "admin/licenseInfo/license_info_detail";
	}
	@GetMapping("/licenseInfoInsert")
	public String licenseInfoInsert(Model model) {
		model.addAttribute("title", "자격증정보등록");
		return "admin/licenseInfo/license_info_insert";
	}
	@GetMapping("/licenseInfoList")
	public String licenseInfoList(Model model) {
		model.addAttribute("title", "자격증정보목록");
		return "admin/licenseInfo/license_info_list";
	}
	@GetMapping("/licenseInfoModify")
	public String licenseInfoModify(Model model) {
		model.addAttribute("title", "자격증정보수정");
		return "admin/licenseInfo/license_info_modify";
	}
}
