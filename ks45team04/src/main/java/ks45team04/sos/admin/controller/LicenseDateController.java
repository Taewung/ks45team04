package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LicenseDateController {

	@GetMapping("/licenseDateDelete")
	public String licenseDateDelete(Model model) {
		model.addAttribute("title", "자격증일정삭제");
		return "admin/licenseDate/license_date_delete";
	}
	@GetMapping("/licenseDateDetail")
	public String licenseDateDetail(Model model) {
		model.addAttribute("title", "자격증일정상세");
		return "admin/licenseDate/license_date_detail";
	}
	@GetMapping("/licenseDateInsert")
	public String licenseDateInsert(Model model) {
		model.addAttribute("title", "자격증일정등록");
		return "admin/licenseDate/license_date_insert";
	}
	@GetMapping("/licenseDateList")
	public String licenseDateList(Model model) {
		model.addAttribute("title", "자격증일정목록");
		return "admin/licenseDate/license_date_list";
	}
	@GetMapping("/licenseDateModify")
	public String licenseDateModify(Model model) {
		model.addAttribute("title", "자격증일정수정");
		return "admin/licenseDate/license_date_modify";
	}
}
