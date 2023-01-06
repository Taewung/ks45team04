package ks45team04.sos.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.member.dto.MMember;
import ks45team04.sos.member.mapper.MMemberMapper;
import ks45team04.sos.member.service.MMemberService;

@Controller
public class MemberController {
	
	private final MMemberService memberService;
	private final MMemberMapper memberMapper;
	
public MemberController(MMemberService memberService,
						MMemberMapper membermapper) {
	this.memberService = memberService;
	this.memberMapper = membermapper;
}

	//아이디 중복체크
	@GetMapping("/checkId")
	@ResponseBody
	public boolean checkMemberId(@RequestParam(value="memId") String memId) {
		boolean isChecked = false;
		
		isChecked=memberMapper.checkMemberId(memId);
		
		return isChecked;
	}

	//회원가입
	@PostMapping("/addMember")
	public String addMember(MMember member) {
	memberService.addMember(member);
	
	return "redirect:/member/memberList";
	}
	//회원가입
	@GetMapping("/addMember")
	public String addMember(Model model) {
		
		model.addAttribute("title", "회원 가입");
		
		return  "member/member/add_member";		
	}	

	@GetMapping("/modifyMember")
	public String modifyMember(Model model) {
		model.addAttribute("title", "회원 정보 수정");
		return  "member/member/modify_member";		
	}	
	
	@GetMapping("/removeMember")
	public String removeMember(Model model) {
		model.addAttribute("title", "회원 탈퇴");
		return  "member/member/remove_member";		
	}		

	@GetMapping("/memberList")
	public String memberList(Model model) {
		
		List<MMember> memberList = memberService.MemberList();
		model.addAttribute("title", "회원 개인 정보 조회");
		model.addAttribute("memberList", memberList);
		return  "member/member/member_list";		
	}
	
	@GetMapping("/findId")
	public String findId(Model model) {
		model.addAttribute("title", "아이디 찾기");
		return  "member/member/find_id";		
	}
	
	@GetMapping("/findPw")
	public String findPw(Model model) {
		model.addAttribute("title", "비밀번호 찾기");
		return  "member/member/find_pw";		
	}
	
	@GetMapping("/findIdResult")
	public String findIdResult(Model model) {
		model.addAttribute("title", "아이디 찾기 결과");
		return  "member/member/find_id_result";		
	}
	
	@GetMapping("/findPwResult")
	public String findPwResult(Model model) {
		model.addAttribute("title", "비밀번호 찾기 결과");
		return  "member/member/find_pw_result";		
	}	
	
}