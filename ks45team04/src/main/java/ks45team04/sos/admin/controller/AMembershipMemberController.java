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

import ks45team04.sos.admin.dto.MembershipMember;
import ks45team04.sos.admin.mapper.AdminMembershipMemberMapper;
import ks45team04.sos.admin.service.MembershipMemberService;


@Controller
public class AMembershipMemberController {

	private final MembershipMemberService membershipMemberService;
	private final AdminMembershipMemberMapper membershipMemberMapper; 
	
	public AMembershipMemberController(@Qualifier("adminMembershipMemberService") MembershipMemberService membershipMemberService,
													AdminMembershipMemberMapper membershipMemberMapper) {
		this.membershipMemberService = membershipMemberService;
		this.membershipMemberMapper = membershipMemberMapper;
	}

	private static final Logger log = LoggerFactory.getLogger(AMembershipMemberController.class);


	@GetMapping("/totalMembershipPeriod")
	public String totalmembershipPeriod(Model model) {
		model.addAttribute("title", "전체 회원 멤버십 남은 기간 조회");
		return  "admin/membershipMember/total_membership_period";
	}

	
	
	//멤버십 회원 정보 수정 처리
	@PostMapping("/totalModifyMembershipMemberInfo")
	public String modifyMembershipMemberInfo(MembershipMember membership) {
		
		membershipMemberService.modifyMembershipMemberInfo(membership);
		
		return "redirect:/totalMembershipMemberList";
	}
	
	
	//멤버십 회원 상세 조회 화면
	@GetMapping("/totalModifyMembershipMemberInfo")
	public String totalMembershipMemberInfo(@RequestParam(value="mmId") String mmId
			, Model model) {
		MembershipMember totalMembershipMemberInfo = membershipMemberService.getTotalMembershipInfo(mmId);
	
		model.addAttribute("title", "상세 멤버십 회원 조회");
		model.addAttribute("totalMembershipMemberInfo", totalMembershipMemberInfo);
		return "admin/membershipMember/total_modify_membership_member_info";
	}
	
	
	// 멤버십 회원 조회
	@GetMapping("/totalMembershipMemberList")
	public String TotalMembershipMemberList(Model model
			,@RequestParam(value="searchKey", required = false)String searchKey
			,@RequestParam(value="searchValue", required = false, defaultValue="") String
			searchValue) {		
		
		List<MembershipMember> totalMembershipMemberList = membershipMemberService.TotalMembershipMemberList(searchKey, searchValue);
		
		model.addAttribute("title", "멤버십 회원 조회");
		model.addAttribute("totalMembershipMemberList", totalMembershipMemberList);
		
		log.info("totalMembershipMemberList : {}", totalMembershipMemberList);
		
		return "admin/membershipMember/total_membership_member_list";
	}	
	
}
