package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks45team04.sos.admin.dto.Membership;
import ks45team04.sos.admin.mapper.AdminMembershipMapper;
import ks45team04.sos.admin.service.MembershipService;

@Controller
public class AMembershipController {
	
private final MembershipService membershipService;
private final AdminMembershipMapper membershipMapper;

public AMembershipController(@Qualifier("adminMembershipService") MembershipService membershipService,
							AdminMembershipMapper membershipMapper) {
		this.membershipService = membershipService;
		this.membershipMapper = membershipMapper;
}

private static final Logger log = LoggerFactory.getLogger(AMembershipController.class);
	
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
		List<Membership> membershipList = membershipService.MembershipList();
		model.addAttribute("title", "멤버십 조회");
		model.addAttribute("membershipList", membershipList);
		log.info("membershipList : {}", membershipList);
		return  "admin/membership/membership_list";		
	}
	
	public AdminMembershipMapper getMembershipMapper() {
		return membershipMapper;
	}
	
	
}