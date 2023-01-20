package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.Member;
import ks45team04.sos.admin.mapper.AdminMemberMapper;
import ks45team04.sos.admin.service.MemberService;

@Controller
public class AMemberController {
	
private final MemberService memberService;
private final AdminMemberMapper memberMapper;

public AMemberController(@Qualifier("adminMemberService") MemberService memberService,
						AdminMemberMapper membermapper) {
	this.memberService = memberService;
	this.memberMapper = membermapper;
}

	//특정 회원 정보 수정 처리
	@PostMapping("/totalModifyMemberInfo")
	public String modifyMemberInfo(Member member) {
		
		memberService.modifyMemberInfo(member);
		
		return "redirect:/totalMemberList";
	}


	//특정 회원 정보 수정 화면
	@GetMapping("/totalModifyMemberInfo")
	public String modifyMemberInfo(@RequestParam(value="memId") String memId
							,Model model) {
		Member member = memberService.getTotalMemberInfo(memId);
		
		model.addAttribute("title", "특정 회원 정보 수정");
		model.addAttribute("totalModifyMemberInfo", member);
		
		return "admin/adminMember/total_modify_member_info";
		
	}


	//특정 회원 상세 조회 화면
	@GetMapping("/totalMemberInfo")
	public String totalMemberInfo(@RequestParam(value="memId") String memId 
			,Model model) {
		
		Member totalMemberInfo = memberService.getTotalMemberInfo(memId);

		model.addAttribute("title", "상세 회원 조회");
		model.addAttribute("totalMemberInfo", totalMemberInfo);

		return "admin/adminMember/total_member_info";		
	}


	//회원 목록 조회
	@GetMapping("/totalMemberList")
	public String totalMemberList(Model model
									,@RequestParam(value="searchKey", required = false)String searchKey
									,@RequestParam(value="searchValue", required = false, defaultValue="") String
									searchValue) {

		List<Member> totalMemberList = memberService.TotalMemberList(searchKey, searchValue);		
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

	public AdminMemberMapper getMemberMapper() {
		return memberMapper;
	}		
	
}