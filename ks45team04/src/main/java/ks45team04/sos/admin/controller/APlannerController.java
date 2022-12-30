package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class APlannerController {
	
		//일정 조회
		@GetMapping("/listPlanner")
		public String listPlanner(Model model) {
			model.addAttribute("title", "일정 조회");
			return "admin/planner/planner_list";
			}
		
}
