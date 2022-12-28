package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AENWManagement {

	@GetMapping("/examComponentMain")
	public String examComponentMain(Model model) {
		model.addAttribute("title", "시험요소관리메인화면");
		return "admin/enwManagement/exam_component_main";
	}
}
