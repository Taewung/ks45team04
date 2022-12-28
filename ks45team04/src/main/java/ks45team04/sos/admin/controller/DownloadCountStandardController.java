package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DownloadCountStandardController {

	@GetMapping("/dwonloadCountStandardDelete")
	public String dwonloadCountStandardDelete(Model model) {
		model.addAttribute("title", "다운로드횟수기준삭제");
		return "admin/noteDownloadCountStandard/dwonload_count_standard_delete";
	}
	@GetMapping("/dwonloadCountStandardInsert")
	public String dwonloadCountStandardInsert(Model model) {
		model.addAttribute("title", "다운로드횟수기준등록");
		return "admin/noteDownloadCountStandard/dwonload_count_standard_insert";
	}
	@GetMapping("/dwonloadCountStandardList")
	public String dwonloadCountStandardList(Model model) {
		model.addAttribute("title", "다운로드횟수기준목록");
		return "admin/noteDownloadCountStandard/dwonload_count_standard_list";
	}
	@GetMapping("/dwonloadCountStandardModify")
	public String dwonloadCountStandardModify(Model model) {
		model.addAttribute("title", "다운로드횟수기준수정");
		return "admin/noteDownloadCountStandard/dwonload_count_standard_modify";
	}
	@GetMapping("/dwonloadCountStandard")
	public String dwonloadCountStandard(Model model) {
		model.addAttribute("title", "다운로드횟수기준");
		return "admin/noteDownloadCountStandard/dwonload_count_standard";
	}
}
