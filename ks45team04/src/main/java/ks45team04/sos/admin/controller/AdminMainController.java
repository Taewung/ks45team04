package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminMainController {
	
	@GetMapping("/main")
	public String adminMain(Model model) {
		return "admin/layout/adminDefault";
	}
}
