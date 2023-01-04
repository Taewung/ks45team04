package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks45team04.sos.admin.dto.Member;
import ks45team04.sos.admin.mapper.adminMemberMapper;
import ks45team04.sos.admin.service.MemberService;

@Controller
public class AMemberController {
	
private final MemberService memberService;
private final adminMemberMapper memberMapper;

public AMemberController(MemberService memberService,
						adminMemberMapper membermapper) {
	this.memberService = memberService;
	this.memberMapper = membermapper;
}
	
	@GetMapping("/totalMemberList")
	public String totalMemberList(Model model) {
		
		List<Member> totalMemberList = memberService.TotalMemberList();		
		model.addAttribute("title", "회원 전체 정보 조회");
		model.addAttribute("totalMemberList", totalMemberList);
		
		return  "admin/adminMember/total_member_list";		
	}

	@GetMapping("/memberSavePoint")
	public String memberSavePoint(Model model) {
		model.addAttribute("title", "회원가입 포인트 지급");
		return  "admin/adminMember/member_save_point";		
	}	
	
	@GetMapping("/totalRemoveMember")
	public String totalRemoveMember(Model model) {
		model.addAttribute("title", "회원 삭제");
		return  "admin/adminMember/total_remove_member";		
	}		
	
}