package ks45team04.sos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AMembershipController {
	
	@GetMapping("/addMembership")
	public String addMembership(Model model) {
		model.addAttribute("title", "멤버십 등록 화면");
		return  "admin/membership/add_membership";		
	}

	@GetMapping("/modifyMembership")
	public String modifyMembership(Model model) {
		model.addAttribute("title", "멤버십 수정 화면");
		return  "admin/membership/modify_membership";		
	}	

	@GetMapping("/removeMembership")
	public String removeMembership(Model model) {
		model.addAttribute("title", "멤버십 수정 화면");
		return  "admin/membership/remove_membership";		
	}	

	@GetMapping("/membershipList")
	public String membershipList(Model model) {
		model.addAttribute("title", "멤버십 조회");
		return  "admin/membership/membership_list";		
	}		
	
}