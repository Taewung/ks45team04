package ks45team04.sos.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	

	//회원가입 처리
	@PostMapping("/addMembership")
	public String addMembership(Membership membership) {
		
		membershipService.addMembership(membership);
		
		log.info("멤버십 추가 : {}", membership);	
		
		return "redirect:/membershipList";
	}

	//회원가입 화면
	@GetMapping("/addMembership")
	public String addMembership(Model model) {
		List<Membership> getMemberShipList = membershipService.getMemberShipList();
		
		model.addAttribute("title", "멤버십 등록 화면");
		model.addAttribute("getMemberShipList", getMemberShipList);
		
		return  "admin/membership/add_membership";		
	}

	@GetMapping("/removeMembership")
	public String removeMembership(Model model) {
		model.addAttribute("title", "멤버십 수정 화면");
		return  "admin/membership/remove_membership";		
	}	

	
	//특정 멤버십 정보 수정 처리
	@PostMapping("/totalModifyMembershipInfo")
	public String modifyMembershipInfo(Membership membership) {

	membershipService.modifyMembershipInfo(membership);
	
	return "redirect:/membershipList";
}

	//특정 멤버십 정보 수정 화면
	@GetMapping("/totalModifyMembershipInfo")
	public String modifyMembershipInfo(@RequestParam(value="membershipCode") String membershipCode
					,Model model) {
		Membership membership = membershipService.getTotalMembershipInfo(membershipCode);

		model.addAttribute("title", "특정 멤버십 정보 수정");
		model.addAttribute("totalModifyMembershipInfo", membership);
		
		return "admin/membership/total_modify_membership_info";
	
	}	
	
	//상세 멤버십 조회 화면
	@GetMapping("totalMembershipInfo")
	public String totalMembershipInfo(@RequestParam(value="membershipCode") String membershipCode
									,Model model) {
		Membership totalMembershipInfo = membershipService.getTotalMembershipInfo(membershipCode);
		
		model.addAttribute("title", "상세 멤버십 조회");
		model.addAttribute("totalMembershipInfo", totalMembershipInfo);
		
		return "admin/membership/total_membership_info";
	}

	
	//멤버십 목록 조회
	@GetMapping("/membershipList")
	public String membershipList(Model model
			,@RequestParam(value="searchKey", required = false)String searchKey
			,@RequestParam(value="searchValue", required = false, defaultValue="") String
			searchValue) {			
			
		List<Membership> membershipList = membershipService.MembershipList(searchKey, searchValue);
		model.addAttribute("title", "멤버십 조회");
		model.addAttribute("membershipList", membershipList);
		log.info("membershipList : {}", membershipList);
		return  "admin/membership/membership_list";		
	}
	
	public AdminMembershipMapper getMembershipMapper() {
		return membershipMapper;
	}
	
	
}